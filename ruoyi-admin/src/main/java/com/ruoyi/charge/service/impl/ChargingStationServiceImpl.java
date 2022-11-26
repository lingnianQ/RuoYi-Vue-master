package com.ruoyi.charge.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ruoyi.charge.config.GlobalConstant;
import com.ruoyi.charge.domain.NearbyChargingStation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.*;
import org.springframework.data.redis.connection.RedisGeoCommands;
import org.springframework.data.redis.core.BoundGeoOperations;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingStationMapper;
import com.ruoyi.charge.domain.ChargingStation;
import com.ruoyi.charge.service.IChargingStationService;

/**
 * 充电站Service业务层处理
 *
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingStationServiceImpl implements IChargingStationService
{
    @Autowired
    private ChargingStationMapper chargingStationMapper;

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 查询充电站
     *
     * @param id 充电站主键
     * @return 充电站
     */
    @Override
    public ChargingStation selectChargingStationById(Integer id)
    {
        return chargingStationMapper.selectChargingStationById(id);
    }

    @Override
    public List<NearbyChargingStation> selectNearbyChargingStationList(double longitude, double latitude, double radius) {
        Point userPosition = new Point(longitude, latitude);
        Distance distance = new Distance(radius, Metrics.KILOMETERS);
        Circle circle = new Circle(userPosition, distance);

        RedisGeoCommands.GeoRadiusCommandArgs geoRadiusCommandArgs = RedisGeoCommands.GeoRadiusCommandArgs.newGeoRadiusArgs();
        geoRadiusCommandArgs.includeDistance();
        geoRadiusCommandArgs.includeCoordinates();

        BoundGeoOperations boundGeoOperations = redisTemplate.boundGeoOps(GlobalConstant.GEO_LIST);
        GeoResults<RedisGeoCommands.GeoLocation<String>> results = boundGeoOperations.radius(circle, geoRadiusCommandArgs);

        Iterator<GeoResult<RedisGeoCommands.GeoLocation<String>>> iterator = results.iterator();
        ArrayList<NearbyChargingStation> list = new ArrayList<>();

        BoundHashOperations boundHashOperations = redisTemplate.boundHashOps(GlobalConstant.STATION_HASH);

        while (iterator.hasNext()){

            GeoResult<RedisGeoCommands.GeoLocation<String>> geo = iterator.next();
            String stationId = geo.getContent().getName();
            double stationDistance = geo.getDistance().getValue();

            //从redis hash 取一个充电站
            ChargingStation chargingStation = (ChargingStation) boundHashOperations.get(stationId);
            NearbyChargingStation nearbyChargingStation = new NearbyChargingStation();
            BeanUtils.copyProperties(chargingStation,nearbyChargingStation);

            nearbyChargingStation.setDistance(stationDistance);

            list.add(nearbyChargingStation);

        }


        return list;
    }

    /**
     * 查询充电站列表
     *
     * @param chargingStation 充电站
     * @return 充电站
     */
    @Override
    public List<ChargingStation> selectChargingStationList(ChargingStation chargingStation)
    {
        return chargingStationMapper.selectChargingStationList(chargingStation);
    }

    /**
     * 新增充电站
     *
     * @param chargingStation 充电站
     * @return 结果
     */
    @Override
    public int insertChargingStation(ChargingStation chargingStation)
    {
        return chargingStationMapper.insertChargingStation(chargingStation);
    }

    /**
     * 修改充电站
     *
     * @param chargingStation 充电站
     * @return 结果
     */
    @Override
    public int updateChargingStation(ChargingStation chargingStation)
    {
        return chargingStationMapper.updateChargingStation(chargingStation);
    }

    /**
     * 批量删除充电站
     *
     * @param ids 需要删除的充电站主键
     * @return 结果
     */
    @Override
    public int deleteChargingStationByIds(Integer[] ids)
    {
        return chargingStationMapper.deleteChargingStationByIds(ids);
    }

    /**
     * 删除充电站信息
     *
     * @param id 充电站主键
     * @return 结果
     */
    @Override
    public int deleteChargingStationById(Integer id)
    {
        return chargingStationMapper.deleteChargingStationById(id);
    }
}
