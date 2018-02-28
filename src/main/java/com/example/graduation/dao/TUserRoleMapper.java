package com.example.graduation.dao;

import com.example.graduation.pojo.TUserRole;
import com.example.graduation.util.MyMapper;

import java.util.List;

public interface TUserRoleMapper extends MyMapper<TUserRole> {
    List<Integer> findUserIdByRoleId(Integer roleId);
}