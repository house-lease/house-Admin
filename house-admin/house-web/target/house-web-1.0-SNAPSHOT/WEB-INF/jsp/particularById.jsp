<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/particular/selectById">

    <div>
        充值记录id： <input type="text" name="id" value="${id}"/>
        <input type="submit" value="查询" id="sub" class="sub"/>
    </div>

    <table border="1" class="result-tab">
        <th>充值编号</th>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>用户可以资金</th>
        <th>充值时间</th>
        <th>状态</th>
            <tr>
                <td>${particular.id}</td>
                <td>${particular.user.id}</td>
                <td>${particular.userName}</td>
                <td>${particular.money}</td>
                <td><fmt:formatDate value="${particular.refillTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                <c:if test="${particular.state==0}">
                    <td>正常</td>
                </c:if>
                <c:if test="${particular.state==1}">
                    <td>删除</td>
                </c:if>
            </tr>
    </table>
</form>
</body>
</html>
