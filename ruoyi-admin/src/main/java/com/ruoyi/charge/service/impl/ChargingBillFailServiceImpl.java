package com.ruoyi.charge.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingBillFailMapper;
import com.ruoyi.charge.domain.ChargingBillFail;
import com.ruoyi.charge.service.IChargingBillFailService;

/**
 * 失败订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingBillFailServiceImpl implements IChargingBillFailService 
{
    @Autowired
    private ChargingBillFailMapper chargingBillFailMapper;

    /**
     * 查询失败订单
     * 
     * @param id 失败订单主键
     * @return 失败订单
     */
    @Override
    public ChargingBillFail selectChargingBillFailById(Integer id)
    {
        return chargingBillFailMapper.selectChargingBillFailById(id);
    }

    /**
     * 查询失败订单列表
     * 
     * @param chargingBillFail 失败订单
     * @return 失败订单
     */
    @Override
    public List<ChargingBillFail> selectChargingBillFailList(ChargingBillFail chargingBillFail)
    {
        return chargingBillFailMapper.selectChargingBillFailList(chargingBillFail);
    }

    /**
     * 新增失败订单
     * 
     * @param chargingBillFail 失败订单
     * @return 结果
     */
    @Override
    public int insertChargingBillFail(ChargingBillFail chargingBillFail)
    {
        return chargingBillFailMapper.insertChargingBillFail(chargingBillFail);
    }

    /**
     * 修改失败订单
     * 
     * @param chargingBillFail 失败订单
     * @return 结果
     */
    @Override
    public int updateChargingBillFail(ChargingBillFail chargingBillFail)
    {
        return chargingBillFailMapper.updateChargingBillFail(chargingBillFail);
    }

    /**
     * 批量删除失败订单
     * 
     * @param ids 需要删除的失败订单主键
     * @return 结果
     */
    @Override
    public int deleteChargingBillFailByIds(Integer[] ids)
    {
        return chargingBillFailMapper.deleteChargingBillFailByIds(ids);
    }

    /**
     * 删除失败订单信息
     * 
     * @param id 失败订单主键
     * @return 结果
     */
    @Override
    public int deleteChargingBillFailById(Integer id)
    {
        return chargingBillFailMapper.deleteChargingBillFailById(id);
    }
}
