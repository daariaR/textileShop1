package com.example.demo.controller;

import com.example.demo.model.OrderModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;


    @PostMapping("/addOrder")
    @CrossOrigin(origins ="*")
    public Boolean saveOrder(@RequestBody OrderModel order) {
        orderRepository.save(order);
        return true;
    }


    @GetMapping("getorders")
    @CrossOrigin(origins ="*")
    public List<OrderModel> getOrders() {
        return orderRepository.findAll();
    }

    @DeleteMapping("/removeOrder/{id}")
    @CrossOrigin(origins ="*")
    public Boolean deleteOrder(@PathVariable int id) {
        orderRepository.deleteById(id);
        return true;
    }

}
