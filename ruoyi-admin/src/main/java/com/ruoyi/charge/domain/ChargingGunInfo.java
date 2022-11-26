package com.ruoyi.charge.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 充电枪对象 charging_gun_info
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public class ChargingGunInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String gunNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String gunName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal power;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal electricity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal voltageUpperLimits;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal voltageLowerLimits;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer gunType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer pileId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer gunStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGunNumber(String gunNumber) 
    {
        this.gunNumber = gunNumber;
    }

    public String getGunNumber() 
    {
        return gunNumber;
    }
    public void setGunName(String gunName) 
    {
        this.gunName = gunName;
    }

    public String getGunName() 
    {
        return gunName;
    }
    public void setPower(BigDecimal power) 
    {
        this.power = power;
    }

    public BigDecimal getPower() 
    {
        return power;
    }
    public void setElectricity(BigDecimal electricity) 
    {
        this.electricity = electricity;
    }

    public BigDecimal getElectricity() 
    {
        return electricity;
    }
    public void setVoltageUpperLimits(BigDecimal voltageUpperLimits) 
    {
        this.voltageUpperLimits = voltageUpperLimits;
    }

    public BigDecimal getVoltageUpperLimits() 
    {
        return voltageUpperLimits;
    }
    public void setVoltageLowerLimits(BigDecimal voltageLowerLimits) 
    {
        this.voltageLowerLimits = voltageLowerLimits;
    }

    public BigDecimal getVoltageLowerLimits() 
    {
        return voltageLowerLimits;
    }
    public void setGunType(Integer gunType) 
    {
        this.gunType = gunType;
    }

    public Integer getGunType() 
    {
        return gunType;
    }
    public void setPileId(Integer pileId) 
    {
        this.pileId = pileId;
    }

    public Integer getPileId() 
    {
        return pileId;
    }
    public void setGunStatus(Integer gunStatus) 
    {
        this.gunStatus = gunStatus;
    }

    public Integer getGunStatus() 
    {
        return gunStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gunNumber", getGunNumber())
            .append("gunName", getGunName())
            .append("power", getPower())
            .append("electricity", getElectricity())
            .append("voltageUpperLimits", getVoltageUpperLimits())
            .append("voltageLowerLimits", getVoltageLowerLimits())
            .append("gunType", getGunType())
            .append("pileId", getPileId())
            .append("gunStatus", getGunStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
