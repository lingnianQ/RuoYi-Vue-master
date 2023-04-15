package com.ruoyi.car.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地址信息对象 t_spjin
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TSpjin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long spjinid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spjinname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spjinmark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spjinmark1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spjinmark2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spjinmark3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date spjindate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date spjindate1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spjinzong;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spjinjine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spjinze;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spjintype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spjintype1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long shangpinid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shangpinname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sptypeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sptypename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spcangkuid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spcangkuname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long spgysid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spgysname;

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

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long roleid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rolename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spjinimg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spjinimgname;

    public void setSpjinid(Long spjinid) 
    {
        this.spjinid = spjinid;
    }

    public Long getSpjinid() 
    {
        return spjinid;
    }
    public void setSpjinname(String spjinname) 
    {
        this.spjinname = spjinname;
    }

    public String getSpjinname() 
    {
        return spjinname;
    }
    public void setSpjinmark(String spjinmark) 
    {
        this.spjinmark = spjinmark;
    }

    public String getSpjinmark() 
    {
        return spjinmark;
    }
    public void setSpjinmark1(String spjinmark1) 
    {
        this.spjinmark1 = spjinmark1;
    }

    public String getSpjinmark1() 
    {
        return spjinmark1;
    }
    public void setSpjinmark2(String spjinmark2) 
    {
        this.spjinmark2 = spjinmark2;
    }

    public String getSpjinmark2() 
    {
        return spjinmark2;
    }
    public void setSpjinmark3(String spjinmark3) 
    {
        this.spjinmark3 = spjinmark3;
    }

    public String getSpjinmark3() 
    {
        return spjinmark3;
    }
    public void setSpjindate(Date spjindate) 
    {
        this.spjindate = spjindate;
    }

    public Date getSpjindate() 
    {
        return spjindate;
    }
    public void setSpjindate1(Date spjindate1) 
    {
        this.spjindate1 = spjindate1;
    }

    public Date getSpjindate1() 
    {
        return spjindate1;
    }
    public void setSpjinzong(Long spjinzong) 
    {
        this.spjinzong = spjinzong;
    }

    public Long getSpjinzong() 
    {
        return spjinzong;
    }
    public void setSpjinjine(Long spjinjine) 
    {
        this.spjinjine = spjinjine;
    }

    public Long getSpjinjine() 
    {
        return spjinjine;
    }
    public void setSpjinze(Long spjinze) 
    {
        this.spjinze = spjinze;
    }

    public Long getSpjinze() 
    {
        return spjinze;
    }
    public void setSpjintype(Long spjintype) 
    {
        this.spjintype = spjintype;
    }

    public Long getSpjintype() 
    {
        return spjintype;
    }
    public void setSpjintype1(Long spjintype1) 
    {
        this.spjintype1 = spjintype1;
    }

    public Long getSpjintype1() 
    {
        return spjintype1;
    }
    public void setShangpinid(Long shangpinid) 
    {
        this.shangpinid = shangpinid;
    }

    public Long getShangpinid() 
    {
        return shangpinid;
    }
    public void setShangpinname(String shangpinname) 
    {
        this.shangpinname = shangpinname;
    }

    public String getShangpinname() 
    {
        return shangpinname;
    }
    public void setSptypeid(Long sptypeid) 
    {
        this.sptypeid = sptypeid;
    }

    public Long getSptypeid() 
    {
        return sptypeid;
    }
    public void setSptypename(String sptypename) 
    {
        this.sptypename = sptypename;
    }

    public String getSptypename() 
    {
        return sptypename;
    }
    public void setSpcangkuid(Long spcangkuid) 
    {
        this.spcangkuid = spcangkuid;
    }

    public Long getSpcangkuid() 
    {
        return spcangkuid;
    }
    public void setSpcangkuname(String spcangkuname) 
    {
        this.spcangkuname = spcangkuname;
    }

    public String getSpcangkuname() 
    {
        return spcangkuname;
    }
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
    public void setSpjinimg(String spjinimg) 
    {
        this.spjinimg = spjinimg;
    }

    public String getSpjinimg() 
    {
        return spjinimg;
    }
    public void setSpjinimgname(String spjinimgname) 
    {
        this.spjinimgname = spjinimgname;
    }

    public String getSpjinimgname() 
    {
        return spjinimgname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("spjinid", getSpjinid())
            .append("spjinname", getSpjinname())
            .append("spjinmark", getSpjinmark())
            .append("spjinmark1", getSpjinmark1())
            .append("spjinmark2", getSpjinmark2())
            .append("spjinmark3", getSpjinmark3())
            .append("spjindate", getSpjindate())
            .append("spjindate1", getSpjindate1())
            .append("spjinzong", getSpjinzong())
            .append("spjinjine", getSpjinjine())
            .append("spjinze", getSpjinze())
            .append("spjintype", getSpjintype())
            .append("spjintype1", getSpjintype1())
            .append("shangpinid", getShangpinid())
            .append("shangpinname", getShangpinname())
            .append("sptypeid", getSptypeid())
            .append("sptypename", getSptypename())
            .append("spcangkuid", getSpcangkuid())
            .append("spcangkuname", getSpcangkuname())
            .append("spgysid", getSpgysid())
            .append("spgysname", getSpgysname())
            .append("userid", getUserid())
            .append("username", getUsername())
            .append("bumenid", getBumenid())
            .append("bumenname", getBumenname())
            .append("roleid", getRoleid())
            .append("rolename", getRolename())
            .append("spjinimg", getSpjinimg())
            .append("spjinimgname", getSpjinimgname())
            .toString();
    }
}
