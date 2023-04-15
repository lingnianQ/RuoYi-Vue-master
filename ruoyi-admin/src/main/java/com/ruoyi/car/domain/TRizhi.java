package com.ruoyi.car.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 日志对象 t_rizhi
 * 
 * @author ruoyi
 * @date 2023-04-15
 */
public class TRizhi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long rizhiid;

    /** 名称 */
    @Excel(name = "名称")
    private String rizhiname;

    /** 登录ip */
    @Excel(name = "登录ip")
    private String dengluip;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    public void setRizhiid(Long rizhiid) 
    {
        this.rizhiid = rizhiid;
    }

    public Long getRizhiid() 
    {
        return rizhiid;
    }
    public void setRizhiname(String rizhiname) 
    {
        this.rizhiname = rizhiname;
    }

    public String getRizhiname() 
    {
        return rizhiname;
    }
    public void setDengluip(String dengluip) 
    {
        this.dengluip = dengluip;
    }

    public String getDengluip() 
    {
        return dengluip;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rizhiid", getRizhiid())
            .append("rizhiname", getRizhiname())
            .append("dengluip", getDengluip())
            .append("date", getDate())
            .toString();
    }
}
