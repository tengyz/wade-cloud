/**
 *
 */
package com.wadex.common.core.constant.system;


import com.wadex.common.core.utils.LoadDataConfig;

/**
 * 数据字典和数据字典项常量定义类
 *
 * @author xixi
 */
public interface DataType {

    public final static long SUPPER_USER = 1071020111L;
    /**
     * 流程业务类型 数据字典
     */
    public final static int BUSSINESSTYPE = 1101;
    /**
     * 流程业务类型 模板生效数据字典项
     */
    public final static int BUSSINESSTYPE_TEMPLATEACCEPT = 10;
    /**
     * 流程业务类型 模板失效数据字典项
     */
    public final static int BUSSINESSTYPE_TEMPLATEINVALID = 11;
    /**
     * 流程业务类型 模板修订数据字典项
     */
    public final static int BUSSINESSTYPE_TEMPLATEMODIFY = 12;
    /**
     * 流程业务类型 简易合同数据字典项
     */
    public final static int BUSSINESSTYPE_SIMPLECONTRACT = 20;
    /**
     * 流程业务类型 一般合同数据字典项
     */
    public final static int BUSSINESSTYPE_ADDITIONAL = 27;
    /**
     * 流程业务类型 水印控制数据字典项
     */
    public final static int BUSSINESSTYPE_WATERMARKCONTROL = 22;
    /**
     * 流程业务类型 工作移交数据字典项
     */
    public final static int BUSSINESSTYPE_WORKHANDOVER = 23;
    /**
     * 流程业务类型 合同借阅数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTBORROW = 24;
    /**
     * 流程业务类型 违约纠纷数据字典项
     */
    public final static int BUSSINESSTYPE_DISPUTE = 25;
    /**
     * 流程业务类型 签订盖章字典项
     */
    public final static int BUSSINESSTYPE_SIGN = 26;
    /**
     * 流程业务类型 补录合同数据字典项
     */
    public final static int BUSSINESSTYPE_NORMALCONTRACT = 21;
    /**
     * 流程业务类型 合同续签数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTRENEWAL = 31;
    /**
     * 流程业务类型 合同补充数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTADDITIONAL = 32;
    /**
     * 流程业务类型 合同变更数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTCHANGE = 33;
    /**
     * 流程业务类型 合同中止数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTSUSPENDED = 34;//无此类型
    /**
     * 流程业务类型 合同办结数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTCOMPLETED = 35;
    /**
     * 流程业务类型 合同作废数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTINVALID = 36;
    /**
     * 流程业务类型 合同终止解除数据字典项
     */
    public final static int BUSSINESSTYPE_CONTRACTTERMINATED = 37;
    /**
     * 流程配置来源系统数据字典项
     */
    public final static int BUSSINESSTYPE_COMEFROM = 1350;
    /**
     * 合同使用模板对应审批流程的配置项,合同使用的模板类型数据字典项
     */
    public final static int BUSSINESSTYPE_TEMPLATE = 1507;


    /**
     * 流程业务权限 数据字典
     */
    public final static int BIZPERMISSION = 1102;

    /**
     * 流程业务权限 生成正文 数据字典项
     */
    public final static int BIZPERMISSION_CREATEDOC = 1;

    /**
     * 流程业务权限 自动提交 数据字典项
     */
    public final static int BIZPERMISSION_AUTOSUBMIT = 2;

    /**
     * 流程业务权限 业务参与者 数据字典项
     */
    public final static int BIZPERMISSION_BIZPARTICIPANT = 4;

    /**
     * 流程业务权限 业务条件控制 数据字典项
     */
    public final static int BIZPERMISSION_BIZCONTROL = 8;

    /**
     * 流程业务权限 允许退回承办人 数据字典项
     */
    public final static int BIZPERMISSION_ALLOWSENDBACKCREATOR = 32;

    /**
     * 流程业务权限 允许调整分支 数据字典项
     */
    public final static int BIZPERMISSION_ALLOWADJUSTSUBFLOW = 64;

