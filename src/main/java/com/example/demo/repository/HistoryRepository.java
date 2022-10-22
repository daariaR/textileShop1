package com.example.demo.repository;

import com.example.demo.model.HistoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HistoryRepository  extends MongoRepository<HistoryModel, Integer> {
}
