package com.ruoyi.charge.mapper;

import java.util.List;
import com.ruoyi.charge.domain.ChargingBillFail;

/**
 * 失败订单Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface ChargingBillFailMapper 
{
    /**
     * 查询失败订单
     * 
     * @param id 失败订单主键
     * @return 失败订单
     */
    public ChargingBillFail selectChargingBillFailById(Integer id);

    /**
     * 查询失败订单列表
     * 
     * @param chargingBillFail 失败订单
     * @return 失败订单集合
     */
    public List<ChargingBillFail> selectChargingBillFailList(ChargingBillFail chargingBillFail);

    /**
     * 新增失败订单
     * 
     * @param chargingBillFail 失败订单
     * @return 结果
     */
    public int insertChargingBillFail(ChargingBillFail chargingBillFail);

    /**
     * 修改失败订单
     * 
     * @param chargingBillFail 失败订单
     * @return 结果
     */
    public int updateChargingBillFail(ChargingBillFail chargingBillFail);

    /**
     * 删除失败订单
     * 
     * @param id 失败订单主键
     * @return 结果
     */
    public int deleteChargingBillFailById(Integer id);

    /**
     * 批量删除失败订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingBillFailByIds(Integer[] ids);
}
