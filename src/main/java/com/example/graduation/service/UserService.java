package com.example.graduation.service;

import com.example.graduation.pojo.TUser;
import com.github.pagehelper.PageInfo;

/**
 * 用户表
 */
public interface UserService extends IService<TUser>{
    PageInfo<TUser> selectByPage(TUser user, int start, int length);

    TUser selectByUsername(String username);

    void delUser(Integer userid);
}
