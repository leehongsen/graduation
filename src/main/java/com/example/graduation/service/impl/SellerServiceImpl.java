package com.example.graduation.service.impl;

import com.example.graduation.dao.*;
import com.example.graduation.pojo.*;
import com.example.graduation.service.SellerSerivice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("sellerService")
public class SellerServiceImpl extends BaseService<TBusinesses> implements SellerSerivice {
    @Resource
    private TBusinessesSupportsMapper businessesSupportsMapper;
    @Resource
    private TFoodsMapper foodsMapper;
    @Resource
    private TGoodsMapper goodsMapper;
    @Resource
    private TOrdersMapper ordersMapper;
    @Resource
    private TPicsMapper picsMapper;

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void delSeller(Integer id) {
        //删除商户联立服务表
        TBusinessesSupports key=new TBusinessesSupports();
        key.setBusinessesId(id);
        businessesSupportsMapper.deleteByPrimaryKey(key);

        //删除食物表中有关该商户的食物
        Example foodExample = new Example(TFoods.class);
        Example.Criteria foodCriteria = foodExample.createCriteria();
        foodCriteria.andEqualTo("businessesId",id);
        foodsMapper.deleteByExample(foodExample);

        //删除商品类型表中有关该商户的商品类型
        Example goodExample = new Example(TGoods.class);
        Example.Criteria goodCriteria = goodExample.createCriteria();
        goodCriteria.andEqualTo("businessId",id);
        goodsMapper.deleteByExample(goodExample);

        //删除订单表中有关该商户的订单
        Example orderExample = new Example(TOrders.class);
        Example.Criteria orderCriteria = orderExample.createCriteria();
        orderCriteria.andEqualTo("businessesId",id);
        ordersMapper.deleteByExample(orderExample);

        //删除图片中有关该商户的图片
        Example picExample = new Example(TOrders.class);
        Example.Criteria picCriteria = picExample.createCriteria();
        picCriteria.andEqualTo("businessesId",id);
        picsMapper.deleteByExample(picExample);

        //删除商户表
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<TBusinesses> selectByPage(TBusinesses seller, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(seller.getName())) {
            criteria.andLike("name", "%" + seller.getName() + "%");
        }
        if (seller.getId() != null) {
            criteria.andEqualTo("id", seller.getId());
        }

        //分页查询
        PageHelper.startPage(page, length);
        List<TBusinesses> list = selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public TBusinesses selectByName(String name) {
        Example example = new Example(com.example.graduation.pojo.TBusinesses.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name",name);
        List<TBusinesses> list = selectByExample(example);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
