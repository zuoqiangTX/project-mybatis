package com.zuoqiang.entity;

/**
 * Created by ZUO on 2017/6/11.
 */
public class Card {
    private Integer id;
    private String code;

    public Card() {
    }

    public Card(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
