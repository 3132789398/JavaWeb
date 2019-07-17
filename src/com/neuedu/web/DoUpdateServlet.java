package com.neuedu.web;

import com.neuedu.pojo.Student;
import com.neuedu.service.StudentService;
import com.neuedu.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doUpdate")
public class DoUpdateServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student stu = new Student();
        stu.setSno(Integer.parseInt(req.getParameter("sno")));
        stu.setSname(req.getParameter("sname"));
        stu.setSsex(req.getParameter("ssex"));
        stu.setSage(Integer.parseInt(req.getParameter("sage")));
        stu.setDept(req.getParameter("dept"));
        service.update(stu);
        resp.sendRedirect("all");
    }
}
