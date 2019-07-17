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
@WebServlet("/update")
public class updateServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int sno =Integer.parseInt(req.getParameter("sno"));
        Student stu = service.getStuBySno(sno);
        req.setAttribute("stu",stu);
        req.getRequestDispatcher("update.jsp").forward(req,resp);
    }
}
