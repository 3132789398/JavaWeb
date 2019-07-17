package com.neuedu.web;

import com.neuedu.pojo.Student;
import com.neuedu.service.StudentService;
import com.neuedu.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class doAddServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sname = req.getParameter("sname");
        int sage =Integer.parseInt(req.getParameter("sage")) ;
        String ssex = req.getParameter("ssex");
        String dept = req.getParameter("dept");
        Student s= new Student();
        s.setSname(sname);
        s.setSage(sage);
        s.setSsex(ssex);
        s.setDept(dept);
        System.out.println(service.insert(s));
        resp.sendRedirect("all");

    }
}
