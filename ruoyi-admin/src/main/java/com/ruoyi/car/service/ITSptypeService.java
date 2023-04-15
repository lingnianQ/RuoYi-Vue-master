package com.ruoyi.car.service;

import java.util.List;
import com.ruoyi.car.domain.TSptype;

/**
 * 区域信息Service接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface ITSptypeService 
{
    /**
     * 查询区域信息
     * 
     * @param sptypeid 区域信息主键
     * @return 区域信息
     */
    public TSptype selectTSptypeBySptypeid(Long sptypeid);

    /**
     * 查询区域信息列表
     * 
     * @param tSptype 区域信息
     * @return 区域信息集合
     */
    public List<TSptype> selectTSptypeList(TSptype tSptype);

    /**
     * 新增区域信息
     * 
     * @param tSptype 区域信息
     * @return 结果
     */
    public int insertTSptype(TSptype tSptype);

    /**
     * 修改区域信息
     * 
     * @param tSptype 区域信息
     * @return 结果
     */
    public int updateTSptype(TSptype tSptype);

    /**
     * 批量删除区域信息
     * 
     * @param sptypeids 需要删除的区域信息主键集合
     * @return 结果
     */
    public int deleteTSptypeBySptypeids(Long[] sptypeids);

    /**
     * 删除区域信息信息
     * 
     * @param sptypeid 区域信息主键
     * @return 结果
     */
    public int deleteTSptypeBySptypeid(Long sptypeid);
}
