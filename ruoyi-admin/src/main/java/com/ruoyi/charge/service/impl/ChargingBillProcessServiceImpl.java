package com.ruoyi.charge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingBillProcessMapper;
import com.ruoyi.charge.domain.ChargingBillProcess;
import com.ruoyi.charge.service.IChargingBillProcessService;

/**
 * 进行订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingBillProcessServiceImpl implements IChargingBillProcessService 
{
    @Autowired
    private ChargingBillProcessMapper chargingBillProcessMapper;

    /**
     * 查询进行订单
     * 
     * @param id 进行订单主键
     * @return 进行订单
     */
    @Override
    public ChargingBillProcess selectChargingBillProcessById(Integer id)
    {
        return chargingBillProcessMapper.selectChargingBillProcessById(id);
    }

    /**
     * 查询进行订单列表
     * 
     * @param chargingBillProcess 进行订单
     * @return 进行订单
     */
    @Override
    public List<ChargingBillProcess> selectChargingBillProcessList(ChargingBillProcess chargingBillProcess)
    {
        return chargingBillProcessMapper.selectChargingBillProcessList(chargingBillProcess);
    }

    /**
     * 新增进行订单
     * 
     * @param chargingBillProcess 进行订单
     * @return 结果
     */
    @Override
    public int insertChargingBillProcess(ChargingBillProcess chargingBillProcess)
    {
        chargingBillProcess.setCreateTime(DateUtils.getNowDate());
        return chargingBillProcessMapper.insertChargingBillProcess(chargingBillProcess);
    }

    /**
     * 修改进行订单
     * 
     * @param chargingBillProcess 进行订单
     * @return 结果
     */
    @Override
    public int updateChargingBillProcess(ChargingBillProcess chargingBillProcess)
    {
        return chargingBillProcessMapper.updateChargingBillProcess(chargingBillProcess);
    }

    /**
     * 批量删除进行订单
     * 
     * @param ids 需要删除的进行订单主键
     * @return 结果
     */
    @Override
    public int deleteChargingBillProcessByIds(Integer[] ids)
    {
        return chargingBillProcessMapper.deleteChargingBillProcessByIds(ids);
    }

    /**
     * 删除进行订单信息
     * 
     * @param id 进行订单主键
     * @return 结果
     */
    @Override
    public int deleteChargingBillProcessById(Integer id)
    {
        return chargingBillProcessMapper.deleteChargingBillProcessById(id);
    }
}
