package com.ruoyi.charge.mapper;

import java.util.List;
import com.ruoyi.charge.domain.ChargingPileInfo;

/**
 * 充电桩Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface ChargingPileInfoMapper 
{
    /**
     * 查询充电桩
     * 
     * @param id 充电桩主键
     * @return 充电桩
     */
    public ChargingPileInfo selectChargingPileInfoById(Integer id);

    /**
     * 查询充电桩列表
     * 
     * @param chargingPileInfo 充电桩
     * @return 充电桩集合
     */
    public List<ChargingPileInfo> selectChargingPileInfoList(ChargingPileInfo chargingPileInfo);

    /**
     * 新增充电桩
     * 
     * @param chargingPileInfo 充电桩
     * @return 结果
     */
    public int insertChargingPileInfo(ChargingPileInfo chargingPileInfo);

    /**
     * 修改充电桩
     * 
     * @param chargingPileInfo 充电桩
     * @return 结果
     */
    public int updateChargingPileInfo(ChargingPileInfo chargingPileInfo);

    /**
     * 删除充电桩
     * 
     * @param id 充电桩主键
     * @return 结果
     */
    public int deleteChargingPileInfoById(Integer id);

    /**
     * 批量删除充电桩
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingPileInfoByIds(Integer[] ids);
}
