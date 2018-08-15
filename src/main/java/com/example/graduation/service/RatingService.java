package com.example.graduation.service;

import com.example.graduation.pojo.TRatings;
import com.github.pagehelper.PageInfo;

/**
 * 评价表
 */
public interface RatingService extends IService<TRatings>{
    PageInfo<TRatings> selectByPage(TRatings ratings, int start, int length);

    void delOrder(Integer id);
}
