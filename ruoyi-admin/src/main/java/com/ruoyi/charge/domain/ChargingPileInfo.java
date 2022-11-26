package com.ruoyi.charge.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 充电桩对象 charging_pile_info
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public class ChargingPileInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 桩编号 */
    @Excel(name = "桩编号")
    private String pileNumber;

    /** 桩名称 */
    @Excel(name = "桩名称")
    private String pileName;

    /** 枪编号[] */
    @Excel(name = "枪编号[]")
    private String gunInfos;

    /** 额定总功率 */
    @Excel(name = "额定总功率")
    private BigDecimal power;

    /** 设备类型(直/交流、交直一体、其它) */
    @Excel(name = "设备类型(直/交流、交直一体、其它)")
    private Integer pileType;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private Integer pileModel;

    /** 协议 */
    @Excel(name = "协议")
    private Integer protocol;

    /** 网络 */
    @Excel(name = "网络")
    private Integer network;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal pileLng;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal pileLat;

    /** 场站ID */
    @Excel(name = "场站ID")
    private Integer stationId;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setPileNumber(String pileNumber) 
    {
        this.pileNumber = pileNumber;
    }

    public String getPileNumber() 
    {
        return pileNumber;
    }
    public void setPileName(String pileName) 
    {
        this.pileName = pileName;
    }

    public String getPileName() 
    {
        return pileName;
    }
    public void setGunInfos(String gunInfos) 
    {
        this.gunInfos = gunInfos;
    }

    public String getGunInfos() 
    {
        return gunInfos;
    }
    public void setPower(BigDecimal power) 
    {
        this.power = power;
    }

    public BigDecimal getPower() 
    {
        return power;
    }
    public void setPileType(Integer pileType) 
    {
        this.pileType = pileType;
    }

    public Integer getPileType() 
    {
        return pileType;
    }
    public void setPileModel(Integer pileModel) 
    {
        this.pileModel = pileModel;
    }

    public Integer getPileModel() 
    {
        return pileModel;
    }
    public void setProtocol(Integer protocol) 
    {
        this.protocol = protocol;
    }

    public Integer getProtocol() 
    {
        return protocol;
    }
    public void setNetwork(Integer network) 
    {
        this.network = network;
    }

    public Integer getNetwork() 
    {
        return network;
    }
    public void setPileLng(BigDecimal pileLng) 
    {
        this.pileLng = pileLng;
    }

    public BigDecimal getPileLng() 
    {
        return pileLng;
    }
    public void setPileLat(BigDecimal pileLat) 
    {
        this.pileLat = pileLat;
    }

    public BigDecimal getPileLat() 
    {
        return pileLat;
    }
    public void setStationId(Integer stationId) 
    {
        this.stationId = stationId;
    }

    public Integer getStationId() 
    {
        return stationId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pileNumber", getPileNumber())
            .append("pileName", getPileName())
            .append("gunInfos", getGunInfos())
            .append("power", getPower())
            .append("pileType", getPileType())
            .append("pileModel", getPileModel())
            .append("protocol", getProtocol())
            .append("network", getNetwork())
            .append("pileLng", getPileLng())
            .append("pileLat", getPileLat())
            .append("stationId", getStationId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
