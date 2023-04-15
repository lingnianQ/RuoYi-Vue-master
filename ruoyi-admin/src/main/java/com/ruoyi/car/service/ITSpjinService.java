package com.ruoyi.car.service;

import java.util.List;
import com.ruoyi.car.domain.TSpjin;

/**
 * 地址信息Service接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface ITSpjinService 
{
    /**
     * 查询地址信息
     * 
     * @param spjinid 地址信息主键
     * @return 地址信息
     */
    public TSpjin selectTSpjinBySpjinid(Long spjinid);

    /**
     * 查询地址信息列表
     * 
     * @param tSpjin 地址信息
     * @return 地址信息集合
     */
    public List<TSpjin> selectTSpjinList(TSpjin tSpjin);

    /**
     * 新增地址信息
     * 
     * @param tSpjin 地址信息
     * @return 结果
     */
    public int insertTSpjin(TSpjin tSpjin);

    /**
     * 修改地址信息
     * 
     * @param tSpjin 地址信息
     * @return 结果
     */
    public int updateTSpjin(TSpjin tSpjin);

    /**
     * 批量删除地址信息
     * 
     * @param spjinids 需要删除的地址信息主键集合
     * @return 结果
     */
    public int deleteTSpjinBySpjinids(Long[] spjinids);

    /**
     * 删除地址信息信息
     * 
     * @param spjinid 地址信息主键
     * @return 结果
     */
    public int deleteTSpjinBySpjinid(Long spjinid);
}
