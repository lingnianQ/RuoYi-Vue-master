package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TAdminMapper;
import com.ruoyi.car.domain.TAdmin;
import com.ruoyi.car.service.ITAdminService;

/**
 * 管理员Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TAdminServiceImpl implements ITAdminService 
{
    @Autowired
    private TAdminMapper tAdminMapper;

    /**
     * 查询管理员
     * 
     * @param adminid 管理员主键
     * @return 管理员
     */
    @Override
    public TAdmin selectTAdminByAdminid(Long adminid)
    {
        return tAdminMapper.selectTAdminByAdminid(adminid);
    }

    /**
     * 查询管理员列表
     * 
     * @param tAdmin 管理员
     * @return 管理员
     */
    @Override
    public List<TAdmin> selectTAdminList(TAdmin tAdmin)
    {
        return tAdminMapper.selectTAdminList(tAdmin);
    }

    /**
     * 新增管理员
     * 
     * @param tAdmin 管理员
     * @return 结果
     */
    @Override
    public int insertTAdmin(TAdmin tAdmin)
    {
        return tAdminMapper.insertTAdmin(tAdmin);
    }

    /**
     * 修改管理员
     * 
     * @param tAdmin 管理员
     * @return 结果
     */
    @Override
    public int updateTAdmin(TAdmin tAdmin)
    {
        return tAdminMapper.updateTAdmin(tAdmin);
    }

    /**
     * 批量删除管理员
     * 
     * @param adminids 需要删除的管理员主键
     * @return 结果
     */
    @Override
    public int deleteTAdminByAdminids(Long[] adminids)
    {
        return tAdminMapper.deleteTAdminByAdminids(adminids);
    }

    /**
     * 删除管理员信息
     * 
     * @param adminid 管理员主键
     * @return 结果
     */
    @Override
    public int deleteTAdminByAdminid(Long adminid)
    {
        return tAdminMapper.deleteTAdminByAdminid(adminid);
    }
}
