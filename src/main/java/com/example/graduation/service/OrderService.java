package com.example.graduation.service;

import com.example.graduation.pojo.TOrders;
import com.github.pagehelper.PageInfo;

/**
 * 订单表
 */
public interface OrderService extends IService<TOrders> {
    PageInfo<TOrders> selectByPage(TOrders orders, int start, int length);

    void delOrder(Integer id);
}
