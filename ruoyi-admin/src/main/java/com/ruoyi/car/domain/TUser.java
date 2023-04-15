package com.ruoyi.car.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户信息对象 t_user
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long userid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String username;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userpassword;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userxingming;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long usersex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userphone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usermark1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usermark2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usermark3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usermark4;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date userdate1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date userdate2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long usertype1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long usertype2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userimg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userimgname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long roleid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rolename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bumenid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bumenname;

    public void setUserid(Long userid) 
    {
        this.userid = userid;
    }

    public Long getUserid() 
    {
        return userid;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setUserpassword(String userpassword) 
    {
        this.userpassword = userpassword;
    }

    public String getUserpassword() 
    {
        return userpassword;
    }
    public void setUserxingming(String userxingming) 
    {
        this.userxingming = userxingming;
    }

    public String getUserxingming() 
    {
        return userxingming;
    }
    public void setUsersex(Long usersex) 
    {
        this.usersex = usersex;
    }

    public Long getUsersex() 
    {
        return usersex;
    }
    public void setUserage(Long userage) 
    {
        this.userage = userage;
    }

    public Long getUserage() 
    {
        return userage;
    }
    public void setUserphone(String userphone) 
    {
        this.userphone = userphone;
    }

    public String getUserphone() 
    {
        return userphone;
    }
    public void setUsermark1(String usermark1) 
    {
        this.usermark1 = usermark1;
    }

    public String getUsermark1() 
    {
        return usermark1;
    }
    public void setUsermark2(String usermark2) 
    {
        this.usermark2 = usermark2;
    }

    public String getUsermark2() 
    {
        return usermark2;
    }
    public void setUsermark3(String usermark3) 
    {
        this.usermark3 = usermark3;
    }

    public String getUsermark3() 
    {
        return usermark3;
    }
    public void setUsermark4(String usermark4) 
    {
        this.usermark4 = usermark4;
    }

    public String getUsermark4() 
    {
        return usermark4;
    }
    public void setUserdate1(Date userdate1) 
    {
        this.userdate1 = userdate1;
    }

    public Date getUserdate1() 
    {
        return userdate1;
    }
    public void setUserdate2(Date userdate2) 
    {
        this.userdate2 = userdate2;
    }

    public Date getUserdate2() 
    {
        return userdate2;
    }
    public void setUsertype1(Long usertype1) 
    {
        this.usertype1 = usertype1;
    }

    public Long getUsertype1() 
    {
        return usertype1;
    }
    public void setUsertype2(Long usertype2) 
    {
        this.usertype2 = usertype2;
    }

    public Long getUsertype2() 
    {
        return usertype2;
    }
    public void setUserimg(String userimg) 
    {
        this.userimg = userimg;
    }

    public String getUserimg() 
    {
        return userimg;
    }
    public void setUserimgname(String userimgname) 
    {
        this.userimgname = userimgname;
    }

    public String getUserimgname() 
    {
        return userimgname;
    }
    public void setRoleid(Long roleid) 
    {
        this.roleid = roleid;
    }

    public Long getRoleid() 
    {
        return roleid;
    }
    public void setRolename(String rolename) 
    {
        this.rolename = rolename;
    }

    public String getRolename() 
    {
        return rolename;
    }
    public void setBumenid(Long bumenid) 
    {
        this.bumenid = bumenid;
    }

    public Long getBumenid() 
    {
        return bumenid;
    }
    public void setBumenname(String bumenname) 
    {
        this.bumenname = bumenname;
    }

    public String getBumenname() 
    {
        return bumenname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userid", getUserid())
            .append("username", getUsername())
            .append("userpassword", getUserpassword())
            .append("userxingming", getUserxingming())
            .append("usersex", getUsersex())
            .append("userage", getUserage())
            .append("userphone", getUserphone())
            .append("usermark1", getUsermark1())
            .append("usermark2", getUsermark2())
            .append("usermark3", getUsermark3())
            .append("usermark4", getUsermark4())
            .append("userdate1", getUserdate1())
            .append("userdate2", getUserdate2())
            .append("usertype1", getUsertype1())
            .append("usertype2", getUsertype2())
            .append("userimg", getUserimg())
            .append("userimgname", getUserimgname())
            .append("roleid", getRoleid())
            .append("rolename", getRolename())
            .append("bumenid", getBumenid())
            .append("bumenname", getBumenname())
            .toString();
    }
}
