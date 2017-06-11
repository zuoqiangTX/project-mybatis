package com.zuoqiang.dao;

import com.zuoqiang.entity.Person;

/**
 * Created by ZUO on 2017/6/11.
 */
public interface PersonMapper {
    public Person selectPersonById(Integer id);
}
