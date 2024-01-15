package com.imooc.payment.dao;

import com.imooc.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @ClassName PaymentDao
 * @Description TODO Mapper接口
 * @Author hongy
 * @Date 2024/1/15 14:57
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
