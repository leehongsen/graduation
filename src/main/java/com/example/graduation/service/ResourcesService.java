package com.example.graduation.service;

import com.example.graduation.pojo.TResources;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface ResourcesService extends IService<TResources>{
    List<TResources> getAll();

    List<TResources> loadUserResources(Map<String,Object> map);

    List<TResources> queryResourcesListWithSelected(Integer rid);

    PageInfo<TResources> selectByPage(TResources resources, int start, int length);
}
