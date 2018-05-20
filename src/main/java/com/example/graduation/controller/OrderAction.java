package com.example.graduation.controller;

import com.example.graduation.pojo.TBusinesses;
import com.example.graduation.pojo.TCustomers;
import com.example.graduation.pojo.TOrders;
import com.example.graduation.service.CustomerService;
import com.example.graduation.service.OrderService;
import com.example.graduation.service.SellerSerivice;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderAction {
    @Resource
    private OrderService orderService;
    @Resource
    private CustomerService customerService;
    @Resource
    private SellerSerivice sellerSerivice;

    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        try{
            orderService.delOrder(id);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping
    public Map<String,Object> getAll(TOrders order, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<TOrders> pageInfo = orderService.selectByPage(order, start, length);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping("/getOne")
    public Map<String,Object> getOne(Integer id){
        Map<String,Object> map =new HashMap<>();

        TOrders temp = new TOrders();
        temp.setId(id);
        PageInfo<TOrders> pageInfo1 = orderService.selectByPage(temp, 1, 10);
        int customerId = pageInfo1.getList().get(0).getCustomerId();
        TCustomers tCustomers = new TCustomers();
        tCustomers.setId(customerId);
        PageInfo<TCustomers> pageInfo2 = customerService.selectByPage(tCustomers,1,10);
        TBusinesses tBusinesses = new TBusinesses();
        int businessesId = pageInfo1.getList().get(0).getBusinessesId();
        tBusinesses.setId(businessesId);
        PageInfo<TBusinesses> pageInfo3 = sellerSerivice.selectByPage(tBusinesses,1,10);
        map.put("id",id);
        map.put("number",pageInfo1.getList().get(0).getNumber());
        map.put("totalCost",pageInfo1.getList().get(0).getTotalCost());
        map.put("state",pageInfo1.getList().get(0).getState());
        map.put("customerId",customerId);
        map.put("customerName",pageInfo2.getList().get(0).getName());
        map.put("address",pageInfo2.getList().get(0).getAddress());
        map.put("businessesId",businessesId);
        map.put("businessesName",pageInfo3.getList().get(0).getName());
        return map;
    }
}
