package com.neuedu.test;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Forwarding extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("创建对象");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> strs = new ArrayList<>();
        strs.add("a");
        strs.add("ab");
        strs.add("abc");
        req.setAttribute("strlist",strs);
        req.getRequestDispatcher("Forwar.jsp").forward(req,resp);
    }


    @Override
    public void destroy() {
//        System.out.println(" 对象被销毁");
    }
}
