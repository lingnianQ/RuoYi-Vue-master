package com.ruoyi.car.service;

import java.util.List;
import com.ruoyi.car.domain.TSpcangku;

/**
 * 车辆信息Service接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface ITSpcangkuService 
{
    /**
     * 查询车辆信息
     * 
     * @param spcangkuid 车辆信息主键
     * @return 车辆信息
     */
    public TSpcangku selectTSpcangkuBySpcangkuid(Long spcangkuid);

    /**
     * 查询车辆信息列表
     * 
     * @param tSpcangku 车辆信息
     * @return 车辆信息集合
     */
    public List<TSpcangku> selectTSpcangkuList(TSpcangku tSpcangku);

    /**
     * 新增车辆信息
     * 
     * @param tSpcangku 车辆信息
     * @return 结果
     */
    public int insertTSpcangku(TSpcangku tSpcangku);

    /**
     * 修改车辆信息
     * 
     * @param tSpcangku 车辆信息
     * @return 结果
     */
    public int updateTSpcangku(TSpcangku tSpcangku);

    /**
     * 批量删除车辆信息
     * 
     * @param spcangkuids 需要删除的车辆信息主键集合
     * @return 结果
     */
    public int deleteTSpcangkuBySpcangkuids(Long[] spcangkuids);

    /**
     * 删除车辆信息信息
     * 
     * @param spcangkuid 车辆信息主键
     * @return 结果
     */
    public int deleteTSpcangkuBySpcangkuid(Long spcangkuid);
}
