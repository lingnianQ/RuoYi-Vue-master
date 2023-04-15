package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TSpcangkuMapper;
import com.ruoyi.car.domain.TSpcangku;
import com.ruoyi.car.service.ITSpcangkuService;

/**
 * 车辆信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TSpcangkuServiceImpl implements ITSpcangkuService 
{
    @Autowired
    private TSpcangkuMapper tSpcangkuMapper;

    /**
     * 查询车辆信息
     * 
     * @param spcangkuid 车辆信息主键
     * @return 车辆信息
     */
    @Override
    public TSpcangku selectTSpcangkuBySpcangkuid(Long spcangkuid)
    {
        return tSpcangkuMapper.selectTSpcangkuBySpcangkuid(spcangkuid);
    }

    /**
     * 查询车辆信息列表
     * 
     * @param tSpcangku 车辆信息
     * @return 车辆信息
     */
    @Override
    public List<TSpcangku> selectTSpcangkuList(TSpcangku tSpcangku)
    {
        return tSpcangkuMapper.selectTSpcangkuList(tSpcangku);
    }

    /**
     * 新增车辆信息
     * 
     * @param tSpcangku 车辆信息
     * @return 结果
     */
    @Override
    public int insertTSpcangku(TSpcangku tSpcangku)
    {
        return tSpcangkuMapper.insertTSpcangku(tSpcangku);
    }

    /**
     * 修改车辆信息
     * 
     * @param tSpcangku 车辆信息
     * @return 结果
     */
    @Override
    public int updateTSpcangku(TSpcangku tSpcangku)
    {
        return tSpcangkuMapper.updateTSpcangku(tSpcangku);
    }

    /**
     * 批量删除车辆信息
     * 
     * @param spcangkuids 需要删除的车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteTSpcangkuBySpcangkuids(Long[] spcangkuids)
    {
        return tSpcangkuMapper.deleteTSpcangkuBySpcangkuids(spcangkuids);
    }

    /**
     * 删除车辆信息信息
     * 
     * @param spcangkuid 车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteTSpcangkuBySpcangkuid(Long spcangkuid)
    {
        return tSpcangkuMapper.deleteTSpcangkuBySpcangkuid(spcangkuid);
    }
}
