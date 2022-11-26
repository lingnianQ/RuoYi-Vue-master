package com.ruoyi.charge.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.charge.mapper.ChargingUserInfoMapper;
import com.ruoyi.charge.domain.ChargingUserInfo;
import com.ruoyi.charge.service.IChargingUserInfoService;

/**
 * 用户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
@Service
public class ChargingUserInfoServiceImpl implements IChargingUserInfoService 
{
    @Autowired
    private ChargingUserInfoMapper chargingUserInfoMapper;

    /**
     * 查询用户信息
     * 
     * @param id 用户信息主键
     * @return 用户信息
     */
    @Override
    public ChargingUserInfo selectChargingUserInfoById(Integer id)
    {
        return chargingUserInfoMapper.selectChargingUserInfoById(id);
    }

    /**
     * 查询用户信息列表
     * 
     * @param chargingUserInfo 用户信息
     * @return 用户信息
     */
    @Override
    public List<ChargingUserInfo> selectChargingUserInfoList(ChargingUserInfo chargingUserInfo)
    {
        return chargingUserInfoMapper.selectChargingUserInfoList(chargingUserInfo);
    }

    /**
     * 新增用户信息
     * 
     * @param chargingUserInfo 用户信息
     * @return 结果
     */
    @Override
    public int insertChargingUserInfo(ChargingUserInfo chargingUserInfo)
    {
        return chargingUserInfoMapper.insertChargingUserInfo(chargingUserInfo);
    }

    /**
     * 修改用户信息
     * 
     * @param chargingUserInfo 用户信息
     * @return 结果
     */
    @Override
    public int updateChargingUserInfo(ChargingUserInfo chargingUserInfo)
    {
        return chargingUserInfoMapper.updateChargingUserInfo(chargingUserInfo);
    }

    /**
     * 批量删除用户信息
     * 
     * @param ids 需要删除的用户信息主键
     * @return 结果
     */
    @Override
    public int deleteChargingUserInfoByIds(Integer[] ids)
    {
        return chargingUserInfoMapper.deleteChargingUserInfoByIds(ids);
    }

    /**
     * 删除用户信息信息
     * 
     * @param id 用户信息主键
     * @return 结果
     */
    @Override
    public int deleteChargingUserInfoById(Integer id)
    {
        return chargingUserInfoMapper.deleteChargingUserInfoById(id);
    }
}
