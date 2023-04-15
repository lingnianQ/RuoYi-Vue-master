package com.ruoyi.car.mapper;

import java.util.List;
import com.ruoyi.car.domain.TShangpin;

/**
 * 商品Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface TShangpinMapper 
{
    /**
     * 查询商品
     * 
     * @param shangpinid 商品主键
     * @return 商品
     */
    public TShangpin selectTShangpinByShangpinid(Long shangpinid);

    /**
     * 查询商品列表
     * 
     * @param tShangpin 商品
     * @return 商品集合
     */
    public List<TShangpin> selectTShangpinList(TShangpin tShangpin);

    /**
     * 新增商品
     * 
     * @param tShangpin 商品
     * @return 结果
     */
    public int insertTShangpin(TShangpin tShangpin);

    /**
     * 修改商品
     * 
     * @param tShangpin 商品
     * @return 结果
     */
    public int updateTShangpin(TShangpin tShangpin);

    /**
     * 删除商品
     * 
     * @param shangpinid 商品主键
     * @return 结果
     */
    public int deleteTShangpinByShangpinid(Long shangpinid);

    /**
     * 批量删除商品
     * 
     * @param shangpinids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTShangpinByShangpinids(Long[] shangpinids);
}
