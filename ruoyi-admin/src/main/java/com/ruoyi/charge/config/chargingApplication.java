package com.ruoyi.charge.config;

import com.ruoyi.charge.domain.ChargingStation;
import com.ruoyi.charge.service.IChargingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;

//方法在服务器启动后立即运行
@Component
public class chargingApplication {
    @Autowired
    IChargingStationService chargingStationService;

    @Autowired
    RedisTemplate redisTemplate;
    @PostConstruct
    public  void readStationWriteToRedis(){
        System.out.println("readStationWriteToRedis");
        //1,读取charging_station表中所有数据
        List<ChargingStation> chargingStationList = chargingStationService.selectChargingStationList(null);
        HashMap<String, Point> map = new HashMap<>();

        BoundHashOperations boundHashOperations = redisTemplate.boundHashOps(GlobalConstant.STATION_HASH);

        for (ChargingStation chargingStation:chargingStationList){
            double longitude = Double.parseDouble(chargingStation.getStationLng().toString());
            double latitude = Double.parseDouble(chargingStation.getStationLat().toString());
            String id=chargingStation.getId().toString();

            Point point = new Point(longitude, latitude);
            map.put(id,point);

            boundHashOperations.put(id,chargingStation);
        }
        redisTemplate.boundGeoOps(GlobalConstant.GEO_LIST).add(map);

    }
}

