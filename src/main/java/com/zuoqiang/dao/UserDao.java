package com.zuoqiang.dao;

import com.zuoqiang.entity.User;

import java.util.List;

/**
 * Created by ZUO on 2017/5/28.
 */
public interface UserDao {

    public void insertUser(User user);

    public User findById(int userid);

    public List<User> findByName(String name);

    public List<User> findAllUsers();

    public void UpdateUser(User user);

    public void deleteUser(String name);

    
}
