package com.example.graduation.service;

import com.example.graduation.pojo.Resources;

import java.util.List;
import java.util.Map;

public interface ResourcesService extends IService<Resources>{
    List<Resources> getAll();

    List<Resources> loadUserResources(Map<String,Object> map);
}
