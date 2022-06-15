package com.cherish.service;

import com.cherish.pojo.Payment;
import org.springframework.stereotype.Service;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-15 14:03
 */
@Service
public interface ParmentService {
    int save(Payment payment);

    Payment queryPaymentByID(Long id);
}
