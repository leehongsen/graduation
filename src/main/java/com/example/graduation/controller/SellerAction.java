package com.example.graduation.controller;

import com.example.graduation.pojo.TBusinesses;
import com.example.graduation.pojo.TBusinessesSupports;
import com.example.graduation.pojo.TGoods;
import com.example.graduation.service.GoodsService;
import com.example.graduation.service.SellerSerivice;
import com.example.graduation.service.SellerSupportService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/seller")
public class SellerAction {
    @Resource
    private SellerSerivice sellerSerivice;
    @Resource
    private SellerSupportService sellerSupportService;
    @Resource
    private GoodsService goodsService;

    @RequestMapping
    public Map<String,Object> getAll(TBusinesses seller, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<TBusinesses> pageInfo = sellerSerivice.selectByPage(seller, start, length);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/add")
    public String add(TBusinesses seller) {
        TBusinesses u = sellerSerivice.selectByName(seller.getName());
        if(u != null)
            return "error";
        int r = sellerSerivice.save(seller);
        if(r>0)
            return "success";
        return "fail";
    }

    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        try{
            sellerSerivice.delSeller(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    /**
     * 保存卖家提供的服务
     * @param businessesSupports 商家对应服务
     *  	  此处获取的参数的角色id是以 “,” 分隔的字符串
     * @return
     */
    @RequestMapping("/saveBusinessesSupports")
    public String saveBusinessesSupports(TBusinessesSupports businessesSupports){
        if(StringUtils.isEmpty(businessesSupports.getBusinessesId()))
            return "error";
        try {
            sellerSupportService.addSellerSupport(businessesSupports);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("/getGoods")
    public List<TGoods> getGoods(Integer id){
        return goodsService.getGoodsBySeller(id);
    }

    @RequestMapping("/getOne")
    public TBusinesses getOne(Integer id){
        return sellerSerivice.selectByKey(id);
    }

    @RequestMapping("/update")
    public String update(TBusinesses tBusinesses){
        try{
            sellerSerivice.update(tBusinesses);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
}
