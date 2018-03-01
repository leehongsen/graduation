package com.example.graduation.service.impl;

import com.example.graduation.dao.TRoleMapper;
import com.example.graduation.dao.TRoleResourcesMapper;
import com.example.graduation.pojo.TRole;
import com.example.graduation.pojo.TRoleResources;
import com.example.graduation.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl extends BaseService<TRole> implements RoleService {
    @Resource
    private TRoleMapper roleMapper;
    @Resource
    private TRoleResourcesMapper roleResourcesMapper;

    @Override
    public List<TRole> queryRoleListWithSelected(Integer uid) {
        return roleMapper.queryRoleListWithSelected(uid);
    }

    @Override
    public PageInfo<TRole> selectByPage(TRole role, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TRole.class);
        //分页查询
        PageHelper.startPage(page, length);
        List<TRole> rolesList = selectByExample(example);
        return new PageInfo<>(rolesList);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void delRole(Integer roleid) {
        //删除角色
        mapper.deleteByPrimaryKey(roleid);
        //删除角色资源
        Example example = new Example(TRoleResources.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roleid",roleid);
        roleResourcesMapper.deleteByExample(example);

    }
}
