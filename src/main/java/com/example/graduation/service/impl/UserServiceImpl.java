package com.example.graduation.service.impl;

import com.example.graduation.dao.TUserRoleMapper;
import com.example.graduation.pojo.TUser;
import com.example.graduation.pojo.TUserRole;
import com.example.graduation.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends BaseService<TUser> implements UserService{

    @Resource
    private TUserRoleMapper userRoleMapper;

    @Override
    public PageInfo<TUser> selectByPage(TUser user, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(user.getUsername())) {
            criteria.andLike("username", "%" + user.getUsername() + "%");
        }
        if (user.getUserid() != null) {
            criteria.andEqualTo("userid", user.getUserid());
        }
        if (StringUtil.isNotEmpty(user.getEnable())) {
            criteria.andEqualTo("enable", user.getEnable());
        }
        //分页查询
        PageHelper.startPage(page, length);
        List<TUser> userList = selectByExample(example);
        return new PageInfo<>(userList);
    }

    public TUser selectByUsername(String username) {
        Example example = new Example(com.example.graduation.pojo.TUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",username);
        List<TUser> userList = selectByExample(example);
        if(userList.size()>0){
            return userList.get(0);
        }
        return null;
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void delUser(Integer userid) {
        //删除用户角色表
        TUserRole key=new TUserRole();
        key.setUserid(userid);
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userid",userid);
        userRoleMapper.deleteByExample(example);
        //删除用户表
        mapper.deleteByPrimaryKey(userid);
    }
}
