package com.zuoqiang.entity;

/**
 * Created by ZUO on 2017/5/28.
 */
public class Article {
    private int id;
    private User user;
    private String title;
    private String content;
    public Article(){

    }
    public Article(int id,User user,String title,String content){
       this.id=id;
    }

}
