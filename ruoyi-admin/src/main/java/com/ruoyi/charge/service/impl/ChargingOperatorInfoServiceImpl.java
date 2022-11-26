package com.ruoyi.charge.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingOperatorInfoMapper;
import com.ruoyi.charge.domain.ChargingOperatorInfo;
import com.ruoyi.charge.service.IChargingOperatorInfoService;

/**
 * 运营商Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingOperatorInfoServiceImpl implements IChargingOperatorInfoService 
{
    @Autowired
    private ChargingOperatorInfoMapper chargingOperatorInfoMapper;

    /**
     * 查询运营商
     * 
     * @param id 运营商主键
     * @return 运营商
     */
    @Override
    public ChargingOperatorInfo selectChargingOperatorInfoById(Integer id)
    {
        return chargingOperatorInfoMapper.selectChargingOperatorInfoById(id);
    }

    /**
     * 查询运营商列表
     * 
     * @param chargingOperatorInfo 运营商
     * @return 运营商
     */
    @Override
    public List<ChargingOperatorInfo> selectChargingOperatorInfoList(ChargingOperatorInfo chargingOperatorInfo)
    {
        return chargingOperatorInfoMapper.selectChargingOperatorInfoList(chargingOperatorInfo);
    }

    /**
     * 新增运营商
     * 
     * @param chargingOperatorInfo 运营商
     * @return 结果
     */
    @Override
    public int insertChargingOperatorInfo(ChargingOperatorInfo chargingOperatorInfo)
    {
        return chargingOperatorInfoMapper.insertChargingOperatorInfo(chargingOperatorInfo);
    }

    /**
     * 修改运营商
     * 
     * @param chargingOperatorInfo 运营商
     * @return 结果
     */
    @Override
    public int updateChargingOperatorInfo(ChargingOperatorInfo chargingOperatorInfo)
    {
        return chargingOperatorInfoMapper.updateChargingOperatorInfo(chargingOperatorInfo);
    }

    /**
     * 批量删除运营商
     * 
     * @param ids 需要删除的运营商主键
     * @return 结果
     */
    @Override
    public int deleteChargingOperatorInfoByIds(Integer[] ids)
    {
        return chargingOperatorInfoMapper.deleteChargingOperatorInfoByIds(ids);
    }

    /**
     * 删除运营商信息
     * 
     * @param id 运营商主键
     * @return 结果
     */
    @Override
    public int deleteChargingOperatorInfoById(Integer id)
    {
        return chargingOperatorInfoMapper.deleteChargingOperatorInfoById(id);
    }
}
