package com.example.graduation.service;

import com.example.graduation.pojo.TUserRole;


/**
 * 用户角色联立表
 */
public interface UserRoleService extends IService<TUserRole> {

    void addUserRole(TUserRole userRole);
}
