package com.example.graduation.dao;

import com.example.graduation.pojo.RoleResourcesExample;
import com.example.graduation.pojo.RoleResourcesKey;
import java.util.List;

public interface RoleResourcesMapper {
    long countByExample(RoleResourcesExample example);

    int deleteByPrimaryKey(RoleResourcesKey key);

    int insert(RoleResourcesKey record);

    int insertSelective(RoleResourcesKey record);

    List<RoleResourcesKey> selectByExample(RoleResourcesExample example);
}