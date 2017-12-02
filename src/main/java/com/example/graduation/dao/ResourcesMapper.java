package com.example.graduation.dao;

import com.example.graduation.pojo.Resources;
import com.example.graduation.pojo.ResourcesExample;
import java.util.List;
import java.util.Map;

public interface ResourcesMapper {
    long countByExample(ResourcesExample example);

    int deleteByPrimaryKey(Integer resourcesId);

    int insert(Resources record);

    int insertSelective(Resources record);

    List<Resources> selectByExample(ResourcesExample example);

    Resources selectByPrimaryKey(Integer resourcesId);

    int updateByPrimaryKeySelective(Resources record);

    int updateByPrimaryKey(Resources record);

    public List<Resources> loadUserResources(Map<String,Object> map);
}