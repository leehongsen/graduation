package com.example.graduation.service;

import com.github.pagehelper.PageInfo;
import com.example.graduation.pojo.TRole;

import java.util.List;

/**
 * 角色表
 */
public interface RoleService extends IService<TRole> {

    List<TRole> queryRoleListWithSelected(Integer uid);

    PageInfo<TRole> selectByPage(TRole role, int start, int length);

    /**
     * 删除角色 同时删除角色资源表中的数据
     * @param roleid
     */
    void delRole(Integer roleid);
}
