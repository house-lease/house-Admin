<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改用户状态</title>
</head>
<body>
    <h2>修改用户状态</h2>
<form action="${pageContext.request.contextPath}/user/updateByState" method="post">
    用户编号：<input name="id" type="text" disabled value="${id}" /><br>
    状态：<input name="state" placeholder="0:正常  1：删除" type="text">
    <input type="submit" value="修改" name="update"/>
</form>
</body>
</html>
