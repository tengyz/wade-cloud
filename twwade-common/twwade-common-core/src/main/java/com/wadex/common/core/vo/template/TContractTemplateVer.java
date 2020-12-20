package com.wadex.common.core.vo.template;

import java.io.Serializable;
import java.util.Date;

/**
 * 模板版本数据库实体
 */
public class TContractTemplateVer implements Serializable {
    private Long id; //模板版本id
    private Long templateId; //模板id
    private Long relationId; //迭代模板id(关联上版本模板Id)
    private Integer versionStatus; //模板版本状态
    private String version; //版本号
    private String localsn; //流水号
    private Long creator; //创建人ID
    private String creatorName; //创建人名称
    private Long companyId; //公司id
    private String companyName; //公司名称
    private Long deptid; //部门id;
    private String deptName; //部门名称
    private Long provinceId; //省份ID
    private String name; //模板名称
    private String we; //我方
    private Integer textSource; //文本来源
    private String scope; //使用范围
    private String comments; //备注
    private Date createtime; //创建时间
    private Date updatetime; //更新时间
    private Integer deleted; //删除标示
    private Integer sourceId; //业务系统ID
    private String sourceName; //业务系统名称
    private Date approveEndtime; //送审结束时间
    private Integer isHistory;//历史版本标示;
    private Integer limitTime;//期限
    private Integer transFlag;//传递标识
    private String ecmSerialnumber;//合同系统模板编号
    private String ecmVersion;//合同系统模板版本号
    private String protocolType;  //协议类型
    private String protocolTypeName;//协议类型名称
    private String templateType; //采购模板类型
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Integer getVersionStatus() {
        return versionStatus;
    }

    public void setVersionStatus(Integer versionStatus) {
        this.versionStatus = versionStatus;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLocalsn() {
        return localsn;
    }

    public void setLocalsn(String localsn) {
        this.localsn = localsn;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWe() {
        return we;
    }

    public void setWe(String we) {
        this.we = we;
    }



    public Integer getTextSource() {
        return textSource;
    }

    public void setTextSource(Integer textSource) {
        this.textSource = textSource;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Date getApproveEndtime() {
        return approveEndtime;
    }

    public void setApproveEndtime(Date approveEndtime) {
        this.approveEndtime = approveEndtime;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public Integer getIsHistory() {
        return isHistory;
    }

    public void setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    public Integer getTransFlag() {
        return transFlag;
    }

    public void setTransFlag(Integer transFlag) {
        this.transFlag = transFlag;
    }

    public String getEcmSerialnumber() {
        return ecmSerialnumber;
    }

    public void setEcmSerialnumber(String ecmSerialnumber) {
        this.ecmSerialnumber = ecmSerialnumber;
    }

    public String getEcmVersion() {
        return ecmVersion;
    }

    public void setEcmVersion(String ecmVersion) {
        this.ecmVersion = ecmVersion;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getProtocolTypeName() {
        return protocolTypeName;
    }

    public void setProtocolTypeName(String protocolTypeName) {
        this.protocolTypeName = protocolTypeName;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

}
