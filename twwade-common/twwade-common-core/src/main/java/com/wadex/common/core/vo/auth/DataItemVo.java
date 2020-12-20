package com.wadex.common.core.vo.auth;


import java.io.Serializable;


/**
 * <p>
 * 文件名称: DataItem.java
 * </p>
 * <p>
 * 文件描述: 字典值 T_DATA_ITEM
 * <p>
 * 版权所有: 版权所有(C)2010
 * </p>
 * <p>
 * 公 司: 拓维信息系统股份有限公司
 * </p>
 * <p>
 * 内容摘要: 本文件的内容是数据字典详细项.
 * </p>
 * <p>
 * 完成日期：2010-9-25
 * </p>
 *
 * @author chenyupeng
 */
public class DataItemVo extends BaseDataItemVo implements Serializable
{
    private int pageNo;
    private int pageSize;
    public int getPageNo() {
        return pageNo;
    }
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(this == obj){
            return true;
        }
        if (obj instanceof DataItemVo) {
            DataItemVo other = (DataItemVo) obj;
            return  (other.getName()).equals(this.getName())&&(other.getValue()==this.getValue());
        }
        return false;
    }
    public int hashCode() {
        String in = this.getValue() + this.getName();
        return in.hashCode();

    }

}
