package com.example.graduation.service.impl;

import com.example.graduation.pojo.TOrders;
import com.example.graduation.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl extends BaseService<TOrders> implements OrderService {
    @Override
    public PageInfo<TOrders> selectByPage(TOrders orders, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TOrders.class);
        Example.Criteria criteria = example.createCriteria();
        if (orders.getBusinessesId() != null) {
            criteria.andEqualTo("businessesId", orders.getId());
        }
        if (orders.getId() != null) {
            criteria.andEqualTo("id", orders.getId());
        }

        //分页查询
        PageHelper.startPage(page, length);
        List<TOrders> list = selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public void delOrder(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}
