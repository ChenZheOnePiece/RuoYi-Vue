package com.ruoyi.project.jiayin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 jiayin_history_record
 * 
 * @author ruoyi
 * @date 2019-12-15
 */
public class HistoryRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 农场土地表主键 */
    @Excel(name = "农场土地表主键")
    private String farmLandId;

    /** 用户id */
    @Excel(name = "用户id")
    private String userId;

    /** 逻辑删除 */
    private Long delFlag;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setFarmLandId(String farmLandId) 
    {
        this.farmLandId = farmLandId;
    }

    public String getFarmLandId() 
    {
        return farmLandId;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("farmLandId", getFarmLandId())
            .append("userId", getUserId())
            .append("delFlag", getDelFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
