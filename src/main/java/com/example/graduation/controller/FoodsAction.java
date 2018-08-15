package com.example.graduation.controller;

import com.example.graduation.pojo.TFoods;
import com.example.graduation.service.FoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/foods")
public class FoodsAction {
    @Resource
    private FoodsService foodsService;

    @RequestMapping
    public Map<String,Object> getAll(TFoods food, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<TFoods> pageInfo = foodsService.selectByPage(food, start, length);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/add")
    public String add(TFoods food) {
        int r = foodsService.save(food);
        if(r>0)
            return "success";
        return "fail";
    }

    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        try{
            foodsService.delete(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("/foodsWithSelected")
    public List<TFoods> foodsWithSelected(Integer goodId){
        List<TFoods> a = foodsService.queryFoodsListWithSelected(1,goodId);
        for(TFoods tem : a){
            tem.getBusinessesId();
        }
        return a;
    }

    /**
     * 保存食物所属的商品套餐
     * @param map 商家对应服务
     *  	  此处获取的参数的角色id是以 “,” 分隔的字符串
     * @return
     */
    @RequestMapping("/saveFoodsGoods")
    public String saveFoodsGoods(Map<String,String> map){
        return "";
    }
}
