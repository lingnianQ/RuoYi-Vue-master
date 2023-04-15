package com.ruoyi.car.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆信息对象 t_spcangku
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TSpcangku extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long spcangkuid;

    /** 车牌 */
    @Excel(name = "车牌")
    private String spcangkuname;

    /** 标志1 */
    @Excel(name = "标志1")
    private String spcangkumark;

    /** 标志2 */
    @Excel(name = "标志2")
    private String spcangkumark1;

    /** 标志3 */
    @Excel(name = "标志3")
    private String spcangkumark2;

    /** 标志4 */
    @Excel(name = "标志4")
    private String spcangkuphone;

    /** 地址 */
    @Excel(name = "地址")
    private String spcangkudizhi;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date spcangkudate;

    /** 日期1 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期1", width = 30, dateFormat = "yyyy-MM-dd")
    private Date spcangkudate1;

    /** 类型 */
    @Excel(name = "类型")
    private Long spcangkutype;

    /** 类型1 */
    @Excel(name = "类型1")
    private Long spcangkutype1;

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
    public void setSpcangkumark(String spcangkumark) 
    {
        this.spcangkumark = spcangkumark;
    }

    public String getSpcangkumark() 
    {
        return spcangkumark;
    }
    public void setSpcangkumark1(String spcangkumark1) 
    {
        this.spcangkumark1 = spcangkumark1;
    }

    public String getSpcangkumark1() 
    {
        return spcangkumark1;
    }
    public void setSpcangkumark2(String spcangkumark2) 
    {
        this.spcangkumark2 = spcangkumark2;
    }

    public String getSpcangkumark2() 
    {
        return spcangkumark2;
    }
    public void setSpcangkuphone(String spcangkuphone) 
    {
        this.spcangkuphone = spcangkuphone;
    }

    public String getSpcangkuphone() 
    {
        return spcangkuphone;
    }
    public void setSpcangkudizhi(String spcangkudizhi) 
    {
        this.spcangkudizhi = spcangkudizhi;
    }

    public String getSpcangkudizhi() 
    {
        return spcangkudizhi;
    }
    public void setSpcangkudate(Date spcangkudate) 
    {
        this.spcangkudate = spcangkudate;
    }

    public Date getSpcangkudate() 
    {
        return spcangkudate;
    }
    public void setSpcangkudate1(Date spcangkudate1) 
    {
        this.spcangkudate1 = spcangkudate1;
    }

    public Date getSpcangkudate1() 
    {
        return spcangkudate1;
    }
    public void setSpcangkutype(Long spcangkutype) 
    {
        this.spcangkutype = spcangkutype;
    }

    public Long getSpcangkutype() 
    {
        return spcangkutype;
    }
    public void setSpcangkutype1(Long spcangkutype1) 
    {
        this.spcangkutype1 = spcangkutype1;
    }

    public Long getSpcangkutype1() 
    {
        return spcangkutype1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("spcangkuid", getSpcangkuid())
            .append("spcangkuname", getSpcangkuname())
            .append("spcangkumark", getSpcangkumark())
            .append("spcangkumark1", getSpcangkumark1())
            .append("spcangkumark2", getSpcangkumark2())
            .append("spcangkuphone", getSpcangkuphone())
            .append("spcangkudizhi", getSpcangkudizhi())
            .append("spcangkudate", getSpcangkudate())
            .append("spcangkudate1", getSpcangkudate1())
            .append("spcangkutype", getSpcangkutype())
            .append("spcangkutype1", getSpcangkutype1())
            .toString();
    }
}