    /**
     * 流程业务权限 允许退回上一步 数据字典项
     */
    public final static int BIZPERMISSION_ALLOWSENDBACK = 128;

    /**
     * 流程业务权限 禁止承办人退回此环节 数据字典项
     */
    public final static int BIZPERMISSION_FORBIDCREATORSENDBACK = 256;

    /**
     * 流程业务权限 允许转发 数据字典项
     */
    public final static int BIZPERMISSION_ALLOWDELEGATE = 512;

    /**
     * 审批最终参与者
     */
    public final static int BIZPERMISSION_FINALPART = 2048;
    /**
     * 流程业务权限 会签部门 数据字典项
     */
    public final static int BIZPERMISSION_SIGNDEPT = 4096;
    /**
     * 流程业务权限 允许同意并提交 数据字典项
     */
    public final static int BIZPERMISSION_AGREETOSUBMIT = 8192;

    /**
     * 流程业务权限 允许填写意见 数据字典项
     */
    public final static int BIZPERMISSION_FILLOPINION = 16384;

    /**
     * 流程业务权限 环节自循环 数据字典项
     */
    public final static int BIZPERMISSION_SUBMITSELF = 32768;

    /**
     * 流程业务权限 取消审批 数据字典项
     */
    public final static int BIZPERMISSION_CANCELAPP = 65536;

    /**
     * 流程业务权限 必填意见 数据字典项 与允许填写意见配合使用 add by 陈小峰
     */
    public final static int BIZPERMISSION_MUSTFILLOPINION = 131072;
    /**
     * 流程业务权限 成批审批必填意见 数据字典项 与允许填写意见配合使用 add by 陈小峰 2012-4-18
     */
    public final static int BIZPERMISSION_BATCHMUSTFILLOPINION = 262144;

    /**
     * 流程业务权限 完整表单 数据字典项 采购结果的完整表单 add by maheng 2012-07-18
     */
    public final static int BIZPERMISSION_FULLFORM = 1048576;
    /**
     * 流程业务权限 隐藏评分表单 数据字典项 采购结果的隐藏评分表单 add by maheng 2012-07-18
     */
    public final static int BIZPERMISSION_HIDDENSCORINGFORM = 2097152;
    /**
     * 流程业务权限 接口人专用表单 数据字典项 采购结果的接口人专用表单 add by maheng 2012-07-18
     */
    public final static int BIZPERMISSION_INTERFACEFORM = 4194304;

    /**
     * 流程业务权限 新增按钮：同意并提交（对应的环节为"返回承办人发会签"），排列在按钮"下一步"的后边
     */
    public final static int BIZPERMISSION_HQDEPTLEADER = 8388608;
    /**
     * 流程业务权限 总部接收部门负责人"同意并提交"的提交 add by maheng 2012-08-30
     */
    public final static int BIZPERMISSION_HQRECEIVEDEPTLEADER = 16777216;
    /**
     * 流程业务权限 非合同审批不能填写意见 add by maheng 2012-12-13
     */
    public final static int BIZPERMISSION_NOTFILLOPINION = 134217728;
    /**
     * 流程业务权限 领导送结束(山东) add by maheng 2013-4-15
     */
    public final static int BIZPERMISSION_LEADERTOEND = 268435456;
    /**
     * 流程业务权限 下一步环节排序 add by maheng 2013-5-20
     */
    public final static int BIZPERMISSION_NEXTACTSSEQUENCE = 536870912;
    /**
     * 流程业务权限 禁止短信催办 add by maheng 2015-1-4
     */
    public final static int BIZPERMISSION_FORBIDSMSHURRY = 1073741824;

