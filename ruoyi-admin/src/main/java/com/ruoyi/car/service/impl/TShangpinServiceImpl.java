package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TShangpinMapper;
import com.ruoyi.car.domain.TShangpin;
import com.ruoyi.car.service.ITShangpinService;

/**
 * 商品Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TShangpinServiceImpl implements ITShangpinService 
{
    @Autowired
    private TShangpinMapper tShangpinMapper;

    /**
     * 查询商品
     * 
     * @param shangpinid 商品主键
     * @return 商品
     */
    @Override
    public TShangpin selectTShangpinByShangpinid(Long shangpinid)
    {
        return tShangpinMapper.selectTShangpinByShangpinid(shangpinid);
    }

    /**
     * 查询商品列表
     * 
     * @param tShangpin 商品
     * @return 商品
     */
    @Override
    public List<TShangpin> selectTShangpinList(TShangpin tShangpin)
    {
        return tShangpinMapper.selectTShangpinList(tShangpin);
    }

    /**
     * 新增商品
     * 
     * @param tShangpin 商品
     * @return 结果
     */
    @Override
    public int insertTShangpin(TShangpin tShangpin)
    {
        return tShangpinMapper.insertTShangpin(tShangpin);
    }

    /**
     * 修改商品
     * 
     * @param tShangpin 商品
     * @return 结果
     */
    @Override
    public int updateTShangpin(TShangpin tShangpin)
    {
        return tShangpinMapper.updateTShangpin(tShangpin);
    }

    /**
     * 批量删除商品
     * 
     * @param shangpinids 需要删除的商品主键
     * @return 结果
     */
    @Override
    public int deleteTShangpinByShangpinids(Long[] shangpinids)
    {
        return tShangpinMapper.deleteTShangpinByShangpinids(shangpinids);
    }

    /**
     * 删除商品信息
     * 
     * @param shangpinid 商品主键
     * @return 结果
     */
    @Override
    public int deleteTShangpinByShangpinid(Long shangpinid)
    {
        return tShangpinMapper.deleteTShangpinByShangpinid(shangpinid);
    }
}
