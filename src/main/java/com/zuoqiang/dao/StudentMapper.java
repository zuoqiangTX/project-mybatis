package com.zuoqiang.dao;


import com.zuoqiang.entity.Student;

public interface StudentMapper {

	// 根据id查询学生信息
	public Student selectStudentById(Integer id);

}