    /**
     * 二次会签业务权限 填写会签反馈意见 数据字典项
     */
    public final static int BIZPERMISSION_RTNMSG = 1;
    /**
     * 二次会签业务权限 二次会签功能 数据字典项
     */
    public final static int BIZPERMISSION_SECONDHQ = 2;
    /**
     * 二次会签业务权限 法律部门意见反馈 数据字典项
     */
    public final static int BIZPERMISSION_RTNLAWMSG = 4;
    /**
     * 二次会签业务权限 财务部门意见反馈 数据字典项
     */
    public final static int BIZPERMISSION_RTNFINANCEMSG = 8;
    /**
     * 合同业务权限 允许编辑 数据字典项
     */
    public final static int EXTBIZPERMISSION_EDITABLE = 1;
    /**
     * 合同业务权限 允许配置模版 数据字典项
     */
    public final static int TEMPLATE_CONFIGURE = 131072;
    /**
     * 合同业务权限 建议授权签约代表 允许编辑 数据字典项
     */
    public final static int CONTRSCT_IS_SIGNER = 8;

    /**
     * 合同业务权限 提示建议授权签约代表
     */
    public final static int CONTRACT_IS_SIGNER_RIMIND = 16;
    /**
     * 合同业务权限 退回采购系统
     */
    public final static int EXTBIZPERMISSION_BACKTOPUR = 32;
    /**
     * 合同业务权限 会签部门 允许编辑 数据字典项
     */
    public final static int CONTRSCT_IS_SIGNDEPT = 4;

    /**
     * 合同业务权限 流程业务权限 天津绩效考核 数据字典项
     */
    public final static int EXTBIZPERMISSION_TJKPI = 2;

    /**
     * 合同业务权限 流程业务权限 成批审批中移除合同 数据字典项
     * add by maheng 2013-4-23
     */
    public final static int EXTBIZPERMISSION_BATCHDENYCONTRACT = 2048;

    /**
     * 合同业务权限 流程业务权限 不允许删除合同正文 数据字典项
     * add by maping 2015-2-4
     */
    public final static int EXTBIZPERMISSION_DELCONTRACTFILE = 4096;


    /**
     * 消息类型 数据字典
     */
    public final static int MESSAGETYPE = 1103;

    /**
     * 消息类型 系统消息 数据字典项
     */
    public final static int MESSAGETYPE_SYSTEM = 1;

    /**
     * 消息类型 审批催办 数据字典项
     */
    public final static int MESSAGETYPE_HURRY = 2;

    /**
     * 消息类型 合同审签数据字典项
     */
    public final static int MESSAGETYPE_APPROVE = 3;
    /**
     * 消息类型 合同审批待阅数据字典项
     */
    public final static int MESSAGETYPE_APPROVECONTRACT = 20;
    /**
     * 消息类型 单合同签约异常数据待阅
     */
    public final static int EXP_CONTRACT = 21;
    /**
     * 消息类型 铁塔冻结预提单信息报表待阅
     */
    public final static int TT_PREBILL_REPORT = 21;
    /**
     * 消息类型 借阅申请数据字典项
     */
    public final static int MESSAGETYPE_BORROW = 4;
    /**
     * 消息类型 合同作废数据字典项
     */
    public final static int MESSAGETYPE_INVALID = 5;
    /**
     * 消息类型 合同移交数据字典项
     */
    public final static int MESSAGETYPE_HANDOVER = 6;
    /**
     * 消息类型 合同分发数据字典项
     */
    public final static int MESSAGETYPE_DISTRIBUTED = 7;
    /**
     * 消息类型 模版发布数据字典项
     */
    public final static int MESSAGETYPE_TEMPLATE = 8;
    /**
     * 消息类型 添加履行人数据字典项
     */
    public final static int MESSAGETYPE_ADDPERFORMER = 9;
    /**
     * 消息类型 委托授权数据字典项
     */
    public final static int MESSAGETYPE_WARRANT = 10;

    /**
     * 消息类型 变更补充
     */
    public final static int MESSAGETYPE_CHANGE = 11;

    /**
     * 消息类型 终止解除
     */
    public final static int MESSAGETYPE_TERMINATE = 12;
    /**
     * 消息类型 合同续签
     */
    public final static int MESSAGETYPE_CONTRACTCON = 13;

