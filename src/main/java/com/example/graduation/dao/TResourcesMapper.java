package com.example.graduation.dao;

import com.example.graduation.pojo.TResources;
import com.example.graduation.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TResourcesMapper extends MyMapper<TResources> {
    List<TResources> getAll();
    List<TResources> loadUserResources(Map<String,Object> map);
    List<TResources> queryResourcesListWithSelected(Integer rid);
}