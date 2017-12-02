package com.example.graduation.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用接口
 */
@Service
public interface IService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int update(T entity);

    List<T> selectByExample(Object example);

    //TODO 其他...
}
