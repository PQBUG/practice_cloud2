package com.imooc.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName CustomerOrderApplication
 * @Description TODO 主启动类
 * @Author hongy
 * @Date 2024/1/15 15:38
 **/
@SpringBootApplication
@EnableEurekaClient
public class CustomerOrderApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerOrderApplication80.class, args);
    }
}
