package com.ruoyi.car.service;

import java.util.List;
import com.ruoyi.car.domain.TSpgys;

/**
 * 员工信息Service接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface ITSpgysService 
{
    /**
     * 查询员工信息
     * 
     * @param spgysid 员工信息主键
     * @return 员工信息
     */
    public TSpgys selectTSpgysBySpgysid(Long spgysid);

    /**
     * 查询员工信息列表
     * 
     * @param tSpgys 员工信息
     * @return 员工信息集合
     */
    public List<TSpgys> selectTSpgysList(TSpgys tSpgys);

    /**
     * 新增员工信息
     * 
     * @param tSpgys 员工信息
     * @return 结果
     */
    public int insertTSpgys(TSpgys tSpgys);

    /**
     * 修改员工信息
     * 
     * @param tSpgys 员工信息
     * @return 结果
     */
    public int updateTSpgys(TSpgys tSpgys);

    /**
     * 批量删除员工信息
     * 
     * @param spgysids 需要删除的员工信息主键集合
     * @return 结果
     */
    public int deleteTSpgysBySpgysids(Long[] spgysids);

    /**
     * 删除员工信息信息
     * 
     * @param spgysid 员工信息主键
     * @return 结果
     */
    public int deleteTSpgysBySpgysid(Long spgysid);
}
