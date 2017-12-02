package com.example.graduation.dao;

import com.example.graduation.pojo.User;
import com.example.graduation.pojo.UserExample;
import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}