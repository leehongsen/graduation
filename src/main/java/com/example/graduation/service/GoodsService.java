package com.example.graduation.service;

import com.example.graduation.pojo.TGoods;

import java.util.List;

/**
 * 商品类型表
 */
public interface GoodsService extends IService<TGoods> {
    /**
     * 根据商家id获取商品类型
     * @param id
     * @return
     */
    List<TGoods> getGoodsBySeller(Integer id);
}
