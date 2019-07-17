package com.neuedu.web;

import com.neuedu.pojo.Student;
import com.neuedu.service.StudentService;
import com.neuedu.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentWeb extends HttpServlet {
    private StudentService service = new StudentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> stus = service.getAll();
        req.setAttribute("stus",stus);
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
}
