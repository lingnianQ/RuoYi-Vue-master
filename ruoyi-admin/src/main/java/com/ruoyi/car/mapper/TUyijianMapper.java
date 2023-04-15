package com.ruoyi.car.mapper;

import java.util.List;
import com.ruoyi.car.domain.TUyijian;

/**
 * 评价Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface TUyijianMapper 
{
    /**
     * 查询评价
     * 
     * @param uyijianid 评价主键
     * @return 评价
     */
    public TUyijian selectTUyijianByUyijianid(Long uyijianid);

    /**
     * 查询评价列表
     * 
     * @param tUyijian 评价
     * @return 评价集合
     */
    public List<TUyijian> selectTUyijianList(TUyijian tUyijian);

    /**
     * 新增评价
     * 
     * @param tUyijian 评价
     * @return 结果
     */
    public int insertTUyijian(TUyijian tUyijian);

    /**
     * 修改评价
     * 
     * @param tUyijian 评价
     * @return 结果
     */
    public int updateTUyijian(TUyijian tUyijian);

    /**
     * 删除评价
     * 
     * @param uyijianid 评价主键
     * @return 结果
     */
    public int deleteTUyijianByUyijianid(Long uyijianid);

    /**
     * 批量删除评价
     * 
     * @param uyijianids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTUyijianByUyijianids(Long[] uyijianids);
}
