package com.ruoyi.car.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评价对象 t_uyijian
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TUyijian extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long uyijianid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uyijianname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uyijianmark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uyijianmark1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uyijianmark2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uyijianimg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uyijianimgname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date uyijiandate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date uyijiandate1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uyijiantype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long uyijiantype1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String username;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bumenid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bumenname;

    public void setUyijianid(Long uyijianid) 
    {
        this.uyijianid = uyijianid;
    }

    public Long getUyijianid() 
    {
        return uyijianid;
    }
    public void setUyijianname(String uyijianname) 
    {
        this.uyijianname = uyijianname;
    }

    public String getUyijianname() 
    {
        return uyijianname;
    }
    public void setUyijianmark(String uyijianmark) 
    {
        this.uyijianmark = uyijianmark;
    }

    public String getUyijianmark() 
    {
        return uyijianmark;
    }
    public void setUyijianmark1(String uyijianmark1) 
    {
        this.uyijianmark1 = uyijianmark1;
    }

    public String getUyijianmark1() 
    {
        return uyijianmark1;
    }
    public void setUyijianmark2(String uyijianmark2) 
    {
        this.uyijianmark2 = uyijianmark2;
    }

    public String getUyijianmark2() 
    {
        return uyijianmark2;
    }
    public void setUyijianimg(String uyijianimg) 
    {
        this.uyijianimg = uyijianimg;
    }

    public String getUyijianimg() 
    {
        return uyijianimg;
    }
    public void setUyijianimgname(String uyijianimgname) 
    {
        this.uyijianimgname = uyijianimgname;
    }

    public String getUyijianimgname() 
    {
        return uyijianimgname;
    }
    public void setUyijiandate(Date uyijiandate) 
    {
        this.uyijiandate = uyijiandate;
    }

    public Date getUyijiandate() 
    {
        return uyijiandate;
    }
    public void setUyijiandate1(Date uyijiandate1) 
    {
        this.uyijiandate1 = uyijiandate1;
    }

    public Date getUyijiandate1() 
    {
        return uyijiandate1;
    }
    public void setUyijiantype(Long uyijiantype) 
    {
        this.uyijiantype = uyijiantype;
    }

    public Long getUyijiantype() 
    {
        return uyijiantype;
    }
    public void setUyijiantype1(Long uyijiantype1) 
    {
        this.uyijiantype1 = uyijiantype1;
    }

    public Long getUyijiantype1() 
    {
        return uyijiantype1;
    }
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
            .append("uyijianid", getUyijianid())
            .append("uyijianname", getUyijianname())
            .append("uyijianmark", getUyijianmark())
            .append("uyijianmark1", getUyijianmark1())
            .append("uyijianmark2", getUyijianmark2())
            .append("uyijianimg", getUyijianimg())
            .append("uyijianimgname", getUyijianimgname())
            .append("uyijiandate", getUyijiandate())
            .append("uyijiandate1", getUyijiandate1())
            .append("uyijiantype", getUyijiantype())
            .append("uyijiantype1", getUyijiantype1())
            .append("userid", getUserid())
            .append("username", getUsername())
            .append("bumenid", getBumenid())
            .append("bumenname", getBumenname())
            .toString();
    }
}
