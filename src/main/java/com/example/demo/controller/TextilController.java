package com.example.demo.controller;


import com.example.demo.model.TextilModel;
import com.example.demo.repository.TextilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TextilController {

    @Autowired
    private TextilRepository textilRepository;


    @GetMapping("/gettextils")
    @CrossOrigin(origins ="*")
    public List<TextilModel> getOrders() {
        return textilRepository.findAll();
    }


    @PostMapping("/addtextils")
    @CrossOrigin(origins ="*")
    public Boolean saveTextil(@RequestBody TextilModel textil) {
        textilRepository.save(textil);
        return true;
    }
}
