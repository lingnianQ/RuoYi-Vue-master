package com.ruoyi.charge.mapper;

import java.util.List;
import com.ruoyi.charge.domain.ChargingBillProcess;

/**
 * 进行订单Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface ChargingBillProcessMapper 
{
    /**
     * 查询进行订单
     * 
     * @param id 进行订单主键
     * @return 进行订单
     */
    public ChargingBillProcess selectChargingBillProcessById(Integer id);

    /**
     * 查询进行订单列表
     * 
     * @param chargingBillProcess 进行订单
     * @return 进行订单集合
     */
    public List<ChargingBillProcess> selectChargingBillProcessList(ChargingBillProcess chargingBillProcess);

    /**
     * 新增进行订单
     * 
     * @param chargingBillProcess 进行订单
     * @return 结果
     */
    public int insertChargingBillProcess(ChargingBillProcess chargingBillProcess);

    /**
     * 修改进行订单
     * 
     * @param chargingBillProcess 进行订单
     * @return 结果
     */
    public int updateChargingBillProcess(ChargingBillProcess chargingBillProcess);

    /**
     * 删除进行订单
     * 
     * @param id 进行订单主键
     * @return 结果
     */
    public int deleteChargingBillProcessById(Integer id);

    /**
     * 批量删除进行订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingBillProcessByIds(Integer[] ids);
}
