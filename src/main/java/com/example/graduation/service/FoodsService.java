package com.example.graduation.service;

import com.example.graduation.pojo.TFoods;
import com.example.graduation.pojo.TGoods;
import com.github.pagehelper.PageInfo;

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

    /**
     * 获取选择的食物
     * @param sellerId
     * @param goodsId
     * @return
     */
    List<TFoods> queryFoodsListWithSelected(Integer sellerId,Integer goodsId);

    PageInfo<TFoods> selectByPage(TFoods seller, int start, int length);
}