    /**
     * 消息类型 审批单传阅
     */
    public final static int MESSAGETYPE_APPROVAL_DELIVER = 14;

    /**
     * 消息类型 签订盖章催办 数据字典项
     */
    public final static int MESSAGETYPE_SIGNHURRY = 15;

    /**
     * 消息类型 签订盖章 数据字典项  add by maheng 2013-1-18
     */
    public final static int MESSAGETYPE_SIGN = 16;

    /**
     * 消息类型 合同履行 数据字典项	add by maheng 2013-1-18
     */
    public final static int MESSAGETYPE_PERFORM = 17;

    /**
     * 消息类型 跨组织分摊 数据字典项	add by maheng 2013-7-23
     */
    public final static int MESSAGETYPE_PREBILLSTRIDEORG = 18;

    /**
     * 消息类型 异常履行处理 数据字典项	add by maping 2014-10-16
     */
    public final static int MESSAGETYPE_NORMALPERFORM = 19;

    /**
     * 消息类型 合同已审批未进入履行催办
     */
    public final static int MESSAGETYPE_CONTRACTAPPROVENOPERFORM = 20;
    /**
     * 消息类型 合同临期/逾期短信催办
     */
    public final static int PERFORMREPORT_CONTRACTSENDSMS = 21;
    /**
     * 消息类型 计提成本预提单操作开关发送短信催办
     */
    public final static int ORGSWITCH_SENDSMS = 22;

    /**
     * CP/SP  数据字典项 业务种类
     */
    public final static int CPSP_TYPE = 1004;
    /**
     * CP/SP   数据字典项 合同范围
     */
    public final static int CPSP_RANGENAME = 1005;
    /**
     * CP/SP 数据字典项 业务开放范围
     */
    public final static int CPSP_BUSRANGENAME = 1006;
    /**
     * CP/SP 数据字典项 业务开放范围
     */
    public final static int CPSP_COOPNAME = 1007;
    /**
     * 数据字典项 收款条件
     */
    public final static int PER_TYPE = 1234;

    /**
     * 省份简写代码数据类型
     */
    public final static int PROVINCECODETYPE = 1104;

    /**
     * 审批映射数据字典
     */
    public final static int APPROVEMAP = 1301;
    /**
     * 分管领导映射
     */
    public final static int APPROVEMAP_CHARGELEADER = 1;

    /**
     * 分管律师映射
     */
    public final static int APPROVEMAP_CHARGELAWYER = 2;

    /**
     * 分管财务映射
     */
    public final static int APPROVEMAP_CHARGEFINANCE = 3;

    /**
     * 领导秘书映射
     */
    public final static int APPROVEMAP_LEADERSECRETARY = 4;

    /**
     * 部门流程映射
     */
    public final static int APPROVEMAP_DEPTPROCESS = 5;

    /**
     * 合同类型对应流程映射
     */
    public final static int APPROVEMAP_CONTRACTCLASSIFYROCESS = 8;

    /**
     * 部门秘书
     */
    public final static int APPROVEMAP_DEPTSECRETRY = 9;

    /**
     * 处室领导
     */
    public final static int APPROVEMAP_CHISHILEADER = 10;

    /**
     * 分管领导之合同类型映射
     */
    public final static int APPROVEMAP_CONTRACTCLASSIFYFINANCE = 11;

    /**
     * 来源系统和选择流程型映射
     */
    public final static int APPROVEMAP_COMEFROM = 12;

    /**
     * 合同模板类型选择流程型映射
     */
    public final static int APPROVEMAP_TEMPLATE = 13;
    /**
     * 合同业务权限 是否确定签名(总部)
     */
    public final static int EXTBIZPERMISSION_CONFIRMSING = 128;

    /**
     * 合同业务权限 编辑合同正文(总部)
     */
    public final static int EXTBIZPERMISSION_EDITCONTRACTTEXT = 512;

    /**
     * 审批单传阅
     */
    public final static int EXTBIZPERMISSION_APPROVALTRANSFER = 256;
    /**
     * 特定部门数据字典项
     */
    public final static int SETDEPT_TYPE = 1351;

