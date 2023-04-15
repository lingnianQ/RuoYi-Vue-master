package com.ruoyi.car.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品对象 t_shangpin
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TShangpin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long shangpinid;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String shangpinname;

    /** 商品标志0 */
    @Excel(name = "商品标志0")
    private String shangpinmark;

    /** 商品标志1 */
    @Excel(name = "商品标志1")
    private String shangpinmark1;

    /** 商品标志2 */
    @Excel(name = "商品标志2")
    private String shangpinmark2;

    /** 商品标志3 */
    @Excel(name = "商品标志3")
    private String shangpinmark3;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shangpindate;

    /** 日期2 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期2", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shangpindate1;

    /** 商品库存 */
    @Excel(name = "商品库存")
    private Long shangpinzong;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private Long shangpinjin;

    /** 商品销量 */
    @Excel(name = "商品销量")
    private Long shangpinxiao;

    /** 商品利润 */
    @Excel(name = "商品利润")
    private Long shangpinlirun;

    /** 商品类型 */
    @Excel(name = "商品类型")
    private Long shangpintype;

    /** 商品类型2 */
    @Excel(name = "商品类型2")
    private Long shangpintype1;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String shangpinimg;

    /** 商品图片名 */
    @Excel(name = "商品图片名")
    private String shangpinimgname;

    /** 类型编号 */
    @Excel(name = "类型编号")
    private Long sptypeid;

    /** 类型名 */
    @Excel(name = "类型名")
    private String sptypename;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private Long userid;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 部门编号 */
    @Excel(name = "部门编号")
    private Long bumenid;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String bumenname;

    /** 角色编号 */
    @Excel(name = "角色编号")
    private Long roleid;

    /** 角色名 */
    @Excel(name = "角色名")
    private String rolename;

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
    public void setShangpinmark(String shangpinmark) 
    {
        this.shangpinmark = shangpinmark;
    }

    public String getShangpinmark() 
    {
        return shangpinmark;
    }
    public void setShangpinmark1(String shangpinmark1) 
    {
        this.shangpinmark1 = shangpinmark1;
    }

    public String getShangpinmark1() 
    {
        return shangpinmark1;
    }
    public void setShangpinmark2(String shangpinmark2) 
    {
        this.shangpinmark2 = shangpinmark2;
    }

    public String getShangpinmark2() 
    {
        return shangpinmark2;
    }
    public void setShangpinmark3(String shangpinmark3) 
    {
        this.shangpinmark3 = shangpinmark3;
    }

    public String getShangpinmark3() 
    {
        return shangpinmark3;
    }
    public void setShangpindate(Date shangpindate) 
    {
        this.shangpindate = shangpindate;
    }

    public Date getShangpindate() 
    {
        return shangpindate;
    }
    public void setShangpindate1(Date shangpindate1) 
    {
        this.shangpindate1 = shangpindate1;
    }

    public Date getShangpindate1() 
    {
        return shangpindate1;
    }
    public void setShangpinzong(Long shangpinzong) 
    {
        this.shangpinzong = shangpinzong;
    }

    public Long getShangpinzong() 
    {
        return shangpinzong;
    }
    public void setShangpinjin(Long shangpinjin) 
    {
        this.shangpinjin = shangpinjin;
    }

    public Long getShangpinjin() 
    {
        return shangpinjin;
    }
    public void setShangpinxiao(Long shangpinxiao) 
    {
        this.shangpinxiao = shangpinxiao;
    }

    public Long getShangpinxiao() 
    {
        return shangpinxiao;
    }
    public void setShangpinlirun(Long shangpinlirun) 
    {
        this.shangpinlirun = shangpinlirun;
    }

    public Long getShangpinlirun() 
    {
        return shangpinlirun;
    }
    public void setShangpintype(Long shangpintype) 
    {
        this.shangpintype = shangpintype;
    }

    public Long getShangpintype() 
    {
        return shangpintype;
    }
    public void setShangpintype1(Long shangpintype1) 
    {
        this.shangpintype1 = shangpintype1;
    }

    public Long getShangpintype1() 
    {
        return shangpintype1;
    }
    public void setShangpinimg(String shangpinimg) 
    {
        this.shangpinimg = shangpinimg;
    }

    public String getShangpinimg() 
    {
        return shangpinimg;
    }
    public void setShangpinimgname(String shangpinimgname) 
    {
        this.shangpinimgname = shangpinimgname;
    }

    public String getShangpinimgname() 
    {
        return shangpinimgname;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("shangpinid", getShangpinid())
            .append("shangpinname", getShangpinname())
            .append("shangpinmark", getShangpinmark())
            .append("shangpinmark1", getShangpinmark1())
            .append("shangpinmark2", getShangpinmark2())
            .append("shangpinmark3", getShangpinmark3())
            .append("shangpindate", getShangpindate())
            .append("shangpindate1", getShangpindate1())
            .append("shangpinzong", getShangpinzong())
            .append("shangpinjin", getShangpinjin())
            .append("shangpinxiao", getShangpinxiao())
            .append("shangpinlirun", getShangpinlirun())
            .append("shangpintype", getShangpintype())
            .append("shangpintype1", getShangpintype1())
            .append("shangpinimg", getShangpinimg())
            .append("shangpinimgname", getShangpinimgname())
            .append("sptypeid", getSptypeid())
            .append("sptypename", getSptypename())
            .append("userid", getUserid())
            .append("username", getUsername())
            .append("bumenid", getBumenid())
            .append("bumenname", getBumenname())
            .append("roleid", getRoleid())
            .append("rolename", getRolename())
            .toString();
    }
}
