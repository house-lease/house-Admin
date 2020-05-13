<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>房屋详情页面</title>
</head>
<body>
<table class="result-tab" width="100%" border="2px">
    <tr>
        <th>房屋详情编号</th>  <td>${houseCareful.id}</td>
        <th>房屋编号</th> <td>${houseCareful.houseId}</td>
        <th>床</th>   <td>${houseCareful.chuang}</td>
        <th>沙发</th> <td>${houseCareful.shafa}</td>
        <th>空调</th> <td>${houseCareful.kongtiao}</td>
        <th>燃气</th> <td>${houseCareful.ranqi}</td>
        <th>洗衣机</th> <td>${houseCareful.xiyiji}</td>
        <th>宽带</th> <td>${houseCareful.kuandai}</td>
        <th>电视</th> <td>${houseCareful.dianshi}</td>
        <th>冰箱</th> <td>${houseCareful.bingxiang}</td>
    </tr>
</table>
</body>
</html>
