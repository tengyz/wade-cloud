package com.wadex.common.core.exception;

import com.wadex.common.core.domain.ResultEnum;

/**自定义异常
 * Created by qsf on 2020/5/13.
 */
public class EclmExcepition extends RuntimeException {
    ResultEnum resultCodeEnum;

    public EclmExcepition(ResultEnum resultCode) {
        //异常信息为: 错误状态码+异常信息
        super("错误状态码: "+resultCode.code()+",异常信息 :"+resultCode.message());
        this.resultCodeEnum = resultCode;
    }

    public ResultEnum getResultCodeEnum () {
        return this.resultCodeEnum;
    }
}
