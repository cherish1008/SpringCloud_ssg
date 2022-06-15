package com.cherish.service.impl;

import com.cherish.dao.PaymentDao;
import com.cherish.pojo.Payment;
import com.cherish.service.ParmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-15 14:03
 */
@Service
public class ParmentServiceImpl implements ParmentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment queryPaymentByID(Long id) {
        return paymentDao.queryPaymentByID(id);
    }
}
