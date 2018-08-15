package com.example.graduation.dao;

import com.example.graduation.pojo.TFoods;
import com.example.graduation.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TFoodsMapper extends MyMapper<TFoods> {
    List<TFoods> queryFoodsListWithSelected(@Param("sellerId")Integer sellerId, @Param("goodsId")Integer goodsId);
}