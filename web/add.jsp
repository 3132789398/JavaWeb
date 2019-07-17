<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/16
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="doAdd">
        sname:<input type="text" name="sname"><br>
        sage:<input type="text" name="sage"><br>
        ssex:<label>男：<input type="radio" name="ssex"></label>
        &nbsp;<label>ssex:女：<input type="radio" name="ssex"></label><br>
        dept:<input type="text" name="dept"><br>
        <input type="submit" value="添加">
    </form>
</body>
</html>
