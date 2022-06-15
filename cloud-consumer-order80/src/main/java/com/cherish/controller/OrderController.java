package com.cherish.controller;

import com.cherish.pojo.CommonResult;
import com.cherish.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-15 17:09
 */
@RestController
@Slf4j
public class OrderController {
    private final String PAYMENT_URL = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/creat")
    public CommonResult<Payment> creat(@RequestBody Payment payment) {
        log.info(payment.getSerial());
        return restTemplate.postForObject(PAYMENT_URL + "/payment/save", payment, CommonResult.class);
    }


    @GetMapping("/consumer/payment/queryByID/{id}")
    public CommonResult<Payment> queryByID(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/save/" + id, CommonResult.class);
    }

}
