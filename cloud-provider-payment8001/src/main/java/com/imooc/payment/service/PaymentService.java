package com.imooc.payment.service;

import com.imooc.common.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO 支付Service层
 * @Author hongy
 * @Date 2024/1/15 14:58
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}