package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TUyijianMapper;
import com.ruoyi.car.domain.TUyijian;
import com.ruoyi.car.service.ITUyijianService;

/**
 * 评价Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TUyijianServiceImpl implements ITUyijianService 
{
    @Autowired
    private TUyijianMapper tUyijianMapper;

    /**
     * 查询评价
     * 
     * @param uyijianid 评价主键
     * @return 评价
     */
    @Override
    public TUyijian selectTUyijianByUyijianid(Long uyijianid)
    {
        return tUyijianMapper.selectTUyijianByUyijianid(uyijianid);
    }

    /**
     * 查询评价列表
     * 
     * @param tUyijian 评价
     * @return 评价
     */
    @Override
    public List<TUyijian> selectTUyijianList(TUyijian tUyijian)
    {
        return tUyijianMapper.selectTUyijianList(tUyijian);
    }

    /**
     * 新增评价
     * 
     * @param tUyijian 评价
     * @return 结果
     */
    @Override
    public int insertTUyijian(TUyijian tUyijian)
    {
        return tUyijianMapper.insertTUyijian(tUyijian);
    }

    /**
     * 修改评价
     * 
     * @param tUyijian 评价
     * @return 结果
     */
    @Override
    public int updateTUyijian(TUyijian tUyijian)
    {
        return tUyijianMapper.updateTUyijian(tUyijian);
    }

    /**
     * 批量删除评价
     * 
     * @param uyijianids 需要删除的评价主键
     * @return 结果
     */
    @Override
    public int deleteTUyijianByUyijianids(Long[] uyijianids)
    {
        return tUyijianMapper.deleteTUyijianByUyijianids(uyijianids);
    }

    /**
     * 删除评价信息
     * 
     * @param uyijianid 评价主键
     * @return 结果
     */
    @Override
    public int deleteTUyijianByUyijianid(Long uyijianid)
    {
        return tUyijianMapper.deleteTUyijianByUyijianid(uyijianid);
    }
}
