package com.zuoqiang.entity;

/**
 * Created by ZUO on 2017/5/28.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private int deleteFlag;

    public User() {
    }

    public User(int id, String name, int age, String password, int deleteFlag) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
        this.deleteFlag = deleteFlag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
