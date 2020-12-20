package com.wadex.common.core.vo.template;

import java.io.Serializable;
import java.util.Date;

/**
 * 模板对应合同类型明细实体
 */
public class TemplateList implements Serializable {
    //主键
    private Long	id    ;
    //关联ID，对应TEMPLATE表的ID
    private Long relationId   ;
    //对应ID，对应CLASSIFY表的ID
    private Long targetId     ;
    //省份ID
    private Long provinceId   ;
    //创建时间
    private Date createTime   ;
    /**
     * 目前存放合同类型全称
     */
    private String extfield    ;
    //类型，1表示模板对应合同类型明细
    private Integer businessType ;

    //删除字段
    private Integer deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getExtfield() {
        return extfield;
    }

    public void setExtfield(String extfield) {
        this.extfield = extfield;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
