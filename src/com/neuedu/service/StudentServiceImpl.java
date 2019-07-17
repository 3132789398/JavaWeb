package com.neuedu.service;

import com.neuedu.dao.StudentDao;
import com.neuedu.dao.StudentDaoImpl;
import com.neuedu.pojo.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentDao dao = new StudentDaoImpl();

    @Override
    public List<Student> getAll() {
        return dao.getAll();
    }

    @Override
    public int insert(Student student) {
        return dao.insert(student);
    }

    @Override
    public Student getStuBySno(Integer sno) {
        return dao.getStuBySno(sno);
    }

    @Override
    public int update(Student student) {
        return dao.update(student);
    }

    @Override
    public int del(int sno) {
        return dao.del(sno);
    }


}
