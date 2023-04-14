# springcloudnacos-RestTemplate-Feign-example
springcloud+nacos配置  以及 resttemplate 和 feign 的使用

### 模块介绍
##### common
存放通用的 数据库对象 Product 和 Order
存放统一的接口返回对象 ResultVO  和 状态码Constant

##### product
商品信息的服务  

##### order
订单信息的服务

### 模拟场景   订单模块和产品模块    
需要自行修改数据库配置 以及生成对应的数据
订单模块通过 resttemplate 和 feign 两种方式访问 产品模块的信息
resttemplate方法 OrderController.getAllProduct
feign方法 OrderController.getAllProductByFeign



### 依赖版本
jdk 18
spring-boot 2.7.10
spring-cloud-nacos  2021.0.1.0
spring-cloud 3.1.3
### 注意
不同版本的依赖冲突不一样  根据错误信息来查询
当前依赖的冲突  

spring-cloud-starter-openfeign  提示 没有loadbalance 需要单独添加
spring-cloud-nacos  内的 spring-cloud-common 版本为3.1.1 与loadbbalance的3.1.3冲突 需要移除


