package com.ruoyi.project.jiayin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 jiayin_draft
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
public class Draft extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 面积 */
    @Excel(name = "面积")
    private Long area;

    /** 价格 */
    @Excel(name = "价格")
    private Long price;

    /** 期限 */
    @Excel(name = "期限")
    private Long term;

    /** 地区 */
    @Excel(name = "地区")
    private String region;

    /** 距退休 */
    @Excel(name = "距退休")
    private Long distanceRetirement;

    /** 土地介绍 */
    @Excel(name = "土地介绍")
    private String landIntroduce;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** (出租,买卖) */
    @Excel(name = "(出租,买卖)")
    private Long transactionType;

    /** 逻辑删除 */
    private Long delFlag;

    /** (已发布 未发布) */
    @Excel(name = "(已发布 未发布)")
    private Long status;

    /** (个人 农场) */
    @Excel(name = "(个人 农场)")
    private Long landType;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setArea(Long area) 
    {
        this.area = area;
    }

    public Long getArea() 
    {
        return area;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setTerm(Long term) 
    {
        this.term = term;
    }

    public Long getTerm() 
    {
        return term;
    }
    public void setRegion(String region) 
    {
        this.region = region;
    }

    public String getRegion() 
    {
        return region;
    }
    public void setDistanceRetirement(Long distanceRetirement) 
    {
        this.distanceRetirement = distanceRetirement;
    }

    public Long getDistanceRetirement() 
    {
        return distanceRetirement;
    }
    public void setLandIntroduce(String landIntroduce) 
    {
        this.landIntroduce = landIntroduce;
    }

    public String getLandIntroduce() 
    {
        return landIntroduce;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setTransactionType(Long transactionType) 
    {
        this.transactionType = transactionType;
    }

    public Long getTransactionType() 
    {
        return transactionType;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setLandType(Long landType) 
    {
        this.landType = landType;
    }

    public Long getLandType() 
    {
        return landType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("area", getArea())
            .append("price", getPrice())
            .append("term", getTerm())
            .append("region", getRegion())
            .append("distanceRetirement", getDistanceRetirement())
            .append("landIntroduce", getLandIntroduce())
            .append("title", getTitle())
            .append("transactionType", getTransactionType())
            .append("delFlag", getDelFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("status", getStatus())
            .append("landType", getLandType())
            .toString();
    }
}
