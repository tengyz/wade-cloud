package com.wadex.common.core.vo.template;


import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 文件名称: TContractTemplate.java
 * </p>
 * <p>
 * 文件描述: 业务对象 --用户
 * <p>
 * 版权所有: 版权所有(C)2016
 * </p>
 * <p>
 * 公 司: 拓维信息系统股份有限公司
 * </p>
 * <p>
 * 内容摘要: 模板数据库实体
 * </p>
 * <p>
 * 其他说明: 其它需要说明的情况是…………….
 * </p>
 * <p>
 * 完成日期：2016-11-30
 * </p>
 *
 * @author 贺政
 */
public class TContractTemplate implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long id; //模板ID
    private Long versionId; //模板版本ID
    private int templateStatus; //模板状态
    private Long creator; // 创建人ID
    private String creatorName; //创建人名称
    private Long deptId; //所属部门ID
    private String deptName; //所属部门名称
    private Long companyId; //所属公司ID
    private String companyName; //所属公司名称
    private String serialNumber; //模板编号
    private Date createTime; //创建时间
    private Date updateTime; //修改时间
    private Long provinceId; //省份ID
    private Integer deleted; //删除标示

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public int getTemplateStatus() {
        return templateStatus;
    }

    public void setTemplateStatus(int templateStatus) {
        this.templateStatus = templateStatus;
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

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
