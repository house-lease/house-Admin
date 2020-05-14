<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>房屋详情页面</title>
</head>
<body>
<div>
    <div>
        <span>房屋详情编号:</span>  <span>${houseCareful.id}</span>
    </div>
        <div><span>房屋编号:</span> <span>${houseCareful.houseId}</span> </div>
            <div> <span>床:</span>
        <span>  <c:if test="${houseCareful.chuang == 0}">有</c:if>
        <c:if test="${houseCareful.chuang == 1}">没有</c:if>
    </span>  </div>
                <div> <span>沙发:</span> <span>  <c:if test="${houseCareful.shafa == 0}">有</c:if>
        <c:if test="${houseCareful.shafa == 1}">没有</c:if></span>  </div>
                    <div>  <span>空调:</span> <span>  <c:if test="${houseCareful.kongtiao == 0}">有</c:if>
        <c:if test="${houseCareful.kongtiao == 1}">没有</c:if></span>  </div>
                        <div><span>燃气:</span> <span> <c:if test="${houseCareful.ranqi == 0}">有</c:if>
        <c:if test="${houseCareful.ranqi == 1}">没有</c:if></span>  </div>
                            <div>  <span>洗衣机:</span> <span>  <c:if test="${houseCareful.xiyiji == 0}">有</c:if>
        <c:if test="${houseCareful.xiyiji == 1}">没有</c:if></span> </div>
                                <div>  <span>宽带:</span> <span> <c:if test="${houseCareful.kuandai == 0}">有</c:if>
        <c:if test="${houseCareful.kuandai == 1}">没有</c:if></span> </div>
                                    <div>  <span>电视:</span> <span> <c:if test="${houseCareful.dianshi == 0}">有</c:if>
        <c:if test="${houseCareful.dianshi == 1}">没有:</c:if></span>  </div>
                                        <div><span>冰箱:</span> <span><c:if test="${houseCareful.bingxiang == 0}">有</c:if>
        <c:if test="${houseCareful.bingxiang == 1}">没有</c:if></span> </div>

</div>
</body>
</html>
