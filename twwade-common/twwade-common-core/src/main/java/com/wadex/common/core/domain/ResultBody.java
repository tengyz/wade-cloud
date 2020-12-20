package com.wadex.common.core.domain;

import lombok.ToString;

import java.io.Serializable;

/**
 * 统一的对象返回实体
 */
@ToString
public class ResultBody implements Serializable {
    private static final long serialVersionUID = -3948389268046368059L;
    // 状态码
    private Integer code;
    // 状态信息
    private String msg;
    // 返回数据
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public void setResultCode(ResultEnum code) {
        this.code = code.code();
        this.msg = code.message();
    }

    public ResultBody() { }

    public ResultBody(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultBody(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 成功结果
     * 不返回数据直接返回成功信息
     */
    public static ResultBody success() {
        ResultBody result = new ResultBody();
        result.setResultCode(ResultEnum.SUCCESS);
        return result;
    }

    /**
     * 成功
     * 并且加上返回数据
     * @param data 数据
     * @return 结果实体
     */
    public static ResultBody success(Object data) {
        ResultBody result = new ResultBody();
        result.setResultCode(ResultEnum.SUCCESS);
        result.setData(data);
        return result;
    }

    /**
     * 单返回失败的状态码
     * 不返回数据直接返回失败信息
     */
    public static ResultBody failure() {
        ResultBody result = new ResultBody();
        result.setResultCode(ResultEnum.FAILURE);
        return result;
    }

    /**
     * 返回失败的状态码 及 数据
     * @param data 数据
     * @return 结果实体
     */
    public static ResultBody failure(Object data) {
        ResultBody result = new ResultBody();
        result.setResultCode(ResultEnum.FAILURE);
        result.setData(data);
        return result;
    }
    /**
     * 返回失败的状态码 及 数据
     * @param data 数据
     * @param resultEnum 数据
     * @return 结果实体
     */
    public static ResultBody failure(ResultEnum resultEnum, Object data) {
        ResultBody result = new ResultBody();
        result.setResultCode(resultEnum);
        result.setData(data);
        return result;
    }

    /**
     * 自定义成功返回状态 加上数据
     * @param resultCode 状态码
     *                   @see ResultEnum
     * @param data 数据
     * @return  结果实体
     */
    public static ResultBody getResult(ResultEnum resultCode, Object data) {
        ResultBody result = new ResultBody();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

    /**
     * 自定义成功返回状态 加上数据
     * @param code 状态码
     * @param msg  消息
     * @param data 数据
     * @return  结果实体
     */
    public static ResultBody getResult(Integer code, String msg, Object data) {
        ResultBody result = new ResultBody();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


}