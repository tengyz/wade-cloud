package com.wadex.common.core.exception;

import com.wadex.common.core.domain.ResultEnum;

/**抛出异常工具类
 * Created by qsf on 2020/5/13.
 */
public class ExceptionCast {

    /**
     * 使用此方法将异常抛出
     * @param result
     */
    public static void cast(ResultEnum result) {
        throw new EclmExcepition(result);
    }
}
