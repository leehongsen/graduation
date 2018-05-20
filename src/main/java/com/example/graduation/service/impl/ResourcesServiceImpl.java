package com.example.graduation.service.impl;

import com.example.graduation.dao.TResourcesMapper;
import com.example.graduation.pojo.TResources;
import com.example.graduation.service.ResourcesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("resourcesService")
public class ResourcesServiceImpl extends BaseService<TResources> implements ResourcesService{
    @Resource
    private TResourcesMapper resourcesMapper;

    @Override
    public PageInfo<TResources> selectByPage(TResources resources, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TResources.class);
        example.orderBy("sort");
        //分页查询
        PageHelper.startPage(page, length);
        List<TResources> userList = selectByExample(example);
        return new PageInfo<>(userList);
    }

    @Override
    public List<TResources> getAll(){
        return resourcesMapper.getAll();
    }

    @Override
    //@Cacheable(cacheNames="resources",key="#map['userid'].toString()+#map['type']")
    public List<TResources> loadUserResources(Map<String, Object> map) {
        return resourcesMapper.loadUserResources(map);
    }

    @Override
    public List<TResources> queryResourcesListWithSelected(Integer rid) {
        return resourcesMapper.queryResourcesListWithSelected(rid);
    }
}
