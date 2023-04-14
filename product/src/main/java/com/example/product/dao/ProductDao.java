package com.example.product.dao;

import com.common.product.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductDao {


    @Select("select * from product")
    List<Product> findAll();

    @Select("select * from product where pid = #{pid}")
    Product findById(int pid);

    @Insert("insert into product values(null , #{pname} , #{pprice} , #{storecount} , #{describute})")
    void addProduct(Product product);
}
