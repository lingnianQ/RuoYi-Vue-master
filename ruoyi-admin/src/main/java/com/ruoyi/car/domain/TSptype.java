package com.ruoyi.car.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 区域信息对象 t_sptype
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TSptype extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long sptypeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sptypename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sptypemark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sptypemark1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sptypemark2;

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
    public void setSptypemark(String sptypemark) 
    {
        this.sptypemark = sptypemark;
    }

    public String getSptypemark() 
    {
        return sptypemark;
    }
    public void setSptypemark1(String sptypemark1) 
    {
        this.sptypemark1 = sptypemark1;
    }

    public String getSptypemark1() 
    {
        return sptypemark1;
    }
    public void setSptypemark2(Long sptypemark2) 
    {
        this.sptypemark2 = sptypemark2;
    }

    public Long getSptypemark2() 
    {
        return sptypemark2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sptypeid", getSptypeid())
            .append("sptypename", getSptypename())
            .append("sptypemark", getSptypemark())
            .append("sptypemark1", getSptypemark1())
            .append("sptypemark2", getSptypemark2())
            .toString();
    }
}
