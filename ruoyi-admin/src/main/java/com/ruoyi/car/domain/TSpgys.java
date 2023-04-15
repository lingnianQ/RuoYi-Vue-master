package com.ruoyi.car.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 员工信息对象 t_spgys
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TSpgys extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long spgysid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spgysname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spgysmark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spgysmark1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spgysmark2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spgysphone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spgysdizhi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date spgysdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date spgysdate1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spgystype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spgystype1;

    public void setSpgysid(Long spgysid) 
    {
        this.spgysid = spgysid;
    }

    public Long getSpgysid() 
    {
        return spgysid;
    }
    public void setSpgysname(String spgysname) 
    {
        this.spgysname = spgysname;
    }

    public String getSpgysname() 
    {
        return spgysname;
    }
    public void setSpgysmark(String spgysmark) 
    {
        this.spgysmark = spgysmark;
    }

    public String getSpgysmark() 
    {
        return spgysmark;
    }
    public void setSpgysmark1(String spgysmark1) 
    {
        this.spgysmark1 = spgysmark1;
    }

    public String getSpgysmark1() 
    {
        return spgysmark1;
    }
    public void setSpgysmark2(String spgysmark2) 
    {
        this.spgysmark2 = spgysmark2;
    }

    public String getSpgysmark2() 
    {
        return spgysmark2;
    }
    public void setSpgysphone(String spgysphone) 
    {
        this.spgysphone = spgysphone;
    }

    public String getSpgysphone() 
    {
        return spgysphone;
    }
    public void setSpgysdizhi(String spgysdizhi) 
    {
        this.spgysdizhi = spgysdizhi;
    }

    public String getSpgysdizhi() 
    {
        return spgysdizhi;
    }
    public void setSpgysdate(Date spgysdate) 
    {
        this.spgysdate = spgysdate;
    }

    public Date getSpgysdate() 
    {
        return spgysdate;
    }
    public void setSpgysdate1(Date spgysdate1) 
    {
        this.spgysdate1 = spgysdate1;
    }

    public Date getSpgysdate1() 
    {
        return spgysdate1;
    }
    public void setSpgystype(Long spgystype) 
    {
        this.spgystype = spgystype;
    }

    public Long getSpgystype() 
    {
        return spgystype;
    }
    public void setSpgystype1(Long spgystype1) 
    {
        this.spgystype1 = spgystype1;
    }

    public Long getSpgystype1() 
    {
        return spgystype1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("spgysid", getSpgysid())
            .append("spgysname", getSpgysname())
            .append("spgysmark", getSpgysmark())
            .append("spgysmark1", getSpgysmark1())
            .append("spgysmark2", getSpgysmark2())
            .append("spgysphone", getSpgysphone())
            .append("spgysdizhi", getSpgysdizhi())
            .append("spgysdate", getSpgysdate())
            .append("spgysdate1", getSpgysdate1())
            .append("spgystype", getSpgystype())
            .append("spgystype1", getSpgystype1())
            .toString();
    }
}
