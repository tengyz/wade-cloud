/**
 *
 */
package com.wadex.common.core.constant.system;

/**
 * 权限控制功能点常量定义类
 *
 * @author xixi
 */
public interface FuncDefine {
    /**
     * 菜单功能类
     */
    public final static long MENUCLASS = 101;
    /**
     * 报表功能类
     */
    public final static long REPORTCLASS = 104;
    /**
     * 超级管理 功能点
     */
    public final static long SUPERMANAGE = 1071020111;
    /**
     * 查询范围 本部门
     */
    public final static long QUERYSCOPEDEPT = 1051030001;
    /**
     * 查询范围 本公司
     */
    public final static long QUERYSCOPECOMPANY = 1051030002;
    /**
     * 查询范围 本省
     */
    public final static long QUERYSCOPEPROVINCE = 1051030003;
    /**
     * 查询范围 全国
     */
    public final static long QUERYSCOPEASSIGN = 1051030004;
    /**
     * 集团领导审批页面
     */
    public final static long LEADERPAGE = 1011030072;
    /**
     * 代办集团领导审批页面
     */
    public final static long LEADERPAGE_FinishWorkItem = 1011030088;
    /**
     * 集团秘书审批页面 secretary
     */
    public final static long SECRETARY = 1011030077;
    /**
     * 调整本省流程权限
     */
    public final static long ADJUSTFLOW4PROVINCE = 1111031115;
    /**
     * 流程下一环节不显示“请选择”
     */
    public final static long ISNOTSHOWCHOOSE = 1111031117;
    /**
     * 非处室员工(部门副和部门总是相同的) 上海人员过滤使用
     */
    public final static long CHUSHIUN_SUBEQLEADER = 1131010025;
    /**
     * 非处室员工(部门副和部门总不是相同的) 上海人员过滤使用
     */
    public final static long CHUSHIUN_SUBNQLEADER = 1131010024;
    /**
     * 处室员工(部门副和部门总是相同的)  上海人员过滤使用
     */
    public final static long CHUSHI_SUBEQLEADER = 1131010023;
    /**
     * 调整流程 功能点
     */
    public final static long ADJUSTPROCESS = 1011020061;

    // 电子商城查询集团权限
    public final static long INNORMAIL_SEARCH_10010 = 111101001601L;
    // 电子商城本省权限
    public final static long INNORMAIL_SEARCH_PROVINCE = 111101001602L;
    //电子商城本部门权限
    public final static long INNORMAIL_SEARCH_DEPT = 111101016003L;

    //沃云多云单个合同全国查询权限
    public final static long WOYUN_SIGNCONTRACT_ALL = 111101016001L;
    //沃云多云单个合同省分查询权限
    public final static long WOYUN_SIGNCONTRACT_PROVINCE = 111101016002L;

    //融资租赁查询全国权限
    public static final long FINANCE_LEASE_PROVINCE = 111101016004L;

    /**
     * 方法名称
     */
    public static  final  String AUTH_SELECTTEMPLATEACTION="selectTemplateAction";
    public static  final  String AUTH_QUERYDRAFTINGTEMPLATE="queryDraftingTemplate";
    public static  final  String AUTH_QUERYTEMPLATE="queryTemplate";
    public static  final  String AUTH_ADDTEMPLATESCENE="addTemplateScene";
    public static  final  String AUTH_TOHASBINDTMPANDSCENEPAGE="toHasBindTmpAndScenePage";
    public static  final  String AUTH_TOFREEBOUNDTEMPSCENE="toFreeBoundTempScene";
    public static  final  String AUTH_COMPLEXSEARCH="complexSearch";
}