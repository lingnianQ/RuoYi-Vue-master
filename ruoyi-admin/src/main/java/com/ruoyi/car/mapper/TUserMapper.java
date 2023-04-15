package com.ruoyi.car.mapper;

import java.util.List;
import com.ruoyi.car.domain.TUser;

/**
 * 用户信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public interface TUserMapper 
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
     * 删除用户信息
     * 
     * @param userid 用户信息主键
     * @return 结果
     */
    public int deleteTUserByUserid(Long userid);

    /**
     * 批量删除用户信息
     * 
     * @param userids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTUserByUserids(Long[] userids);
}
