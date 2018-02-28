package com.example.graduation.service;

import com.example.graduation.pojo.TResources;

import java.util.List;
import java.util.Map;

public interface ResourcesService extends IService<TResources>{
    List<TResources> getAll();

    List<TResources> loadUserResources(Map<String,Object> map);
}
