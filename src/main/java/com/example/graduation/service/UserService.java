package com.example.graduation.service;

import com.example.graduation.pojo.User;

public interface UserService extends IService<User>{
    User selectByUsername(String username);

    void delUser(Integer userid);
}
