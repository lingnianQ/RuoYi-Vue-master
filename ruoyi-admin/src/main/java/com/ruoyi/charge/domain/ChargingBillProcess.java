package com.ruoyi.charge.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 进行订单对象 charging_bill_process
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public class ChargingBillProcess extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 订单号 */
    private String billNumber;

    /** 充电量（kwh） */
    @Excel(name = "充电量", readConverterExp = "k=wh")
    private Integer chargingCapacity;

    /** 电费 */
    @Excel(name = "电费")
    private BigDecimal electricMoney;

    /** 服务费 */
    @Excel(name = "服务费")
    private BigDecimal serviceMoney;

    /** 充电时长 */
    @Excel(name = "充电时长")
    private Long chargingDuration;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 运营商ID */
    @Excel(name = "运营商ID")
    private Long operatorId;

    /** 场站ID */
    @Excel(name = "场站ID")
    private Long stationId;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Long deviceId;

    /** 充电开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "充电开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chargingStartTime;

    /** 充电结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "充电结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chargingEndTime;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private Integer billStatus;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private BigDecimal payAmount;

    /** 支付时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payTime;

    /** 支付渠道 */
    @Excel(name = "支付渠道")
    private Integer payChannel;

    /** 电量比例 */
    @Excel(name = "电量比例")
    private Integer rateCapacity;

    /** 总电量 */
    @Excel(name = "总电量")
    private Integer totalCapacity;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setBillNumber(String billNumber) 
    {
        this.billNumber = billNumber;
    }

    public String getBillNumber() 
    {
        return billNumber;
    }
    public void setChargingCapacity(Integer chargingCapacity) 
    {
        this.chargingCapacity = chargingCapacity;
    }

    public Integer getChargingCapacity() 
    {
        return chargingCapacity;
    }
    public void setElectricMoney(BigDecimal electricMoney) 
    {
        this.electricMoney = electricMoney;
    }

    public BigDecimal getElectricMoney() 
    {
        return electricMoney;
    }
    public void setServiceMoney(BigDecimal serviceMoney) 
    {
        this.serviceMoney = serviceMoney;
    }

    public BigDecimal getServiceMoney() 
    {
        return serviceMoney;
    }
    public void setChargingDuration(Long chargingDuration) 
    {
        this.chargingDuration = chargingDuration;
    }

    public Long getChargingDuration() 
    {
        return chargingDuration;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setOperatorId(Long operatorId) 
    {
        this.operatorId = operatorId;
    }

    public Long getOperatorId() 
    {
        return operatorId;
    }
    public void setStationId(Long stationId) 
    {
        this.stationId = stationId;
    }

    public Long getStationId() 
    {
        return stationId;
    }
    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setChargingStartTime(Date chargingStartTime) 
    {
        this.chargingStartTime = chargingStartTime;
    }

    public Date getChargingStartTime() 
    {
        return chargingStartTime;
    }
    public void setChargingEndTime(Date chargingEndTime) 
    {
        this.chargingEndTime = chargingEndTime;
    }

    public Date getChargingEndTime() 
    {
        return chargingEndTime;
    }
    public void setBillStatus(Integer billStatus) 
    {
        this.billStatus = billStatus;
    }

    public Integer getBillStatus() 
    {
        return billStatus;
    }
    public void setPayAmount(BigDecimal payAmount) 
    {
        this.payAmount = payAmount;
    }

    public BigDecimal getPayAmount() 
    {
        return payAmount;
    }
    public void setPayTime(Date payTime) 
    {
        this.payTime = payTime;
    }

    public Date getPayTime() 
    {
        return payTime;
    }
    public void setPayChannel(Integer payChannel) 
    {
        this.payChannel = payChannel;
    }

    public Integer getPayChannel() 
    {
        return payChannel;
    }
    public void setRateCapacity(Integer rateCapacity) 
    {
        this.rateCapacity = rateCapacity;
    }

    public Integer getRateCapacity() 
    {
        return rateCapacity;
    }
    public void setTotalCapacity(Integer totalCapacity) 
    {
        this.totalCapacity = totalCapacity;
    }

    public Integer getTotalCapacity() 
    {
        return totalCapacity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("billNumber", getBillNumber())
            .append("chargingCapacity", getChargingCapacity())
            .append("electricMoney", getElectricMoney())
            .append("serviceMoney", getServiceMoney())
            .append("chargingDuration", getChargingDuration())
            .append("userId", getUserId())
            .append("operatorId", getOperatorId())
            .append("stationId", getStationId())
            .append("deviceId", getDeviceId())
            .append("chargingStartTime", getChargingStartTime())
            .append("chargingEndTime", getChargingEndTime())
            .append("billStatus", getBillStatus())
            .append("payAmount", getPayAmount())
            .append("payTime", getPayTime())
            .append("payChannel", getPayChannel())
            .append("createTime", getCreateTime())
            .append("rateCapacity", getRateCapacity())
            .append("totalCapacity", getTotalCapacity())
            .toString();
    }
}
