package com.wadex.common.core.exception.user;

import com.wadex.common.core.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author twwade
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
