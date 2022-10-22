package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<UserModel, Integer> {

    UserModel findByUsername(String username);

    default UserModel loadUserByUsername(String username){

        UserModel user = findByUsername(username);

        if (user == null){
           return new UserModel();
        }

        return new UserModel(user.getId(),user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName(),
                user.getAddress(), user.getPhone(), user.getEmail(), user.getFavoritesList());
    }

}
