package com.ruoyi.charge.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingPileInfoMapper;
import com.ruoyi.charge.domain.ChargingPileInfo;
import com.ruoyi.charge.service.IChargingPileInfoService;

/**
 * 充电桩Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingPileInfoServiceImpl implements IChargingPileInfoService 
{
    @Autowired
    private ChargingPileInfoMapper chargingPileInfoMapper;

    /**
     * 查询充电桩
     * 
     * @param id 充电桩主键
     * @return 充电桩
     */
    @Override
    public ChargingPileInfo selectChargingPileInfoById(Integer id)
    {
        return chargingPileInfoMapper.selectChargingPileInfoById(id);
    }

    /**
     * 查询充电桩列表
     * 
     * @param chargingPileInfo 充电桩
     * @return 充电桩
     */
    @Override
    public List<ChargingPileInfo> selectChargingPileInfoList(ChargingPileInfo chargingPileInfo)
    {
        return chargingPileInfoMapper.selectChargingPileInfoList(chargingPileInfo);
    }

    /**
     * 新增充电桩
     * 
     * @param chargingPileInfo 充电桩
     * @return 结果
     */
    @Override
    public int insertChargingPileInfo(ChargingPileInfo chargingPileInfo)
    {
        chargingPileInfo.setCreateTime(DateUtils.getNowDate());
        return chargingPileInfoMapper.insertChargingPileInfo(chargingPileInfo);
    }

    /**
     * 修改充电桩
     * 
     * @param chargingPileInfo 充电桩
     * @return 结果
     */
    @Override
    public int updateChargingPileInfo(ChargingPileInfo chargingPileInfo)
    {
        return chargingPileInfoMapper.updateChargingPileInfo(chargingPileInfo);
    }

    /**
     * 批量删除充电桩
     * 
     * @param ids 需要删除的充电桩主键
     * @return 结果
     */
    @Override
    public int deleteChargingPileInfoByIds(Integer[] ids)
    {
        return chargingPileInfoMapper.deleteChargingPileInfoByIds(ids);
    }

    /**
     * 删除充电桩信息
     * 
     * @param id 充电桩主键
     * @return 结果
     */
    @Override
    public int deleteChargingPileInfoById(Integer id)
    {
        return chargingPileInfoMapper.deleteChargingPileInfoById(id);
    }
}
