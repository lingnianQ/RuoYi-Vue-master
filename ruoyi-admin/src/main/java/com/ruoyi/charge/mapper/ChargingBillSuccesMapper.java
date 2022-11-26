package com.ruoyi.charge.mapper;

import java.util.List;
import com.ruoyi.charge.domain.ChargingBillSucces;

/**
 * 成功订单Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface ChargingBillSuccesMapper 
{
    /**
     * 查询成功订单
     * 
     * @param id 成功订单主键
     * @return 成功订单
     */
    public ChargingBillSucces selectChargingBillSuccesById(Integer id);

    /**
     * 查询成功订单列表
     * 
     * @param chargingBillSucces 成功订单
     * @return 成功订单集合
     */
    public List<ChargingBillSucces> selectChargingBillSuccesList(ChargingBillSucces chargingBillSucces);

    /**
     * 新增成功订单
     * 
     * @param chargingBillSucces 成功订单
     * @return 结果
     */
    public int insertChargingBillSucces(ChargingBillSucces chargingBillSucces);

    /**
     * 修改成功订单
     * 
     * @param chargingBillSucces 成功订单
     * @return 结果
     */
    public int updateChargingBillSucces(ChargingBillSucces chargingBillSucces);

    /**
     * 删除成功订单
     * 
     * @param id 成功订单主键
     * @return 结果
     */
    public int deleteChargingBillSuccesById(Integer id);

    /**
     * 批量删除成功订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingBillSuccesByIds(Integer[] ids);
}
