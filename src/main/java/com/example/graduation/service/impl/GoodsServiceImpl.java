package com.example.graduation.service.impl;

import com.example.graduation.dao.TFoodsMapper;
import com.example.graduation.pojo.TFoods;
import com.example.graduation.pojo.TGoods;
import com.example.graduation.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl extends BaseService<TGoods> implements GoodsService {
    @Resource
    private TFoodsMapper tFoodsMapper;

    @Override
    public List<TGoods> getGoodsBySeller(Integer id) {
        Example example = new Example(TGoods.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("businessId",id);
        return mapper.selectByExample(example);
    }


    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void delGoods(Integer id) {
        TFoods key=new TFoods();
        key.setGoodsId(id);
        tFoodsMapper.deleteByPrimaryKey(key);
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<TGoods> selectByPage(TGoods goods, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TGoods.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(goods.getName())) {
            criteria.andLike("name", "%" + goods.getName() + "%");
        }
        if (goods.getId() != null) {
            criteria.andEqualTo("id", goods.getId());
        }

        //分页查询
        PageHelper.startPage(page, length);
        List<TGoods> list = selectByExample(example);
        return new PageInfo<>(list);
    }
}
