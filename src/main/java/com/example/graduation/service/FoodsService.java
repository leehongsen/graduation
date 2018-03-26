package com.example.graduation.service;

import com.example.graduation.pojo.TFoods;

import java.util.List;

/**
 * 商品类型下的食物表
 */
public interface FoodsService extends IService<TFoods> {
    /**
     * 根据商家获取商家食物
     * @param id
     * @return
     */
    List<TFoods> getFoodsBySeller(Integer id);

    /**
     * 根据商品类型获取食物
     * @param id
     * @return
     */
    List<TFoods> getFoodsByGoods(Integer id);
}
