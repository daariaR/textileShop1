package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection="Textil")
public class TextilModel {

    @Id
    private BigInteger _id;
    private String id;
    private String url;
    private String desc;
    private String price;
    private String type;
    private String product_arr_time;
    private Boolean avlbl;
    private String faav;


    public TextilModel(BigInteger _id, String id, String url, String desc, String price, String type, String product_arr_time, Boolean avlbl, String faav) {
        this._id = _id;
        this.id = id;
        this.url = url;
        this.desc = desc;
        this.price = price;
        this.type = type;
        this.product_arr_time = product_arr_time;
        this.avlbl = avlbl;
        this.faav = faav;
    }

    public BigInteger get_id() {
        return _id;
    }

    public void set_id(BigInteger _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProduct_arr_time() {
        return product_arr_time;
    }

    public void setProduct_arr_time(String product_arr_time) {
        this.product_arr_time = product_arr_time;
    }

    public Boolean getAvlbl() {
        return avlbl;
    }

    public void setAvlbl(Boolean avlbl) {
        this.avlbl = avlbl;
    }

    public String getFaav() {
        return faav;
    }

    public void setFaav(String faav) {
        this.faav = faav;
    }
}
