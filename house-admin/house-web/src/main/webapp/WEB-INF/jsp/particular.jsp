<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/particular/selectByUserId">

    <div>
        用户id：  <input type="text" name="userId" value="${userId}"/>
        <input type="submit" value="查询" id="sub" class="sub"/>
    </div>

<table border="1" class="result-tab">

    <th>充值编号</th>
    <th>用户编号</th>
    <th>用户姓名</th>
    <th>用户可以资金</th>
    <th>充值时间</th>
    <c:forEach items="${particulars}" var="particulars">

        <tr>
            <td>${particulars.id}</td>
            <td>${particulars.user.id}</td>
            <td>${particulars.userName}</td>
            <td>${particulars.money}</td>
            <td><fmt:formatDate value="${particulars.refillTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>
