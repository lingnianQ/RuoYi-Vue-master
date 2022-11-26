package com.ruoyi.charge.service;

import java.util.List;
import com.ruoyi.charge.domain.ChargingUserInfo;

/**
 * 用户信息Service接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface IChargingUserInfoService 
{
    /**
     * 查询用户信息
     * 
     * @param id 用户信息主键
     * @return 用户信息
     */
    public ChargingUserInfo selectChargingUserInfoById(Integer id);

    /**
     * 查询用户信息列表
     * 
     * @param chargingUserInfo 用户信息
     * @return 用户信息集合
     */
    public List<ChargingUserInfo> selectChargingUserInfoList(ChargingUserInfo chargingUserInfo);

    /**
     * 新增用户信息
     * 
     * @param chargingUserInfo 用户信息
     * @return 结果
     */
    public int insertChargingUserInfo(ChargingUserInfo chargingUserInfo);

    /**
     * 修改用户信息
     * 
     * @param chargingUserInfo 用户信息
     * @return 结果
     */
    public int updateChargingUserInfo(ChargingUserInfo chargingUserInfo);

    /**
     * 批量删除用户信息
     * 
     * @param ids 需要删除的用户信息主键集合
     * @return 结果
     */
    public int deleteChargingUserInfoByIds(Integer[] ids);

    /**
     * 删除用户信息信息
     * 
     * @param id 用户信息主键
     * @return 结果
     */
    public int deleteChargingUserInfoById(Integer id);
}
