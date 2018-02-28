package com.example.graduation.dao;

import com.example.graduation.pojo.TRole;
import com.example.graduation.util.MyMapper;

import java.util.List;

public interface TRoleMapper extends MyMapper<TRole> {
    List<TRole> queryRoleListWithSelected(Integer id);
}