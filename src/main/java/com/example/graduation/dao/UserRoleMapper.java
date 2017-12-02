package com.example.graduation.dao;

import com.example.graduation.pojo.UserRoleExample;
import com.example.graduation.pojo.UserRoleKey;
import java.util.List;

public interface UserRoleMapper {
    long countByExample(UserRoleExample example);

    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);

    List<UserRoleKey> selectByExample(UserRoleExample example);
}