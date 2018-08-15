package com.example.graduation.service.impl;

import com.example.graduation.pojo.TRatings;
import com.example.graduation.service.RatingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("ratingService")
public class RatingServiceImpl extends BaseService<TRatings> implements RatingService {
    @Override
    public PageInfo<TRatings> selectByPage(TRatings ratings, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TRatings.class);
        Example.Criteria criteria = example.createCriteria();
        if (ratings.getId() != null) {
            criteria.andEqualTo("id", ratings.getId());
        }

        //分页查询
        PageHelper.startPage(page, length);
        List<TRatings> list = selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public void delOrder(Integer id) {
        
    }
}
