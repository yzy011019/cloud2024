package com.yu.cloud.service;

import com.yu.cloud.entities.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}