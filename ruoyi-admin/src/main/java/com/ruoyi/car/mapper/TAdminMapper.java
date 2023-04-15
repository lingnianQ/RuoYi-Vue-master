package com.ruoyi.car.mapper;

import java.util.List;
import com.ruoyi.car.domain.TAdmin;

/**
 * 管理员Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface TAdminMapper 
{
    /**
     * 查询管理员
     * 
     * @param adminid 管理员主键
     * @return 管理员
     */
    public TAdmin selectTAdminByAdminid(Long adminid);

    /**
     * 查询管理员列表
     * 
     * @param tAdmin 管理员
     * @return 管理员集合
     */
    public List<TAdmin> selectTAdminList(TAdmin tAdmin);

    /**
     * 新增管理员
     * 
     * @param tAdmin 管理员
     * @return 结果
     */
    public int insertTAdmin(TAdmin tAdmin);

    /**
     * 修改管理员
     * 
     * @param tAdmin 管理员
     * @return 结果
     */
    public int updateTAdmin(TAdmin tAdmin);

    /**
     * 删除管理员
     * 
     * @param adminid 管理员主键
     * @return 结果
     */
    public int deleteTAdminByAdminid(Long adminid);

    /**
     * 批量删除管理员
     * 
     * @param adminids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTAdminByAdminids(Long[] adminids);
}
