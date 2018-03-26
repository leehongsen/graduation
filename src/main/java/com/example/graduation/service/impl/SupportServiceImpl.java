package com.example.graduation.service.impl;

import com.example.graduation.dao.TBusinessesSupportsMapper;
import com.example.graduation.dao.TSupportsMapper;
import com.example.graduation.pojo.TBusinessesSupports;
import com.example.graduation.pojo.TSupports;
import com.example.graduation.service.SupportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("supportService")
public class SupportServiceImpl extends BaseService<TSupports> implements SupportService {
    @Resource
    private TSupportsMapper supportsMapper;
    @Resource
    private TBusinessesSupportsMapper businessesSupportsMapper;

    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void delSupport(Integer id) {
        //先删除商户服务联立表中的对应服务
        Example example = new Example(TBusinessesSupports.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("supportsId",id);
        businessesSupportsMapper.deleteByExample(example);

        //删除具体的服务
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<TSupports> selectByPage(TSupports supports, int start, int length) {
        int page = start/length+1;
        Example example = new Example(TSupports.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(supports.getDescription())) {
            criteria.andLike("description", "%" + supports.getDescription() + "%");
        }
        if (supports.getType() != null) {
            criteria.andEqualTo("type", supports.getType());
        }

        //分页查询
        PageHelper.startPage(page, length);
        List<TSupports> list = selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public TSupports selectByDescription(String description) {
        Example example = new Example(com.example.graduation.pojo.TSupports.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("description",description);
        List<TSupports> list = selectByExample(example);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<TSupports> queryRoleListWithSelected(Integer id) {
        return supportsMapper.querySupportListWithSelected(id);
    }
}
