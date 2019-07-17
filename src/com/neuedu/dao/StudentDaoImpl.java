package com.neuedu.dao;

import com.neuedu.pojo.Student;
import com.neuedu.util.JdbcUtil;
import com.neuedu.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public List<Student> getAll() {
        return JdbcUtil.executeQuery("select * from student", new RowMap<Student>() {
            @Override
            public Student rowMapping(ResultSet rs) {
               Student s= new Student();
                try {
                    s.setSno(rs.getInt("sno"));
                    s.setSname(rs.getString("sname"));
                    s.setSage(rs.getInt("sage"));
                    s.setSsex(rs.getString("ssex"));
                    s.setDept(rs.getString("dept"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                return s;
            }
        });
    }

    @Override
    public int insert(Student student) {
        return JdbcUtil.executeupdate("insert into student(sname,sage,ssex,dept) value(?,?,?,?)",
                student.getSname(),student.getSage(),student.getSsex(),student.getDept());
    }

    @Override
    public Student getStuBySno(Integer sno) {
        return JdbcUtil.QueryOne("select * from student where sno=?", new RowMap<Student>() {
            @Override
            public Student rowMapping(ResultSet rs) {
                Student s = new Student();
                try {
                    s.setSno(rs.getInt("sno"));
                    s.setSname(rs.getString("sname"));
                    s.setSsex(rs.getString("ssex"));
                    s.setSage(rs.getInt("sage"));
                    s.setDept(rs.getString("dept"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return s;
            }
        },sno);

    }

    @Override
    public int update(Student student) {
        return JdbcUtil.executeupdate("update student sno sname=?, sage=?,ssex=?,sage=?,dept=? where sno=?", student.getSname(),student.getSage(),student.getSsex(),student.getDept(),student.getSno());
    }

    @Override
    public int del(int sno) {
        return JdbcUtil.executeupdate("delete from student where sno =?",sno);
    }


}
