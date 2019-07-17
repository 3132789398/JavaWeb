<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/15
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    success login
    <%pageContext.forward("");%>
    <%pageContext.getErrorData();%>
    <%pageContext.getException();%>
    <%pageContext.getPage();%>
    <%pageContext.getRequest();%>
    <%pageContext.getResponse();%>
    <%pageContext.getServletConfig();%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



</body>
</html>
