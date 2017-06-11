package com.zuoqiang.entity;

/**
 * Created by ZUO on 2017/5/28.
 */
/**
 * CREATE TABLE `user` (
 `id` int(10) NOT NULL AUTO_INCREMENT,
 `name` varchar(15) NOT NULL,
 `password` varchar(30) NOT NULL,
 `age` int(2) DEFAULT NULL,
 `deleteFlag` int(2) DEFAULT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf-8;

 * CREATE TABLE `article` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `userid` int(11) NOT NULL,
 `title` varchar(100) NOT NULL,
 `content` text NOT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf-8;

 *INSERT INTO `article` VALUES (1, 1, 'a', 'aaaaa');
 INSERT INTO `article` VALUES (2, 1, 'b', 'bbbb');
 INSERT INTO `article` VALUES (3, 1, 'c', 'ccccc');
 INSERT INTO `article` VALUES (4, 1, 'd', 'dddd');

 * INSERT INTO `user` VALUES (1, 'zuoqiang', '123456', 23, NULL);
 INSERT INTO `user` VALUES (2, 'wangbin', '1223456', 23, NULL);
 INSERT INTO `user` VALUES (4, 'zuoxiaoqiang', '1223456', 40, NULL);
 **/
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
