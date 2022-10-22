package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="History")
public class HistoryModel {

    @Id
    private int id;
    private List<Object> sentItems;
    private int user_id;

    public HistoryModel(int id, List<Object> sentItems, int user_id) {
        this.id = id;
        this.sentItems = sentItems;
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getSentItems() {
        return sentItems;
    }

    public void setSentItems(List<Object> sentItems) {
        this.sentItems = sentItems;
    }
}
