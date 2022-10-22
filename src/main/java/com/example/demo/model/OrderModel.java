package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="Order")
public class OrderModel {


    @Id
    private int id;
    private List<Object> textil;
    private int user_id;
    private String status;

    public OrderModel(int id,  List<Object> textil, int user_id, String status) {
        this.id = id;
        this.textil = textil;
        this.user_id = user_id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getTextil() {
        return textil;
    }

    public void setTextil( List<Object> textil) {
        this.textil = textil;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "id=" + id +
                ", textil=" + textil +
                ", user_id=" + user_id +
                ", status=" + status +
                '}';
    }
}
