package com.ruoyi.charge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingGunInfoMapper;
import com.ruoyi.charge.domain.ChargingGunInfo;
import com.ruoyi.charge.service.IChargingGunInfoService;

/**
 * 充电枪Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingGunInfoServiceImpl implements IChargingGunInfoService 
{
    @Autowired
    private ChargingGunInfoMapper chargingGunInfoMapper;

    /**
     * 查询充电枪
     * 
     * @param id 充电枪主键
     * @return 充电枪
     */
    @Override
    public ChargingGunInfo selectChargingGunInfoById(Long id)
    {
        return chargingGunInfoMapper.selectChargingGunInfoById(id);
    }

    /**
     * 查询充电枪列表
     * 
     * @param chargingGunInfo 充电枪
     * @return 充电枪
     */
    @Override
    public List<ChargingGunInfo> selectChargingGunInfoList(ChargingGunInfo chargingGunInfo)
    {
        return chargingGunInfoMapper.selectChargingGunInfoList(chargingGunInfo);
    }

    /**
     * 新增充电枪
     * 
     * @param chargingGunInfo 充电枪
     * @return 结果
     */
    @Override
    public int insertChargingGunInfo(ChargingGunInfo chargingGunInfo)
    {
        chargingGunInfo.setCreateTime(DateUtils.getNowDate());
        return chargingGunInfoMapper.insertChargingGunInfo(chargingGunInfo);
    }

    /**
     * 修改充电枪
     * 
     * @param chargingGunInfo 充电枪
     * @return 结果
     */
    @Override
    public int updateChargingGunInfo(ChargingGunInfo chargingGunInfo)
    {
        return chargingGunInfoMapper.updateChargingGunInfo(chargingGunInfo);
    }

    /**
     * 批量删除充电枪
     * 
     * @param ids 需要删除的充电枪主键
     * @return 结果
     */
    @Override
    public int deleteChargingGunInfoByIds(Long[] ids)
    {
        return chargingGunInfoMapper.deleteChargingGunInfoByIds(ids);
    }

    /**
     * 删除充电枪信息
     * 
     * @param id 充电枪主键
     * @return 结果
     */
    @Override
    public int deleteChargingGunInfoById(Long id)
    {
        return chargingGunInfoMapper.deleteChargingGunInfoById(id);
    }
}
