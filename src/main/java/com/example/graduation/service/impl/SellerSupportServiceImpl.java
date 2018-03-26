package com.example.graduation.service.impl;

import com.example.graduation.pojo.TBusinessesSupports;
import com.example.graduation.service.SellerSupportService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service("sellerSupportService")
public class SellerSupportServiceImpl extends BaseService<TBusinessesSupports> implements SellerSupportService {
    @Override
    public void addSellerSupport(TBusinessesSupports businessesSupports) {
        //删除
        Example example = new Example(TBusinessesSupports.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("businessesId",businessesSupports.getBusinessesId());
        mapper.deleteByExample(example);
        //添加
        String[] supportsIds = businessesSupports.getSupportsId().split(",");
        for (String supportsId : supportsIds) {
            TBusinessesSupports u = new TBusinessesSupports();
            u.setBusinessesId(businessesSupports.getBusinessesId()).setSupportsId(supportsId);
            mapper.insert(u);
        }
    }
}
