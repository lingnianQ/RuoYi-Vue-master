package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TRizhiMapper;
import com.ruoyi.car.domain.TRizhi;
import com.ruoyi.car.service.ITRizhiService;

/**
 * 日志Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TRizhiServiceImpl implements ITRizhiService 
{
    @Autowired
    private TRizhiMapper tRizhiMapper;

    /**
     * 查询日志
     * 
     * @param rizhiid 日志主键
     * @return 日志
     */
    @Override
    public TRizhi selectTRizhiByRizhiid(Long rizhiid)
    {
        return tRizhiMapper.selectTRizhiByRizhiid(rizhiid);
    }

    /**
     * 查询日志列表
     * 
     * @param tRizhi 日志
     * @return 日志
     */
    @Override
    public List<TRizhi> selectTRizhiList(TRizhi tRizhi)
    {
        return tRizhiMapper.selectTRizhiList(tRizhi);
    }

    /**
     * 新增日志
     * 
     * @param tRizhi 日志
     * @return 结果
     */
    @Override
    public int insertTRizhi(TRizhi tRizhi)
    {
        return tRizhiMapper.insertTRizhi(tRizhi);
    }

    /**
     * 修改日志
     * 
     * @param tRizhi 日志
     * @return 结果
     */
    @Override
    public int updateTRizhi(TRizhi tRizhi)
    {
        return tRizhiMapper.updateTRizhi(tRizhi);
    }

    /**
     * 批量删除日志
     * 
     * @param rizhiids 需要删除的日志主键
     * @return 结果
     */
    @Override
    public int deleteTRizhiByRizhiids(Long[] rizhiids)
    {
        return tRizhiMapper.deleteTRizhiByRizhiids(rizhiids);
    }

    /**
     * 删除日志信息
     * 
     * @param rizhiid 日志主键
     * @return 结果
     */
    @Override
    public int deleteTRizhiByRizhiid(Long rizhiid)
    {
        return tRizhiMapper.deleteTRizhiByRizhiid(rizhiid);
    }
}
