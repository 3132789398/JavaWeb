package com.neuedu.dao;

import com.neuedu.pojo.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAll();
    int insert(Student student);
    Student getStuBySno(Integer sno);
    int update(Student student);
    int del(int sno);


}
