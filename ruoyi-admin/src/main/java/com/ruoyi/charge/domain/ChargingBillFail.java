package com.ruoyi.charge.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 失败订单对象 charging_bill_fail
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public class ChargingBillFail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 订单号 */
    @Excel(name = "订单号")
    private String billNumber;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer userId;

    /** 运营商ID */
    @Excel(name = "运营商ID")
    private Integer operatorId;

    /** 场站ID */
    @Excel(name = "场站ID")
    private Integer stationId;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Integer deviceId;

    /** 订单创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "订单创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderCreateTime;

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
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }
    public void setOperatorId(Integer operatorId) 
    {
        this.operatorId = operatorId;
    }

    public Integer getOperatorId() 
    {
        return operatorId;
    }
    public void setStationId(Integer stationId) 
    {
        this.stationId = stationId;
    }

    public Integer getStationId() 
    {
        return stationId;
    }
    public void setDeviceId(Integer deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Integer getDeviceId() 
    {
        return deviceId;
    }
    public void setOrderCreateTime(Date orderCreateTime) 
    {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCreateTime() 
    {
        return orderCreateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("billNumber", getBillNumber())
            .append("userId", getUserId())
            .append("operatorId", getOperatorId())
            .append("stationId", getStationId())
            .append("deviceId", getDeviceId())
            .append("orderCreateTime", getOrderCreateTime())
            .toString();
    }
}
