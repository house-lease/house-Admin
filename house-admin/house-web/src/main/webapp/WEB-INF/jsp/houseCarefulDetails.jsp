<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/13
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <p>房屋名字:${house.houseName}</p>
<p>房东名字: ${house.userName}</p>
<p>起租月数: ${house.startName}</p>
 <p>月价格:${house.price}</p>
<p>房屋描述: ${house.narrate}</p>
<p>小区: ${house.uptown}</p>
<p>城市: ${house.address}</p>
 <p>类型名字:${house.houseTypeName}</p>
 <p>租赁类型名字:${house.houseLeaseName}</p>
<p>剩余房间: ${house.residueRoom}</p>
 <p>状态:
    <c:if test="${house.state == 1}">满租</c:if>
    <c:if test="${house.state == 0}">可租</c:if>
</p>
</body>
</html>
