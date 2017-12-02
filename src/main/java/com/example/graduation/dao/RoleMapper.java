package com.example.graduation.dao;

import com.example.graduation.pojo.Role;
import com.example.graduation.pojo.RoleExample;
import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}