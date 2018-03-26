package com.example.graduation.service;

import com.example.graduation.pojo.TCustomers;
import com.github.pagehelper.PageInfo;

/**
 * 客户表
 */
public interface CustomerService extends IService<TCustomers> {
    PageInfo<TCustomers> selectByPage(TCustomers customers, int start, int length);

    TCustomers selectByName(String name);
}
