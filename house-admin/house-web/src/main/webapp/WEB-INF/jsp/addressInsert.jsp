
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加城市</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/address/insertAddress" method="post">
        城市名：<input type="text" name="address"><br>
        父级编号：<input type="text" name="parentId"><br>
        城市的状态：<input value="0" type="radio" name="state" checked>正常
                    <input value="1" type="radio" name="state">删除
        <br>
        <input type="submit" name="sub" value="添加">
    </form>
</body>
</html>
