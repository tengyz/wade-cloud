package io.renren.utils;


import java.io.Serializable;

/**
 * 统一的对象返回实体
 */
public class ResultBody implements Serializable {
    private static final long serialVersionUID = -3948389268046368059L;
    //状态码
    private Integer code;
    //状态信息
    private String msg;
    //返回数据
    private Object data;
    //总条数
    private Long totalSize;
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

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public void setResultCode(ResultCodeEnum code) {
        this.code = code.code();
        this.msg = code.message();
    }

    public ResultBody() {
    }

    public ResultBody(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultBody(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ResultBody(Integer code, String msg, Object data, Long totalSize) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.totalSize = totalSize;
    }

    /**
     * 成功结果
     * 不返回数据直接返回成功信息
     */
    public static ResultBody success() {
        ResultBody result = new ResultBody();
        result.setResultCode(ResultCodeEnum.SUCCESS);
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
        result.setResultCode(ResultCodeEnum.SUCCESS);
        result.setData(data);
        return result;
    }

    /**
     * 成功 自定义成功返回状态 加上数据
     * @param resultCode 状态码
     * @param data 数据
     * @return  结果实体
     */
    public static ResultBody success(ResultCodeEnum resultCode, Object data) {
        ResultBody result = new ResultBody();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
    /**
     * 成功 自定义成功返回状态 加上数据 总条数
     * @param resultCode 状态码
     * @param data 数据
     * @return  结果实体
     */
    public static ResultBody success(ResultCodeEnum resultCode, Object data,Long totalSize) {
        ResultBody result = new ResultBody();
        result.setResultCode(resultCode);
        result.setData(data);
        result.setTotalSize(totalSize);
        return result;
    }

    /**
     * 单返回失败的状态码
     * @param resultCode 状态码
     * @return 结果实体
     */
    public static ResultBody failure(ResultCodeEnum resultCode) {
        ResultBody result = new ResultBody();
        result.setResultCode(resultCode);
        return result;
    }

    /**
     * 返回失败的状态码 及 数据
     * @param resultCode 状态码
     * @param data 数据
     * @return 结果实体
     */
    public static ResultBody failure(ResultCodeEnum resultCode, Object data) {
        ResultBody result = new ResultBody();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
}