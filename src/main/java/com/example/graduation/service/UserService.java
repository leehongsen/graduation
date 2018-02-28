package com.example.graduation.service;

import com.example.graduation.pojo.TUser;

public interface UserService extends IService<TUser>{
    TUser selectByUsername(String username);

    void delUser(Integer userid);
}
