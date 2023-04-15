package com.ruoyi.car.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 管理员对象 t_admin
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TAdmin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long adminid;

    /** 名称 */
    @Excel(name = "名称")
    private String adminname;

    /** 密码 */
    @Excel(name = "密码")
    private String adminpassword;

    public void setAdminid(Long adminid) 
    {
        this.adminid = adminid;
    }

    public Long getAdminid() 
    {
        return adminid;
    }
    public void setAdminname(String adminname) 
    {
        this.adminname = adminname;
    }

    public String getAdminname() 
    {
        return adminname;
    }
    public void setAdminpassword(String adminpassword) 
    {
        this.adminpassword = adminpassword;
    }

    public String getAdminpassword() 
    {
        return adminpassword;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("adminid", getAdminid())
            .append("adminname", getAdminname())
            .append("adminpassword", getAdminpassword())
            .toString();
    }
}
