package com.common.order;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author laohan
 * @since 2021-03-30
 */
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer orderid;

    private String uname;

    private String pname;

    private Float pprice;

    private String describute;

    private Integer buycount;

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", uname='" + uname + '\'' +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", describute='" + describute + '\'' +
                ", buycount=" + buycount +
                '}';
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
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

    public String getDescribute() {
        return describute;
    }

    public void setDescribute(String describute) {
        this.describute = describute;
    }

    public Integer getBuycount() {
        return buycount;
    }

    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }
}
