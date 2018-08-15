package com.example.graduation.service;

import com.example.graduation.pojo.TGoods;
import com.github.pagehelper.PageInfo;

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

    void delGoods(Integer id);

    PageInfo<TGoods> selectByPage(TGoods seller, int start, int length);

}
