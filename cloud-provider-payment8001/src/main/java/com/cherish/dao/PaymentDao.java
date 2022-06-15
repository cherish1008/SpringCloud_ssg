package com.cherish.dao;

import com.cherish.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author:cherish
 * @email:3256301873@qq.com
 * @phone:15993903905
 * @date:2022-06-14 21:46
 */
@Mapper
public interface PaymentDao {
    int save(Payment payment);

    Payment queryPaymentByID(@Param("id") Long id);
}
