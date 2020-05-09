<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/start/add">

    起租时间 <input type="text" name="startName"/>   (必填项)
    <br/>
    可计算起租时间<input type="text" name="startValue"/>(必填项)
    <br/>
    <input type="submit" value="添加">
</form>
</body>
</html>
