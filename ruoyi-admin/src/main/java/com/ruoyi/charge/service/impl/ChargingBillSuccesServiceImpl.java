package com.ruoyi.charge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingBillSuccesMapper;
import com.ruoyi.charge.domain.ChargingBillSucces;
import com.ruoyi.charge.service.IChargingBillSuccesService;

/**
 * 成功订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingBillSuccesServiceImpl implements IChargingBillSuccesService 
{
    @Autowired
    private ChargingBillSuccesMapper chargingBillSuccesMapper;

    /**
     * 查询成功订单
     * 
     * @param id 成功订单主键
     * @return 成功订单
     */
    @Override
    public ChargingBillSucces selectChargingBillSuccesById(Integer id)
    {
        return chargingBillSuccesMapper.selectChargingBillSuccesById(id);
    }

    /**
     * 查询成功订单列表
     * 
     * @param chargingBillSucces 成功订单
     * @return 成功订单
     */
    @Override
    public List<ChargingBillSucces> selectChargingBillSuccesList(ChargingBillSucces chargingBillSucces)
    {
        return chargingBillSuccesMapper.selectChargingBillSuccesList(chargingBillSucces);
    }

    /**
     * 新增成功订单
     * 
     * @param chargingBillSucces 成功订单
     * @return 结果
     */
    @Override
    public int insertChargingBillSucces(ChargingBillSucces chargingBillSucces)
    {
        chargingBillSucces.setCreateTime(DateUtils.getNowDate());
        return chargingBillSuccesMapper.insertChargingBillSucces(chargingBillSucces);
    }

    /**
     * 修改成功订单
     * 
     * @param chargingBillSucces 成功订单
     * @return 结果
     */
    @Override
    public int updateChargingBillSucces(ChargingBillSucces chargingBillSucces)
    {
        return chargingBillSuccesMapper.updateChargingBillSucces(chargingBillSucces);
    }

    /**
     * 批量删除成功订单
     * 
     * @param ids 需要删除的成功订单主键
     * @return 结果
     */
    @Override
    public int deleteChargingBillSuccesByIds(Integer[] ids)
    {
        return chargingBillSuccesMapper.deleteChargingBillSuccesByIds(ids);
    }

    /**
     * 删除成功订单信息
     * 
     * @param id 成功订单主键
     * @return 结果
     */
    @Override
    public int deleteChargingBillSuccesById(Integer id)
    {
        return chargingBillSuccesMapper.deleteChargingBillSuccesById(id);
    }
}
