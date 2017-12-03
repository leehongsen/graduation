package com.example.graduation.dao;

import com.example.graduation.pojo.Resources;
import com.example.graduation.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface ResourcesMapper extends MyMapper<Resources> {

    List<Resources> getAll();
    List<Resources> loadUserResources(Map<String,Object> map);

}