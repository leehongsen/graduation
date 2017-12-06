package com.example.graduation.service.impl;

import com.example.graduation.dao.ResourcesMapper;
import com.example.graduation.pojo.Resources;
import com.example.graduation.service.ResourcesService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("resourcesService")
public class ResourcesServiceImpl extends BaseService<Resources> implements ResourcesService{
    @Resource
    private ResourcesMapper resourcesMapper;

    public List<Resources> getAll(){
        return resourcesMapper.getAll();
    }

    @Cacheable(cacheNames="resources",key="#map['userid'].toString()+#map['type']")
    public List<Resources> loadUserResources(Map<String, Object> map) {
        return resourcesMapper.loadUserResources(map);
    }
}
