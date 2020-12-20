package com.wadex.common.core.vo.template;/**
 * Created by simple on 2016/12/19.
 */

import java.io.Serializable;

/**
 * BusinessPermissionCondition:业务系统权限查询条件Bean
 *
 * @author he zheng
 * @content
 * @date 2016/12/19
 **/
public class BusinessPermissionCondition implements Serializable {

    private static final long serialVersionUID = 2664320022771359180L;
    private Long provinceId;
    private Long companyId;
    private Long createor;
    private Integer businessId; //业务系统ID
    private Long deptId;
    private Long search10010;

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCreateor() {
        return createor;
    }

    public void setCreateor(Long createor) {
        this.createor = createor;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getSearch10010() {
        return search10010;
    }

    public void setSearch10010(Long search10010) {
        this.search10010 = search10010;
    }
}
