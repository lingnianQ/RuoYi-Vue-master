package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TSptypeMapper;
import com.ruoyi.car.domain.TSptype;
import com.ruoyi.car.service.ITSptypeService;

/**
 * 区域信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TSptypeServiceImpl implements ITSptypeService 
{
    @Autowired
    private TSptypeMapper tSptypeMapper;

    /**
     * 查询区域信息
     * 
     * @param sptypeid 区域信息主键
     * @return 区域信息
     */
    @Override
    public TSptype selectTSptypeBySptypeid(Long sptypeid)
    {
        return tSptypeMapper.selectTSptypeBySptypeid(sptypeid);
    }

    /**
     * 查询区域信息列表
     * 
     * @param tSptype 区域信息
     * @return 区域信息
     */
    @Override
    public List<TSptype> selectTSptypeList(TSptype tSptype)
    {
        return tSptypeMapper.selectTSptypeList(tSptype);
    }

    /**
     * 新增区域信息
     * 
     * @param tSptype 区域信息
     * @return 结果
     */
    @Override
    public int insertTSptype(TSptype tSptype)
    {
        return tSptypeMapper.insertTSptype(tSptype);
    }

    /**
     * 修改区域信息
     * 
     * @param tSptype 区域信息
     * @return 结果
     */
    @Override
    public int updateTSptype(TSptype tSptype)
    {
        return tSptypeMapper.updateTSptype(tSptype);
    }

    /**
     * 批量删除区域信息
     * 
     * @param sptypeids 需要删除的区域信息主键
     * @return 结果
     */
    @Override
    public int deleteTSptypeBySptypeids(Long[] sptypeids)
    {
        return tSptypeMapper.deleteTSptypeBySptypeids(sptypeids);
    }

    /**
     * 删除区域信息信息
     * 
     * @param sptypeid 区域信息主键
     * @return 结果
     */
    @Override
    public int deleteTSptypeBySptypeid(Long sptypeid)
    {
        return tSptypeMapper.deleteTSptypeBySptypeid(sptypeid);
    }
}
