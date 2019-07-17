package com.neuedu.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 一个类  具有处理请求的能力
* 继承 HttpServlet
*
* 入口   重写service
* 哪个请求 与类进行对应
* */
public class TestWeb  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理请求执行");
    }
}