    public final static int ACCEPT_NUMBER = 1701;

    /**
     * 合同负面清单
     */
    public final static int EXTBIZPERMISSION_CONTRACTHISTORYLIST = 8192;
    /**
     * 是否启动模板百分比校验
     */
    public final static int APPROVE_TEMPLATE_PERCENTAGE = 16384;
    /**
     * 退回承办人意见是否必填
     */
    public final static int APPROVE_SENDBACKSTAFF_PROPOSAL= 32768;
    /**
     * 退回上一步处理人意见是否必填
     */
    public final static int APPROVE_SENDBACKONE_PROPOSAL=65536;
    /**
     * 合同非正常履行 取消审签
     */
    public final static int UNNORMALCONTRACT_CANCEL = 67;
    /**
     * 主管领导活动ID
     */
    public final static String ACTIVEID_COMHEADER = "ComHeader";
    /**
     * 公司总经理活动ID
     */
    public final static String ACTIVEID_COMSUPER = "ComSuper";
    /**
     * 承办人4活动ID
     */
    public final static String ACTIVEID_STARTER3A = "Starter3a";
    /**
     * 公司董事长活动ID
     */
    public final static String ACTIVEID_COMMANAGER = "ComManager";
    /**
     * 承办人6活动ID
     */
    public final static String ACTIVEID_STARER6 = "Starer6";
    /**
     * 用来给江苏发待阅的分管副总的角色id
     */
    public final static String GROUP_COMHEADER = "4495390548";

    /**
     * 集团合同类型为战略/框架合作协议时发待阅的公司总经理，董事长的角色id
     */
    public final static String GROUP_LEADER = "4495393622"; //
    /**
     * 北分公司领导
     */
    public final static String GROUP_GSLD = "344062432";
    /**
     * 北分承办部门副总,其他被授权人（主营业务收入）
     */
    public final static String GROUP_CBBMFZ = "1580914110";

    /**
     * 北分承办部门总经理,其他被授权人
     */
    public final static String GROUP_CBBMZ = "344058838";
    /**
     * 北分公司领导（总经理）
     */
    public final static String GROUP_ZJL = "4679879244";
    /**
     * 辽宁承办部门负责人
     */
    public final static String LN_BMFZR = "219641114";
    /**
     * 辽宁公司分管副总
     */
    public final static String LN_FGFZ = "219641034";
    /**
     * 辽宁公司总经理
     */
    public final static String LN_ZJL = "219641023";
    /**
     * 董事长角色id
     */
    public final static long GROUP_COMMANGER = 219710273L;
    /**
     * 北分财务和李钦发模板待阅
     */
    public final static String GROUP_TEMPLATE = "471790172";
    /**
     * 无邮件催办角色ID
     */
    public final static String GROUP_NOEMIAL = "4833155668";

    /**
     * 业务系统接口人权限
     */
//    public static final long SYSTEMETYPE_USER=Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USER").toString());
    public static final long SYSTEMETYPE_USER=Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USER").toString());

    // 业务系统使用权限---------start
    /**
     * 10010的业务系统权限
     */
    public static final long SYSTEMETYPE_USE_10010 = Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USE_10010").toString());
    /**
     * 沃易购的业务系统权限
     */
    public static final long SYSTEMETYPE_USE_WOTESCO = Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USE_WOTESCO").toString());
    /**
     * 沃音乐的业务系统权限
     */
    public static final long SYSTEMETYPE_USE_MUSIC = Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USE_MUSIC").toString());
    /**
     * 沃阅读的业务系统权限
     */
    public static final long SYSTEMETYPE_USE_READ = Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USE_READ").toString());
    /**
     * 沃联盟的业务系统权限
     */
    public static final long SYSTEMETYPE_USE_UNION = Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USE_UNION").toString());
    /**
     * 电子商城的业务系统权限
     */
    public static final long SYSTEMETYPE_USE_INNORMAIL = Long.parseLong(LoadDataConfig.getKey("SYSTEMETYPE_USE_INNORMAIL").toString());
    /**
     * 沃云多云的业务系统权限
     */
    public static final long SYSTEMTYPE_USE_WOYUN = Long.parseLong(LoadDataConfig.getKey("SYSTEMTYPE_USE_WOYUN").toString());
    // 业务系统使用权限---------end

