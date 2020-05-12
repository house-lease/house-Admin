<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户状态</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/updateByState" method="post">
    <input name="id" type="text" value="${user.id}" disabled="disabled"/>
    <br/>
    <input type="checkbox" value="正常" name="state" />
    <input type="checkbox" value="删除"  name="state"/>
    <br/>
    <input type="submit" value="修改" name="update"/>
</form>
</body>
</html>
