<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改/删除城市页面</title>
</head>
<body>
    <h2>修改城市</h2>
    <form action="${pageContext.request.contextPath}/address/updateByDelete" method="post">

        城市编号：<input type="text" disabled value="${address.id}"  name="id"/> <br/>
        城市名：<input type="text" value="${address.address}" name="address"> <br/>
        父级编号：<input type="text" value="${address.parentId}" name="parentId"> <br/>
        城市的状态：<input type="text" placeholder="0:正常 1:删除" name="state" value="${address.state}"><br>
        <input type="submit" value="修改" id="sub" />
    </form>
</body>
</html>
