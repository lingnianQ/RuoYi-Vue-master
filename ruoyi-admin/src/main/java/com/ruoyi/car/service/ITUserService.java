package com.ruoyi.car.service;

import java.util.List;
import com.ruoyi.car.domain.TUser;

/**
 * 用户信息Service接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface ITUserService 
{
    /**
     * 查询用户信息
     * 
     * @param userid 用户信息主键
     * @return 用户信息
     */
    public TUser selectTUserByUserid(Long userid);

    /**
     * 查询用户信息列表
     * 
     * @param tUser 用户信息
     * @return 用户信息集合
     */
    public List<TUser> selectTUserList(TUser tUser);

    /**
     * 新增用户信息
     * 
     * @param tUser 用户信息
     * @return 结果
     */
    public int insertTUser(TUser tUser);

    /**
     * 修改用户信息
     * 
     * @param tUser 用户信息
     * @return 结果
     */
    public int updateTUser(TUser tUser);

    /**
     * 批量删除用户信息
     * 
     * @param userids 需要删除的用户信息主键集合
     * @return 结果
     */
    public int deleteTUserByUserids(Long[] userids);

    /**
     * 删除用户信息信息
     * 
     * @param userid 用户信息主键
     * @return 结果
     */
    public int deleteTUserByUserid(Long userid);
}
