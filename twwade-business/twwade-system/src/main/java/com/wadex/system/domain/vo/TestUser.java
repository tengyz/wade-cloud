package com.wadex.system.domain.vo;

import com.wadex.common.core.annotation.Excel;
import com.wadex.common.core.annotation.Excel.ColumnType;
import com.wadex.common.core.web.domain.BaseEntity;

/**
 * 用户对象 sys_user
 * 
 * @author twwade
 */
public class TestUser extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /** 用户ID */
    @Excel(name = "用户序号", cellType = ColumnType.NUMERIC, prompt = "用户编号")
    private Long userId;
    
    /** 部门ID */
    @Excel(name = "部门编号", cellType = ColumnType.NUMERIC, prompt = "用户编号")
    private Long deptId;
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public Long getDeptId() {
        return deptId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
    
}
