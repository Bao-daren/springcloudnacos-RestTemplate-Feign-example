package com.micro.order.controller;

import com.common.bean.Constant;
import com.common.bean.ResultVO;
import com.common.order.Orders;
import com.common.product.Product;
import com.micro.order.dao.FeignDao;
import com.micro.order.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderDao dao ;

    @Autowired
    private RestTemplate template ;

    @Resource
    private FeignDao feignDao ;

    @GetMapping
    List<Orders> findAll(){
        return dao.findAll();
    }

    @GetMapping("/{orderid}")
    Orders findById(@PathVariable("orderid") int orderid){
        return dao.findById(orderid);
    }

    @GetMapping("/getp")
    ResultVO getAllProduct(){
//        ResultVO vo =  restTemplate.getForObject("http://localhost:8001/product/"+pid, ResultVO.class);

        return template.getForObject("http://localhost:8081/product/getall" , ResultVO.class) ;
    }


    @GetMapping("/addproduct")
    public ResultVO addProduct(Product product){
        System.out.println("product="+product);


//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        String json = new ObjectMapper().writeValueAsString(product);
//        HttpEntity<String> entity = new HttpEntity<String>(json,headers);
//        return template.exchange("http://localhost:8081/product/addbyorder" , HttpMethod.POST , entity  , ResultVO.class , product).getBody();

        return template.postForObject("http://localhost:8081/product/addbyorder" , product , ResultVO.class ) ;
    };



    @GetMapping("/getpfeign")
    ResultVO getAllProductByFeign(){
        return feignDao.getAllProduct() ;
    }



}
