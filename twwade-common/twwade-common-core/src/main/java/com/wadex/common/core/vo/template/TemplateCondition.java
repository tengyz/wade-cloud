package com.wadex.common.core.vo.template;/**
 * Created by simple on 2016/12/19.
 */


import java.util.Date;
import java.util.List;

import com.wadex.common.core.vo.auth.DataItemVo;

/**
 * TemplateCondition
 *
 * @author he zheng
 * @content
 * @date 2016/12/19
 **/
public class TemplateCondition extends TContractTemplateVer {
    private static final long serialVersionUID = 1219349293219118786L;
    private List<BusinessPermissionCondition> businessPermissionConditions;//所有系统业务查询权限
    private String serialNumber; //模板编号
    private String WeId;//我方主体编号
    private Date startTime;
    private Date endTime;//查询文本的时间条件  开始日期和结束日期

    private String sceneCode;//场景编号
    private String sceneDesc;//场景描述
    private String transactionObj;//交易对象

    private String userId;//登录人Id

    private String deptId;//登录人部门Id

    private String isBinding; //是否绑定场景或解除绑定

    private String isQueryPermissions;//是否开启查看非融资租赁审批过的标准文本权限

    private String isFinanceLeaseProvince; //权限是否分配查看融资租赁全国权限
    private String templateRole;//标准文本查看权限
    private List<DataItemVo> querybusList;//下拉业务系统

    public String getTransactionObj() {
        return transactionObj;
    }

    public void setTransactionObj(String transactionObj) {
        this.transactionObj = transactionObj;
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }

    public String getSceneDesc() {
        return sceneDesc;
    }

    public void setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
    }

    public List<BusinessPermissionCondition> getBusinessPermissionConditions() {
        return businessPermissionConditions;
    }

    public void setBusinessPermissionConditions(List<BusinessPermissionCondition> businessPermissionConditions) {
        this.businessPermissionConditions = businessPermissionConditions;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getWeId() {
        return WeId;
    }

    public void setWeId(String weId) {
        WeId = weId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsBinding() {
        return isBinding;
    }

    public void setIsBinding(String isBinding) {
        this.isBinding = isBinding;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getIsQueryPermissions() {
        return isQueryPermissions;
    }

    public void setIsQueryPermissions(String isQueryPermissions) {
        this.isQueryPermissions = isQueryPermissions;
    }

    public String getIsFinanceLeaseProvince() {
        return isFinanceLeaseProvince;
    }

    public void setIsFinanceLeaseProvince(String isFinanceLeaseProvince) {
        this.isFinanceLeaseProvince = isFinanceLeaseProvince;
    }

    public String getTemplateRole() {
        return templateRole;
    }

    public void setTemplateRole(String templateRole) {
        this.templateRole = templateRole;
    }

    public List<DataItemVo> getQuerybusList() {
        return querybusList;
    }

    public void setQuerybusList(List<DataItemVo> querybusList) {
        this.querybusList = querybusList;
    }
}
