package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TSpgysMapper;
import com.ruoyi.car.domain.TSpgys;
import com.ruoyi.car.service.ITSpgysService;

/**
 * 员工信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TSpgysServiceImpl implements ITSpgysService 
{
    @Autowired
    private TSpgysMapper tSpgysMapper;

    /**
     * 查询员工信息
     * 
     * @param spgysid 员工信息主键
     * @return 员工信息
     */
    @Override
    public TSpgys selectTSpgysBySpgysid(Long spgysid)
    {
        return tSpgysMapper.selectTSpgysBySpgysid(spgysid);
    }

    /**
     * 查询员工信息列表
     * 
     * @param tSpgys 员工信息
     * @return 员工信息
     */
    @Override
    public List<TSpgys> selectTSpgysList(TSpgys tSpgys)
    {
        return tSpgysMapper.selectTSpgysList(tSpgys);
    }

    /**
     * 新增员工信息
     * 
     * @param tSpgys 员工信息
     * @return 结果
     */
    @Override
    public int insertTSpgys(TSpgys tSpgys)
    {
        return tSpgysMapper.insertTSpgys(tSpgys);
    }

    /**
     * 修改员工信息
     * 
     * @param tSpgys 员工信息
     * @return 结果
     */
    @Override
    public int updateTSpgys(TSpgys tSpgys)
    {
        return tSpgysMapper.updateTSpgys(tSpgys);
    }

    /**
     * 批量删除员工信息
     * 
     * @param spgysids 需要删除的员工信息主键
     * @return 结果
     */
    @Override
    public int deleteTSpgysBySpgysids(Long[] spgysids)
    {
        return tSpgysMapper.deleteTSpgysBySpgysids(spgysids);
    }

    /**
     * 删除员工信息信息
     * 
     * @param spgysid 员工信息主键
     * @return 结果
     */
    @Override
    public int deleteTSpgysBySpgysid(Long spgysid)
    {
        return tSpgysMapper.deleteTSpgysBySpgysid(spgysid);
    }
}
