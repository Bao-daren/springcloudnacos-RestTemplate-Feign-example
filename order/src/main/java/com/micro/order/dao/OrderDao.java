package com.micro.order.dao;

import com.common.order.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDao {

    @Select("select * from `order`")
    List<Orders> findAll();

    @Select("select * from `order` where orderid = #{orderid}")
    Orders findById(int orderid);

}
