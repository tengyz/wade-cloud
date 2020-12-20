package com.wadex.common.core.constant.system;

/**
 * @Author: songshihong
 * @Description: $
 * @DateTime: 2020/10/13$ 15:54$
 */
public enum  EnumMethod {
    REPORT_READHEADERTEST_GETHEADER("/system/user/list");

    private String name;
    EnumMethod(String name) {
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
