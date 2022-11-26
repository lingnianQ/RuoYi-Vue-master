package com.ruoyi.charge.mapper;

import java.util.List;
import com.ruoyi.charge.domain.ChargingStation;

/**
 * 充电站Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface ChargingStationMapper 
{
    /**
     * 查询充电站
     * 
     * @param id 充电站主键
     * @return 充电站
     */
    public ChargingStation selectChargingStationById(Integer id);

    /**
     * 查询充电站列表
     * 
     * @param chargingStation 充电站
     * @return 充电站集合
     */
    public List<ChargingStation> selectChargingStationList(ChargingStation chargingStation);

    /**
     * 新增充电站
     * 
     * @param chargingStation 充电站
     * @return 结果
     */
    public int insertChargingStation(ChargingStation chargingStation);

    /**
     * 修改充电站
     * 
     * @param chargingStation 充电站
     * @return 结果
     */
    public int updateChargingStation(ChargingStation chargingStation);

    /**
     * 删除充电站
     * 
     * @param id 充电站主键
     * @return 结果
     */
    public int deleteChargingStationById(Integer id);

    /**
     * 批量删除充电站
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingStationByIds(Integer[] ids);
}
