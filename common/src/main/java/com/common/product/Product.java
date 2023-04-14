package com.common.product;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author laohan
 * @since 2021-03-30
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;

    private String pname;

    private Float pprice;

    private Integer storecount;

    private String describute;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Float getPprice() {
        return pprice;
    }

    public void setPprice(Float pprice) {
        this.pprice = pprice;
    }

    public Integer getStorecount() {
        return storecount;
    }

    public void setStorecount(Integer storecount) {
        this.storecount = storecount;
    }

    public String getDescribute() {
        return describute;
    }

    public void setDescribute(String describute) {
        this.describute = describute;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", storecount=" + storecount +
                ", describute='" + describute + '\'' +
                '}';
    }
}
