package com.example.graduation.service.impl;

import com.example.graduation.dao.TFoodsMapper;
import com.example.graduation.pojo.TFoods;
import com.example.graduation.pojo.TGoods;
import com.example.graduation.service.FoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service("foodsService")
public class FoodsServiceImpl extends BaseService<TFoods> implements FoodsService{
    @Resource
    private TFoodsMapper tFoodsMapper;

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

    @Override
    public List<TFoods> queryFoodsListWithSelected(Integer sellerId, Integer goodsId) {
        return tFoodsMapper.queryFoodsListWithSelected(sellerId,goodsId);
    }

    @Override
    public PageInfo<TFoods> selectByPage(TFoods seller, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TFoods.class);
        Example.Criteria criteria = example.createCriteria();
        if (seller.getBusinessesId() != null) {
            criteria.andEqualTo("Businesses_id", seller.getBusinessesId());
        }
        if (seller.getId() != null) {
            criteria.andEqualTo("id", seller.getId());
        }

        //分页查询
        PageHelper.startPage(page, length);
        List<TFoods> list = selectByExample(example);
        return new PageInfo<>(list);
    }

}
