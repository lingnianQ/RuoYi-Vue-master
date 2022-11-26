package com.ruoyi.charge.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户信息对象 charging_user_info
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public class ChargingUserInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String userName;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 职业 */
    @Excel(name = "职业")
    private String occupation;

    /** 登录账号（外键） */
    @Excel(name = "登录账号", readConverterExp = "外=键")
    private String userAccount;

    /** 登录密码 */
    @Excel(name = "登录密码")
    private String pasword;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setOccupation(String occupation) 
    {
        this.occupation = occupation;
    }

    public String getOccupation() 
    {
        return occupation;
    }
    public void setUserAccount(String userAccount) 
    {
        this.userAccount = userAccount;
    }

    public String getUserAccount() 
    {
        return userAccount;
    }
    public void setPasword(String pasword) 
    {
        this.pasword = pasword;
    }

    public String getPasword() 
    {
        return pasword;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userName", getUserName())
            .append("gender", getGender())
            .append("age", getAge())
            .append("occupation", getOccupation())
            .append("userAccount", getUserAccount())
            .append("pasword", getPasword())
            .toString();
    }
}
