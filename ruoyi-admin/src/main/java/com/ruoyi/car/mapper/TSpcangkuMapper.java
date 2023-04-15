package com.ruoyi.car.mapper;

import java.util.List;
import com.ruoyi.car.domain.TSpcangku;

/**
 * 车辆信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface TSpcangkuMapper 
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
     * 删除车辆信息
     * 
     * @param spcangkuid 车辆信息主键
     * @return 结果
     */
    public int deleteTSpcangkuBySpcangkuid(Long spcangkuid);

    /**
     * 批量删除车辆信息
     * 
     * @param spcangkuids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTSpcangkuBySpcangkuids(Long[] spcangkuids);
}
