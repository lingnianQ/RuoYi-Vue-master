package com.ruoyi.charge.mapper;

import java.util.List;
import com.ruoyi.charge.domain.ChargingOperatorInfo;

/**
 * 运营商Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface ChargingOperatorInfoMapper 
{
    /**
     * 查询运营商
     * 
     * @param id 运营商主键
     * @return 运营商
     */
    public ChargingOperatorInfo selectChargingOperatorInfoById(Integer id);

    /**
     * 查询运营商列表
     * 
     * @param chargingOperatorInfo 运营商
     * @return 运营商集合
     */
    public List<ChargingOperatorInfo> selectChargingOperatorInfoList(ChargingOperatorInfo chargingOperatorInfo);

    /**
     * 新增运营商
     * 
     * @param chargingOperatorInfo 运营商
     * @return 结果
     */
    public int insertChargingOperatorInfo(ChargingOperatorInfo chargingOperatorInfo);

    /**
     * 修改运营商
     * 
     * @param chargingOperatorInfo 运营商
     * @return 结果
     */
    public int updateChargingOperatorInfo(ChargingOperatorInfo chargingOperatorInfo);

    /**
     * 删除运营商
     * 
     * @param id 运营商主键
     * @return 结果
     */
    public int deleteChargingOperatorInfoById(Integer id);

    /**
     * 批量删除运营商
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingOperatorInfoByIds(Integer[] ids);
}
