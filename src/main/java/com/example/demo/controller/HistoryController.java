package com.example.demo.controller;

import com.example.demo.model.HistoryModel;
import com.example.demo.model.OrderModel;
import com.example.demo.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    HistoryRepository historyRepository;


    @PostMapping("/addhistory")
    @CrossOrigin(origins ="*")
    public Boolean saveOrder(@RequestBody HistoryModel his) {
        historyRepository.save(his);
        return true;
    }


    @GetMapping("gethistory")
    @CrossOrigin(origins ="*")
    public List<HistoryModel> getOrders() {
        return historyRepository.findAll();
    }


}
