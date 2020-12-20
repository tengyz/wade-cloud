package com.wadex.common.core.vo.template;

import java.io.Serializable;

/**
 * 模板编辑Formbean
 */
public class ContractTemplateVerBean extends TContractTemplateVer implements Serializable {
    private String serialNumber; //模板编号;
    private String versionStatusName; //模板版本状态名称
    private Integer templateStatus;//模板状态
    private String classify; //模板类别
    private String classifyName; //模板类别名称
    private String weId; //我方主体Id拼接

    private String userName; //待办人名称

    private String mobile;//待办人电话

    private Long deptId;//部门id
    private String deptName;//部门名称

    //登录人ID
    private  String userId;

    //排序
    private String orderBy;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getVersionStatusName() {
        return versionStatusName;
    }

    public void setVersionStatusName(String versionStatusName) {
        this.versionStatusName = versionStatusName;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getWeId() {
        return weId;
    }

    public void setWeId(String weId) {
        this.weId = weId;
    }

    public Integer getTemplateStatus() {
        return templateStatus;
    }

    public void setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
