package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TSpjinMapper;
import com.ruoyi.car.domain.TSpjin;
import com.ruoyi.car.service.ITSpjinService;

/**
 * 地址信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TSpjinServiceImpl implements ITSpjinService 
{
    @Autowired
    private TSpjinMapper tSpjinMapper;

    /**
     * 查询地址信息
     * 
     * @param spjinid 地址信息主键
     * @return 地址信息
     */
    @Override
    public TSpjin selectTSpjinBySpjinid(Long spjinid)
    {
        return tSpjinMapper.selectTSpjinBySpjinid(spjinid);
    }

    /**
     * 查询地址信息列表
     * 
     * @param tSpjin 地址信息
     * @return 地址信息
     */
    @Override
    public List<TSpjin> selectTSpjinList(TSpjin tSpjin)
    {
        return tSpjinMapper.selectTSpjinList(tSpjin);
    }

    /**
     * 新增地址信息
     * 
     * @param tSpjin 地址信息
     * @return 结果
     */
    @Override
    public int insertTSpjin(TSpjin tSpjin)
    {
        return tSpjinMapper.insertTSpjin(tSpjin);
    }

    /**
     * 修改地址信息
     * 
     * @param tSpjin 地址信息
     * @return 结果
     */
    @Override
    public int updateTSpjin(TSpjin tSpjin)
    {
        return tSpjinMapper.updateTSpjin(tSpjin);
    }

    /**
     * 批量删除地址信息
     * 
     * @param spjinids 需要删除的地址信息主键
     * @return 结果
     */
    @Override
    public int deleteTSpjinBySpjinids(Long[] spjinids)
    {
        return tSpjinMapper.deleteTSpjinBySpjinids(spjinids);
    }

    /**
     * 删除地址信息信息
     * 
     * @param spjinid 地址信息主键
     * @return 结果
     */
    @Override
    public int deleteTSpjinBySpjinid(Long spjinid)
    {
        return tSpjinMapper.deleteTSpjinBySpjinid(spjinid);
    }
}
