package com.neuedu.test;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Test extends HttpServlet {
        @Override
        public void init (ServletConfig config) throws ServletException {
//        System.out.println("init method");
//        String val = config.getInitParameter("test");
//        System.out.println(val);
//        Enumeration<String> strs = config.getInitParameterNames();
//        while (strs.hasMoreElements()) {
//            System.out.println(strs.nextElement());
//        }
    }

        @Override
        protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=utf-8");
//
//        PrintWriter writer = resp.getWriter();
//        writer.print("<div style='border:solid 1px red'>狐</div>");
//        System.out.println("test请求");
//        System.out.println(req.getCharacterEncoding());
//        System.out.println(req.getServerPort());
//        System.out.println(req.getServerName());
//        System.out.println(req.getScheme());
//        servlet  生命周期
//        发送第一次请求   对象被创建
//
//        页面

    List<String > str = new ArrayList<>();
    str.add("a");
    str.add("ab");
    //作用域
            req.setAttribute("strlist",str);
            req.getRequestDispatcher("test.jsp").forward(req,resp);
    }
        @Override
        public void destroy () {
        System.out.println("对象被销毁");
    }
}
