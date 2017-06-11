package com.zuoqiang.entity;

/**
 * Created by ZUO on 2017/6/11.
 */
public class Person {
    private Integer id;
    private  String name;
    private String sex;
    private Integer age;
    private Card card;

    public Person() {
    }

    public Person(Integer age, Integer id, String name, String sex, Card card) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.card = card;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
