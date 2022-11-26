package com.ruoyi.charge.mapper;

import java.util.List;
import com.ruoyi.charge.domain.ChargingGunInfo;

/**
 * 充电枪Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface ChargingGunInfoMapper 
{
    /**
     * 查询充电枪
     * 
     * @param id 充电枪主键
     * @return 充电枪
     */
    public ChargingGunInfo selectChargingGunInfoById(Long id);

    /**
     * 查询充电枪列表
     * 
     * @param chargingGunInfo 充电枪
     * @return 充电枪集合
     */
    public List<ChargingGunInfo> selectChargingGunInfoList(ChargingGunInfo chargingGunInfo);

    /**
     * 新增充电枪
     * 
     * @param chargingGunInfo 充电枪
     * @return 结果
     */
    public int insertChargingGunInfo(ChargingGunInfo chargingGunInfo);

    /**
     * 修改充电枪
     * 
     * @param chargingGunInfo 充电枪
     * @return 结果
     */
    public int updateChargingGunInfo(ChargingGunInfo chargingGunInfo);

    /**
     * 删除充电枪
     * 
     * @param id 充电枪主键
     * @return 结果
     */
    public int deleteChargingGunInfoById(Long id);

    /**
     * 批量删除充电枪
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingGunInfoByIds(Long[] ids);
}
