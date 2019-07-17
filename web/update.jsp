<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/17
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        ${stu}
        <form action="doUpdate">
            <input type="text" name="sno" value="${stu.sno}" hidden="hidden"/>
            sname:<input type="text" name="sname" value="${stu.sname}"><br>
            sage:<input type="text" name="sage" value="${stu.sage}"><br>
            ssex:<label>男：<input type="radio" name="ssex" value="男" <c:if test="${stu.ssex=='男'}">checked="checked"</c:if>></label>
            &nbsp;<label>ssex:女：<input type="radio" name="ssex" value="女" <c:if test="${stu.ssex=='女'}">checked="checked"</c:if>></label><br>
            dept:<input type="text" name="dept" value="${stu.dept}"><br>
            <input type="submit" value="修改">

        </form>
</body>
</html>
