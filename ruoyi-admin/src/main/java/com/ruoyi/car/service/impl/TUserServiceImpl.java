package com.ruoyi.car.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.car.mapper.TUserMapper;
import com.ruoyi.car.domain.TUser;
import com.ruoyi.car.service.ITUserService;

/**
 * 用户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
@Service
public class TUserServiceImpl implements ITUserService 
{
    @Autowired
    private TUserMapper tUserMapper;

    /**
     * 查询用户信息
     * 
     * @param userid 用户信息主键
     * @return 用户信息
     */
    @Override
    public TUser selectTUserByUserid(Long userid)
    {
        return tUserMapper.selectTUserByUserid(userid);
    }

    /**
     * 查询用户信息列表
     * 
     * @param tUser 用户信息
     * @return 用户信息
     */
    @Override
    public List<TUser> selectTUserList(TUser tUser)
    {
        return tUserMapper.selectTUserList(tUser);
    }

    /**
     * 新增用户信息
     * 
     * @param tUser 用户信息
     * @return 结果
     */
    @Override
    public int insertTUser(TUser tUser)
    {
        return tUserMapper.insertTUser(tUser);
    }

    /**
     * 修改用户信息
     * 
     * @param tUser 用户信息
     * @return 结果
     */
    @Override
    public int updateTUser(TUser tUser)
    {
        return tUserMapper.updateTUser(tUser);
    }

    /**
     * 批量删除用户信息
     * 
     * @param userids 需要删除的用户信息主键
     * @return 结果
     */
    @Override
    public int deleteTUserByUserids(Long[] userids)
    {
        return tUserMapper.deleteTUserByUserids(userids);
    }

    /**
     * 删除用户信息信息
     * 
     * @param userid 用户信息主键
     * @return 结果
     */
    @Override
    public int deleteTUserByUserid(Long userid)
    {
        return tUserMapper.deleteTUserByUserid(userid);
    }
}
