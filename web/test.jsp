<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/15
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- action  提交的地址
    method  提交的方式
--%>
<%! int x;%>
    <%List<String> strs =(List<String>) request.getAttribute("strlist");%>
<%
    for (int i=0;i<strs.size();i++){
        %>
            <%=strs.get(i)%>
        <%
    }
%>
    <form action="dologin">
        用户名:<input type="text" name="uname"><br>
        密码:<input type="password" name="psd"><br>
        <input type="submit">
    </form>
</body>
</html>
