package com.example.graduation.service.impl;

import com.example.graduation.pojo.TFoods;
import com.example.graduation.service.FoodsService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("foodsService")
public class FoodsServiceImpl extends BaseService<TFoods> implements FoodsService{
    @Override
    public List<TFoods> getFoodsBySeller(Integer id) {
        Example example = new Example(TFoods.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("businessesId",id);
        return mapper.selectByExample(example);
    }

    @Override
    public List<TFoods> getFoodsByGoods(Integer id) {
        Example example = new Example(TFoods.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("goodsId",id);
        return mapper.selectByExample(example);
    }
}
