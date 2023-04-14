package com.example.product.controller;

import com.common.bean.Constant;
import com.common.bean.ResultVO;
import com.common.product.Product;
import com.example.product.dao.ProductDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductDao dao ;

    @GetMapping
    public List<Product> findAll(){
        return dao.findAll();
    }


    @GetMapping("/{pid}")
    public Product findById(@PathVariable("pid") int pid){
        return dao.findById(pid);
    }


    @GetMapping("/getall")
    public ResultVO<List<Product>> getAll(){
        List<Product> all = dao.findAll();
        ResultVO<List<Product>> vo = new ResultVO("成功" , Constant.STATUS_SUCCESS , all);
        return vo;
    }



    @PostMapping("/addbyorder")
    public ResultVO addProductByOrder(@RequestBody  Product product){
        System.out.println("add order product="+product);
        dao.addProduct(product);
        return new ResultVO("成功" , Constant.STATUS_SUCCESS , null);
    };



}
