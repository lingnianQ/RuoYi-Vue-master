package com.ruoyi.charge.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 运营商对象 charging_operator_info
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public class ChargingOperatorInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 运营商编号 */
    @Excel(name = "运营商编号")
    private String operatorNumber;

    /** 运营商名称 */
    @Excel(name = "运营商名称")
    private String operatorName;

    /** 经营业务 */
    @Excel(name = "经营业务")
    private String business;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 电费 */
    @Excel(name = "电费")
    private Long powerRate;

    /** 服务费 */
    @Excel(name = "服务费")
    private Long serviceFee;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private Integer payType;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setOperatorNumber(String operatorNumber) 
    {
        this.operatorNumber = operatorNumber;
    }

    public String getOperatorNumber() 
    {
        return operatorNumber;
    }
    public void setOperatorName(String operatorName) 
    {
        this.operatorName = operatorName;
    }

    public String getOperatorName() 
    {
        return operatorName;
    }
    public void setBusiness(String business) 
    {
        this.business = business;
    }

    public String getBusiness() 
    {
        return business;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setPowerRate(Long powerRate) 
    {
        this.powerRate = powerRate;
    }

    public Long getPowerRate() 
    {
        return powerRate;
    }
    public void setServiceFee(Long serviceFee) 
    {
        this.serviceFee = serviceFee;
    }

    public Long getServiceFee() 
    {
        return serviceFee;
    }
    public void setPayType(Integer payType) 
    {
        this.payType = payType;
    }

    public Integer getPayType() 
    {
        return payType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("operatorNumber", getOperatorNumber())
            .append("operatorName", getOperatorName())
            .append("business", getBusiness())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("powerRate", getPowerRate())
            .append("serviceFee", getServiceFee())
            .append("payType", getPayType())
            .toString();
    }
}
