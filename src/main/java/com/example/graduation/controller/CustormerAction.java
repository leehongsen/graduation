package com.example.graduation.controller;

import com.example.graduation.pojo.TCustomers;
import com.example.graduation.service.CustomerService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/custormer")
public class CustormerAction {
    @Resource
    private CustomerService customerService;

    @RequestMapping
    public Map<String,Object> getAll(TCustomers customers, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<TCustomers> pageInfo = customerService.selectByPage(customers, start, length);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/add")
    public String add(TCustomers customers) {
        TCustomers u = customerService.selectByName(customers.getName());
        if(u != null)
            return "error";
        int r = customerService.save(customers);
        if(r>0)
            return "success";
        return "fail";
    }

}
