<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/start/update">
    起租时间id<input type="text" name="id" value="${start.id}" readonly="readonly"/>
    起租时间 <input type="text" name="startName" value="${start.startName}"/>
    可计算起租时间<input type="text" name="startValue" value="${start.startValue}"/>

    <input type="submit" value="修改">
</form>
</body>
</html>
