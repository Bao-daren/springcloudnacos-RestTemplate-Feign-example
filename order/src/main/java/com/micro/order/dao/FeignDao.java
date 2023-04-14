package com.micro.order.dao;

import com.common.bean.ResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "order" , url = "localhost:8081/product")
@FeignClient("micro-product")
public interface FeignDao {

    @GetMapping("/product/getall")
    ResultVO getAllProduct();
}