    // 标准文本查询权限---------start
    /**
     * 标准文本管理员权限
     */
    public static final long TEMPLATE_ADMIN = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_ADMIN").toString());
    /**
     * 沃易购业务系统查询权限
     */
    public static final long TEMPLATE_SYSTEM_WOTESCO = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_WOTESCO").toString());
    /**
     * 沃音乐业务系统查询权限
     */
    public static final long TEMPLATE_SYSTEM_MUSIC = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_MUSIC").toString());
    /**
     * 沃阅读业务系统查询权限
     */
    public static final long TEMPLATE_SYSTEM_READ = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_READ").toString());
    /**
     * 沃联盟业务系统查询权限
     */
    public static final long TEMPLATE_SYSTEM_UNION = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_UNION").toString());
    /**
     * 电子商城业务系统查询权限
     */
    public static final long TEMPLATE_SYSTEM_INNORMAIL = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_INNORMAIL").toString());
    /**
     * 沃云多云业务系统查询权限
     */
    public static final long TEMPLATE_SYSTEM_WOYUN = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_WOYUN").toString());


    /**
     * 10010业务系统查询权限顶级节点
     */
    public static final long TEMPLATE_SYSTEM_10010_PARENT =Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_10010_PARENT").toString());
    /**
     * 10010业务系统查询权限(全国)
     */
    public static final long TEMPLATE_SYSTEM_10010 = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_SYSTEM_10010").toString());
    /**
     * 10010查询本省权限
     */
    public static final long TEMPLATE_10010_PROVINCE = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_10010_PROVINCE").toString());
    /**
     * 10010查询本公司权限
     */
    public static final long TEMPLATE_10010_COMPLANY = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_10010_COMPLANY").toString());
    /**
     * 10010查询本部门权限
     */
    public static final long TEMPLATE_10010_DEPT = Long.parseLong(LoadDataConfig.getKey("TEMPLATE_10010_DEPT").toString());
    // 标准文本查询权限---------end

    /**
     * 业务系统接口人我的工作菜单
     */
    public static final long SYSTEMETYPE_MYGONGZUO = 1081010010L;
    /**
     * 集团系统管理员权限，有这个权限的人，可以给其它人分配权限以及角色
     */
    public static final long JT_SYSTEM_ADMIN = Long.parseLong(LoadDataConfig.getKey("JT_SYSTEM_ADMIN").toString());

    /**
     *沃易购业务系统ID
     */
    public static final int SYSTEM_WOTESCO= Integer.parseInt(LoadDataConfig.getKey("SYSTEM_WOTESCO").toString());
    public static final String SYSTEM_NAME_WOTESCO = LoadDataConfig.getKey("SYSTEM_NAME_WOTESCO").toString();
    /**
     *沃联盟业务系统ID
     */
    public static final int SYSTEM_UNION=Integer.parseInt(LoadDataConfig.getKey("SYSTEM_UNION").toString());
    public static final String SYSTEM_NAME_UNION = LoadDataConfig.getKey("SYSTEM_NAME_UNION").toString();
    /**
     *沃音乐业务系统ID
     */
    public static final int SYSTEM_MUSIC=Integer.parseInt(LoadDataConfig.getKey("SYSTEM_MUSIC").toString());
    public static final String SYSTEM_NAME_MUSIC = LoadDataConfig.getKey("SYSTEM_NAME_MUSIC").toString();
    /**
     *沃阅读业务系统ID
     */
    public static final int SYSTEM_READ=Integer.parseInt(LoadDataConfig.getKey("SYSTEM_READ").toString());
    public static final String SYSTEM_NAME_READ = LoadDataConfig.getKey("SYSTEM_NAME_READ").toString();
    /**
     *10010业务系统ID
     */
    public static final int SYSTEM_10010=Integer.parseInt(LoadDataConfig.getKey("SYSTEM_10010").toString());
    public static final String SYSTEM_NAME_10010 = LoadDataConfig.getKey("SYSTEM_NAME_10010").toString();
    /**
     * 电子商城业务系统ID
     */
    public static final int SYSTEM_INNORMAIL = Integer.parseInt(LoadDataConfig.getKey("SYSTEM_INNORMAIL").toString());
    public static final String SYSTEM_NAME_INNORMAIL=LoadDataConfig.getKey("SYSTEM_NAME_INNORMAIL").toString();
    /**
     * 沃云多云业务系统ID
     */
    public static final int SYSTEM_WOYUN = Integer.parseInt(LoadDataConfig.getKey("SYSTEM_WOYUN").toString());
    public static final String SYSTEM_NAME_WOYUN = LoadDataConfig.getKey("SYSTEM_NAME_WOYUN").toString();


