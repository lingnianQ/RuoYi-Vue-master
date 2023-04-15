package com.ruoyi.car.service;

import java.util.List;
import com.ruoyi.car.domain.TRizhi;

/**
 * 日志Service接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface ITRizhiService 
{
    /**
     * 查询日志
     * 
     * @param rizhiid 日志主键
     * @return 日志
     */
    public TRizhi selectTRizhiByRizhiid(Long rizhiid);

    /**
     * 查询日志列表
     * 
     * @param tRizhi 日志
     * @return 日志集合
     */
    public List<TRizhi> selectTRizhiList(TRizhi tRizhi);

    /**
     * 新增日志
     * 
     * @param tRizhi 日志
     * @return 结果
     */
    public int insertTRizhi(TRizhi tRizhi);

    /**
     * 修改日志
     * 
     * @param tRizhi 日志
     * @return 结果
     */
    public int updateTRizhi(TRizhi tRizhi);

    /**
     * 批量删除日志
     * 
     * @param rizhiids 需要删除的日志主键集合
     * @return 结果
     */
    public int deleteTRizhiByRizhiids(Long[] rizhiids);

    /**
     * 删除日志信息
     * 
     * @param rizhiid 日志主键
     * @return 结果
     */
    public int deleteTRizhiByRizhiid(Long rizhiid);
}
