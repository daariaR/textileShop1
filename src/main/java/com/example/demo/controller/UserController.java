package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/addUser")
    @CrossOrigin(origins ="*")
    public Boolean saveUser(@RequestBody UserModel user) {
        userRepository.save(user);
        return true;
    }


    @GetMapping("/getusers")
    @CrossOrigin(origins ="*")
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }


    @GetMapping("/getById/{id}")
    @CrossOrigin(origins ="*")
    public Optional<UserModel> getUser(@PathVariable int id) {
        return userRepository.findById(id);
    }


    @DeleteMapping("/deleteUser/{id}")
    @CrossOrigin(origins ="*")
    public Boolean deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
        return true;
    }

    @GetMapping("findbyusernamereturnid/{username}")
    @CrossOrigin(origins = "*")
    public int findByUsernameReturnId(@PathVariable String username)
    {
        var usernameRetId = userRepository.findByUsername(username);
        return usernameRetId.getId();
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "*")
    public Boolean login(@RequestBody UserModel editUser, UserModel model){
        try {
            var user = userRepository.loadUserByUsername(editUser.getUsername());
            if (user == null) {
                return false;
            }else{
                if(editUser.getPassword().matches(user.getPassword())){
                    return true;
                } else{ return false;}
            }
        }catch(Exception e) {
            return false;
        }
    }

    @PostMapping("/edit")
    @CrossOrigin(origins = "*")
    public UserModel edit(@RequestBody UserModel model) {
        return userRepository.save(model);
    }

}