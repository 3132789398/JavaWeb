<%@ page import="java.util.List" %>
<%@ page import="com.neuedu.pojo.Student" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/16
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;
        }
        tr td,tr th{
            border:solid 1px black;
            padding: 15px 5px;
        }

    </style>
</head>
<body>
<%--jstl--%>
<%--el表达式  作用域取值--%>

<%--${stus}&lt;%&ndash;key &ndash;%&gt;--%>
<%--<%List<Student> lists = (List<Student>)request.getAttribute("stus");%>--%>
<%--<%out.print(lists);%>--%>
<a href="add">添加</a>
<table>
    <thead>
        <tr>
            <th>sno</th>
            <th>sname</th>
            <th>ssex</th>
            <th>sage</th>
            <th>dept</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${stus}" var="s">
        <tr>
            <td>${s.sno}</td>
            <td>${s.sname}</td>
            <td>${s.ssex}</td>
            <td>${s.sage}</td>
            <td>${s.dept}</td>
            <td><a href="update?sno=${s.sno}">修改</a>&nbsp;&nbsp;&nbsp;
                <a href="del?sno=${s.sno}">删除</a></td>
        </tr>
    </c:forEach>
    <%--<c:if test="true">--%>
        <%--<a href="">baidu</a>--%>
    <%--</c:if>--%>
    <%--<c:choose>--%>
        <%--<c:when test="false">--%>
            <%--<div style="border: solid 1px firebrick"></div>--%>
        <%--</c:when>--%>
        <%--<c:otherwise>--%>
            <%--<div style="border: solid 1px chartreuse"></div>--%>
        <%--</c:otherwise>--%>
    <%--</c:choose>--%>
        <%--<%--%>
            <%--for (Student s:lists){%>--%>
                <%--<tr>--%>
                    <%--<td><%=s.getSno()%></td>--%>
                    <%--<td><%=s.getSname()%></td>--%>
                    <%--<td><%=s.getSsex()%></td>--%>
                    <%--<td><%=s.getSage()%></td>--%>
                    <%--<td><%=s.getDept()%></td>--%>
                <%--</tr>--%>
        <%--<%--%>
            <%--}--%>
            <%--;%>--%>
    </tbody>
</table>


</body>
</html>
