package com.example.graduation.service.impl;

import com.example.graduation.pojo.TCustomers;
import com.example.graduation.service.CustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl extends BaseService<TCustomers> implements CustomerService {
    @Override
    public PageInfo<TCustomers> selectByPage(TCustomers customers, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TCustomers.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(customers.getName())) {
            criteria.andLike("name", "%" + customers.getName() + "%");
        }
        if (customers.getId() != null) {
            criteria.andEqualTo("id", customers.getId());
        }

        //分页查询
        PageHelper.startPage(page, length);
        List<TCustomers> list = selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public TCustomers selectByName(String name) {
        Example example = new Example(com.example.graduation.pojo.TCustomers.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name",name);
        List<TCustomers> list = selectByExample(example);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
