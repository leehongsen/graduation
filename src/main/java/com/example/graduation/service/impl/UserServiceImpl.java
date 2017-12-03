package com.example.graduation.service.impl;

import com.example.graduation.dao.UserRoleMapper;
import com.example.graduation.pojo.User;
import com.example.graduation.pojo.UserRole;
import com.example.graduation.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService{
    @Resource
    private UserRoleMapper userRoleMapper;

    public User selectByUsername(String username) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",username);
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
        UserRole key=new UserRole();
        key.setUserId(userid);
        userRoleMapper.deleteByPrimaryKey(key);
    }
}
