package com.southwind.controller;


import com.southwind.entity.Order;
import com.southwind.entity.OrderVo;
import com.southwind.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/save")
    public void save(@RequestBody Order order){
        order.setDate(new Date());
        orderRepository.save(order);
    }
    @GetMapping("/findAllByUid/{index}/{limit}/{uid}")
    public OrderVo findAllByUid(@PathVariable("index") int index, @PathVariable("limit") int limit, @PathVariable("uid") long uid){
        OrderVo orderVo = new OrderVo();
        orderVo.setMsg("");
        orderVo.setCount(orderRepository.countByUid(uid));
        orderVo.setData(orderRepository.findAllByUid(index, limit,uid));
        return orderVo;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public OrderVo findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        OrderVo orderVo = new OrderVo();
        orderVo.setMsg("");
        orderVo.setCount(orderRepository.count());
        orderVo.setData(orderRepository.findAll(index, limit));
        return orderVo;
    }

    @GetMapping("/updateState/{id}")
    public void updateState(@PathVariable("id") long id){
        orderRepository.updateState(id);
    }
}
