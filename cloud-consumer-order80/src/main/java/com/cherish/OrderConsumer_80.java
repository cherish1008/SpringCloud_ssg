package com.cherish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-15 16:21
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumer_80.class, args);
    }
}
