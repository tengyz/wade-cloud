package io.renren.utils;

import java.util.ArrayList;
import java.util.List;

public enum ResultCodeEnum {
    /**
     * @apiDefine success_msg 全局配置成功失败响应信息
     * @apiSuccess  200 成功
     * @apiSuccess  -1  失败
     */

    /**
     * @apiDefine token_msg 全局配置token鉴权请求头
     * @apiHeader {String}  tocken 鉴权信息：用户信息唯一标识
     * @apiHeaderExample {json} 请求头例子:
     *     {
     *       "tocken": "3d047611-46d5-4d3a-985e-d3b1ebc77b05"
     *     }
     */
    /**
     * @apiDefine message_error
     * @apiError  10001  参数无效
     * @apiError  10002  参数为空
     * @apiError  10003  参数类型错误
     * @apiError  10004  参数缺失
     * @apiError  20001  用户登录超时或用户未登录
     * @apiError  20002  账号不存在或密码错误
     * @apiError  20003  账号已被禁用
     * @apiError  20005  用户已存在
     * @apiError  20006  用户名为空
     * @apiError  20007  密码为空
     * @apiError  20008  存储令牌失败
     * @apiError  20009  验证码错误
     * @apiError  20010  验证码过期
     * @apiError  30001  某业务出现问题
     * @apiError  40001  系统繁忙，请稍后重试
     * @apiError  50001  数据未找到
     * @apiError  50002  数据有误
     * @apiError  50003  数据已存在
     * @apiError  60001  内部系统接口调用异常
     * @apiError  60002  外部系统接口调用异常
     * @apiError  60003  该接口禁止访问
     * @apiError  60004  接口地址无效
     * @apiError  60005  接口请求超时
     * @apiError  60006  接口负载过高
     * @apiError  70001  无访问权限
     */

    /**
     * @apiGroup 电子合同返回码说明
     * @api  电子合同返回码说明
     * @apiVersion 0.0.0
     * @apiUse success_msg
     * @apiUse token_msg
     * @apiUse message_error
     */
    /* 成功状态码 */
    SUCCESS(200, "成功"),
    /* 失败状态码 */
    FAILURE(-1, "失败"),

    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "参数无效"),
    PARAM_IS_BLANK(10002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "参数缺失"),

    /* 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN(20001, "用户登录超时或用户未登录"),
    USER_LOGIN_ERROR(20002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(20003, "账号已被禁用"),
    USER_NOT_EXIST(20004, "用户不存在"),
    USER_HAS_EXISTED(20005, "用户已存在"),
    USER_USERNAME_BLANK(20006,"用户名为空"),
    USER_PASSWORD_BLANK(20007,"密码为空"),
    USER_LOGIN_TOKEN_SAVEFAIL(20008,"存储令牌失败!"),
    USER_VERIFYCODE_ERROR(20009,"验证码错误!"),
    USER_VERIFYCODE_TIMEOUT(20010,"验证码过期!"),

    /* 业务错误：30001-39999 */
    SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "某业务出现问题"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

    /* 数据错误：50001-599999 */
    RESULE_DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "数据已存在"),

    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),
    INTERFACE_OUTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),

    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限");

    private Integer code;

    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCodeEnum item : ResultCodeEnum.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCodeEnum item : ResultCodeEnum.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }

    //校验重复的code值 (**可去除**)
    public static void main(String[] args) {
        ResultCodeEnum[] ApiResultCodes = ResultCodeEnum.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCodeEnum ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
    }
}
