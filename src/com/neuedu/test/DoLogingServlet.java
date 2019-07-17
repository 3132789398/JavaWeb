package com.neuedu.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoLogingServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String  uname = req.getParameter("uname");
        String  pass = req.getParameter("psd");
        if (uname.equals("a")&& pass.equals("1")){
            req.getRequestDispatcher("success.jsp").forward(req,resp);
            System.out.println(uname+"===="+pass);
        }else{
            req.getRequestDispatcher("Defeat.jsp").forward(req,resp);
            System.out.println(uname+"!==="+pass);
        }
    }
}
