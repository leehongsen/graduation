package com.example.graduation.service;

import com.example.graduation.pojo.TBusinessesSupports;

/**
 * 商家提供优惠联立表
 */
public interface SellerSupportService extends IService<TBusinessesSupports>{

    void addSellerSupport(TBusinessesSupports businessesSupports);
}
