package com.example.graduation.service;

import com.example.graduation.pojo.TRoleResources;

/**
 * 角色权限联立表
 */
public interface RoleResourcesService extends IService<TRoleResources>  {
    void addRoleResources(TRoleResources roleResources);
}
