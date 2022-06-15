package com.cherish.controller;

import com.cherish.pojo.CommonResult;
import com.cherish.pojo.Payment;
import com.cherish.service.ParmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-15 14:08
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private ParmentService parmentService;

    @PostMapping("/payment/save")
    public CommonResult creatPayment(@RequestBody Payment payment) {
        int re = parmentService.save(payment);
        log.info("**********插入的结果" + re);
        log.info("**********插入的结果" + payment.getSerial());


        if (re > 0) {
            return new CommonResult(200, "插入数据成功", re);
        } else {
            return new CommonResult(400, "插入数据失败", null);
        }

    }


    @GetMapping("/payment/save/{id}")
    public CommonResult queryByID(@PathVariable("id") Long id) {
        Payment payment = parmentService.queryPaymentByID(id);
        log.info("**********插入的结果" + payment);

        if (payment.equals("") || payment == null) {
            return new CommonResult(400, "查询数据失败", null);
        } else {
            return new CommonResult(200, "查询数据成功", payment);
        }

    }

}
