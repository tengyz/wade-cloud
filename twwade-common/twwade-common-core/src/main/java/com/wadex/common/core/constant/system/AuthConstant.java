package com.wadex.common.core.constant.system;

public interface AuthConstant {

    /**
     * 总部公司ID
     */
    public final static long HQCOMPANYID = 1000;
    public final static int FLAG_TRUE = 1;

    public final static int ORGTYPE_COMPANY = 1;
    public final static int ORGTYPE_DEPT = 2;

    // 组织树范围 本公司
    public static final int ORGTREESCOPE_COMPANY = 1;
    // 组织树范围 本部门
    public static final int ORGTREESCOPE_DEPT = 2;
    // 组织树范围 管理范围内组织
    public static final int ORGTREESCOPE_ADMIN = 3;
    // 组织树范围 所有组织
    public static final int ORGTREESCOPE_ALL = 4;
    // 组织树范围 如果是超级管理员则显示所有组织，否则显示管理范围内组织
    public static final int ORGTREESCOPE_ADMINORALL = 5;
    // 组织树范围 除本公司外的其他公司，本部才出现
    public static final int ORGTREESCOPE_OTHERCOMPANY = 6;
    // 组织树范围 除本部外的其他公司
    public static final int ORGTREESCOPE_CENTRAL = 7;
    public static final String SESSION_USER_KEY = "_USER_";

    public static final String COOKIE_USER_PREFIX = "__";
    /**
     * 全国自定义
     */
    public static int CUSTOMPARAM_LEVEL_ALL = 1;
    /**
     * 省分自定义
     */
    public static int CUSTOMPARAM_LEVEL_PROVINCE = 2;
    /**
     * 地市自定义
     */
    public static int CUSTOMPARAM_LEVEL_COMPANY = 3;

    /**
     * 是否审批意见展示最末一级部门配置项
     */
    public static String CUSTOMPARAM_PROPOSAL_CURORG = "proposalByCurOrgTree";
    /**
     * 是否启用成批审批意见反馈功能  add by maheng 2012-3-9
     */
    public static String CUSTOMPARAM_BATCHAPPROVALFEEDBACK = "batchApprovalFeedback";
    /**
     * 是否开启云数据公司采购业务配置项
     */
    public static String IS_CLOUD_COMPANY_WORK = "isCloudCompanyWork";
    /**
     * 应急登陆
     */
    public static String EMERGENCYLOGIN = "emergencyLogin_";
    /**
     * 涉密合同是否启用 add by wangyazhou 2015-06-09
     */
    public static String SECCONTRACTKEY = "SecContract";
    /**
     * 下面4个常量用于定义上海审批流程的起草环节选择后续活动的活动定义ID
     */
    //处室员工（包括处室负责人）-部门副和部门总不是相同的
    public static String chushiLeader = "chushiLeader";
    //处室员工（包括处室负责人）-部门副和部门总是相同的
    public static String chushiSameLeader = "chushiSameLeader";
    //非处室员工-部门副总和部门总不是相同的
    public static String deptSubLeader = "deptSubLeader";
    //非处室员工-部门副总和部门总相同的
    public static String deptLeader = "deptLeader";
    /**
     * 启用审批结束策略优化
     */
    public static String APPROVEOVERTRACTICS = "approveOverTactics";

    /**
     * 启用集团部门时效
     */
    public static String deptTypeAging = "deptTypeAging";
    /**
     * 11：电子合同标准文本发布复核
     */
    public static Integer APPROVALHANGOUT = 11;
    public static String APPROVALHANGOUTNAME = "电子合同标准文本发布复核";
    
    /**
     * 13:电子合同标准文本发布
     */
    public static Integer APPROVALRELEASEREVIEW = 13;
    public static String  APPROVALRELEASEREVIEWNAME = "电子合同标准文本发布";

    public static long[] provinceCode = {11,12,13,14,15,21,22,22,23,31,32,33,34,35,36,37
                                    ,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,1000};
    public  static String AUTH_LOGINTYPE_HRCODE = "1";
    public  static String AUTH_LOGINTYPE_MAIL = "2";
    public  static String AUTH_LOGINTYPE_HRID = "3";
}
