package com.example.graduation.service;

import com.example.graduation.dao.UserRoleMapper;
import com.example.graduation.pojo.User;
import com.example.graduation.pojo.UserExample;
import com.example.graduation.pojo.UserRoleExample;
import com.example.graduation.pojo.UserRoleKey;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService extends BaseService<User> {
    @Resource
    private UserRoleMapper userRoleMapper;

    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameNotEqualTo(username);
        List<User> userList = selectByExample(example);
        if(userList.size()>0){
            return userList.get(0);
        }
        return null;
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void delUser(Integer userid) {
        //删除用户表
        mapper.deleteByPrimaryKey(userid);
        //删除用户角色表
        UserRoleKey key=new UserRoleKey();
        key.setUserId(userid);
        userRoleMapper.deleteByPrimaryKey(key);
    }
}