    /**
     * 第一个流程环节类型
     */
    /**
     * 新建，迭代流程，第一个环节
     */
    public static final String PROCESS_ACT_TYPE=LoadDataConfig.getKey("PROCESSACTTYPE").toString();
    /**
     * 发布流程第一个环节
     */
    public static final String PROCESS_PUBSH_TYPE=LoadDataConfig.getKey("PROCESSPUBSHTYPE").toString();
    /**
     * 标准文本生效审批流程类型ID
     */
    public static final Integer BUSSINESSTYPE_EFFECTTMPLATE=10;
    /**
     * 标准文本迭代审批流程类型ID
     */
    public static final Integer BUSSINESSTYPE_CHANGETEMPLATE=12;
    /**
     * dataItem表年份
     */
    public static final long DATAITEM_YEAR=206L;
    /**
     * dataItem表季度
     */
    public static final long DATAITEM_QUARTER=204L;
    /**
     * dataItem表月度
     */
    public static final long DATAITEM_MONTH=203L;
    /**
     * 电子商城标准文本新建流程
     */
    public static final long PROCESSDEFID_EDIT=Long.parseLong(LoadDataConfig.getKey("PROCESSDEFID_EDIT").toString());   // (uat 61，生产：82);
    /**
     * 电子商城标准文本迭代流程
     */
    public static final long PROCESSDEFID_ITERT=Long.parseLong(LoadDataConfig.getKey("PROCESSDEFID_ITERT").toString());    // (uat 62，生产：83);
    /**
     * 电子商城会签流程
     */
    public static final long PROCESSDEFID_SIGN=Long.parseLong(LoadDataConfig.getKey("PROCESSDEFID_SIGN").toString());    // (uat 63，生产：81);

    // 控制与业务系统接口开通配置
    /**
     * 10010
     */
    public  static final String OPEN_WEBSERVICE_10010 = LoadDataConfig.getKey("OPEN_WEBSERVICE_10010").toString();
    /**
     * 沃易购
     */
    public static final String OPEN_WEBSERVICE_WOTESCO = LoadDataConfig.getKey("OPEN_WEBSERVICE_WOTESCO").toString();
    /**
     * 沃联盟
     */
    public static final String OPEN_WEBSERVICE_UNION = LoadDataConfig.getKey("OPEN_WEBSERVICE_UNION").toString();
    /**
     * 沃音乐
     */
    public static final String OPEN_WEBSERVICE_MUSIC = LoadDataConfig.getKey("OPEN_WEBSERVICE_MUSIC").toString();
    /**
     * 沃阅读
     */
    public static final String OPEN_WEBSERVICE_READ = LoadDataConfig.getKey("OPEN_WEBSERVICE_READ").toString();
    /**
     * 电子商城
     */
    public static final String OPEN_WEBSERVICE_INNORMAIL = LoadDataConfig.getKey("OPEN_WEBSERVICE_INNORMAIL").toString();
}
