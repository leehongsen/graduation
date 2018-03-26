package com.example.graduation.service.impl;

import com.example.graduation.pojo.TGoods;
import com.example.graduation.service.GoodsService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl extends BaseService<TGoods> implements GoodsService {

    @Override
    public List<TGoods> getGoodsBySeller(Integer id) {
        Example example = new Example(TGoods.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("businessId",id);
        return mapper.selectByExample(example);
    }
}
