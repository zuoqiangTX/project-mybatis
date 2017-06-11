package com.zuoqiang.dao;


import com.zuoqiang.entity.Clazz;

public interface ClazzMapper {

	// 根据id查询班级信息
	public Clazz selectClazzById(Integer id);
	
}
