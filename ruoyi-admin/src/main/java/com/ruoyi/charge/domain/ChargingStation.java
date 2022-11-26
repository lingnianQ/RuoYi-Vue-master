package com.ruoyi.charge.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 充电站对象 charging_station
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public class ChargingStation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主ID */
    private Integer id;

    /** 站场编码 */
    @Excel(name = "站场编码")
    private String stationCode;

    /** 场站名称 */
    @Excel(name = "场站名称")
    private String stationName;

    /** 充电桩数 */
    @Excel(name = "充电桩数")
    private Integer deviceNumber;

    /** 交流充电枪数 */
    @Excel(name = "交流充电枪数")
    private Integer acGunNumber;

    /** 直流充电枪数 */
    @Excel(name = "直流充电枪数")
    private Integer dcGunNumber;

    /** 交流额定功率 */
    @Excel(name = "交流额定功率")
    private Integer acRatePower;

    /** 直流额定功率 */
    @Excel(name = "直流额定功率")
    private Integer dcRatePower;

    /** 省份编码 */
    @Excel(name = "省份编码")
    private String province;

    /** 城市编码 */
    @Excel(name = "城市编码")
    private String city;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String address;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal stationLng;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal stationLat;

    /** 设备功率 */
    @Excel(name = "设备功率")
    private Integer devicePower;

    /** 场站模式（1自营、2联营、3专用） */
    @Excel(name = "场站模式", readConverterExp = "1=自营、2联营、3专用")
    private Integer stationModel;

    /** 场站状态 */
    @Excel(name = "场站状态")
    private Integer stationStatus;

    /** 场站类型（公共、个人、专用、其它） */
    @Excel(name = "场站类型", readConverterExp = "公=共、个人、专用、其它")
    private Integer stationType;

    /** 记录调整时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录调整时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date stationModified;

    /** 记录创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date stationCreate;

    /** 运营商ID */
    @Excel(name = "运营商ID")
    private Integer operatorId;

    /** 停车费 */
    @Excel(name = "停车费")
    private Long parkFee;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setStationCode(String stationCode) 
    {
        this.stationCode = stationCode;
    }

    public String getStationCode() 
    {
        return stationCode;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setDeviceNumber(Integer deviceNumber) 
    {
        this.deviceNumber = deviceNumber;
    }

    public Integer getDeviceNumber() 
    {
        return deviceNumber;
    }
    public void setAcGunNumber(Integer acGunNumber) 
    {
        this.acGunNumber = acGunNumber;
    }

    public Integer getAcGunNumber() 
    {
        return acGunNumber;
    }
    public void setDcGunNumber(Integer dcGunNumber) 
    {
        this.dcGunNumber = dcGunNumber;
    }

    public Integer getDcGunNumber() 
    {
        return dcGunNumber;
    }
    public void setAcRatePower(Integer acRatePower) 
    {
        this.acRatePower = acRatePower;
    }

    public Integer getAcRatePower() 
    {
        return acRatePower;
    }
    public void setDcRatePower(Integer dcRatePower) 
    {
        this.dcRatePower = dcRatePower;
    }

    public Integer getDcRatePower() 
    {
        return dcRatePower;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setStationLng(BigDecimal stationLng) 
    {
        this.stationLng = stationLng;
    }

    public BigDecimal getStationLng() 
    {
        return stationLng;
    }
    public void setStationLat(BigDecimal stationLat) 
    {
        this.stationLat = stationLat;
    }

    public BigDecimal getStationLat() 
    {
        return stationLat;
    }
    public void setDevicePower(Integer devicePower) 
    {
        this.devicePower = devicePower;
    }

    public Integer getDevicePower() 
    {
        return devicePower;
    }
    public void setStationModel(Integer stationModel) 
    {
        this.stationModel = stationModel;
    }

    public Integer getStationModel() 
    {
        return stationModel;
    }
    public void setStationStatus(Integer stationStatus) 
    {
        this.stationStatus = stationStatus;
    }

    public Integer getStationStatus() 
    {
        return stationStatus;
    }
    public void setStationType(Integer stationType) 
    {
        this.stationType = stationType;
    }

    public Integer getStationType() 
    {
        return stationType;
    }
    public void setStationModified(Date stationModified) 
    {
        this.stationModified = stationModified;
    }

    public Date getStationModified() 
    {
        return stationModified;
    }
    public void setStationCreate(Date stationCreate) 
    {
        this.stationCreate = stationCreate;
    }

    public Date getStationCreate() 
    {
        return stationCreate;
    }
    public void setOperatorId(Integer operatorId) 
    {
        this.operatorId = operatorId;
    }

    public Integer getOperatorId() 
    {
        return operatorId;
    }
    public void setParkFee(Long parkFee) 
    {
        this.parkFee = parkFee;
    }

    public Long getParkFee() 
    {
        return parkFee;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stationCode", getStationCode())
            .append("stationName", getStationName())
            .append("deviceNumber", getDeviceNumber())
            .append("acGunNumber", getAcGunNumber())
            .append("dcGunNumber", getDcGunNumber())
            .append("acRatePower", getAcRatePower())
            .append("dcRatePower", getDcRatePower())
            .append("province", getProvince())
            .append("city", getCity())
            .append("address", getAddress())
            .append("stationLng", getStationLng())
            .append("stationLat", getStationLat())
            .append("devicePower", getDevicePower())
            .append("stationModel", getStationModel())
            .append("stationStatus", getStationStatus())
            .append("stationType", getStationType())
            .append("stationModified", getStationModified())
            .append("stationCreate", getStationCreate())
            .append("operatorId", getOperatorId())
            .append("parkFee", getParkFee())
            .toString();
    }
}
