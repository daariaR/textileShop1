package com.example.demo.repository;

import com.example.demo.model.TextilModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TextilRepository extends MongoRepository<TextilModel, Integer> {
}
