<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>

    <meta content="text/html; charset=UTF-8">
    <title>后台</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/Adminbackgroundshipment/css/common.css"/>
    <link type="text/css" href="${pageContext.request.contextPath}/static/Adminbackgroundshipment/css/main.css"
          rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/Adminbackgroundshipment/js/libs/modernizr.min.js"></script>
    <script>
        $(function () {
            $(".sidebar-list .sub-menu").hide();
            $(".sidebar-list .sub-menu1").hide();
            $(".sidebar-list .sub-menu2").hide();
            $(".sidebar-list .sub-menu3").hide();
            $(".sidebar-list .sub-menu4").hide();
//				$(".result-wrap").hide();
            $(".sidebar-list a").click(function () {
                $(".sidebar-list .sub-menu").show();
                $(".sidebar-list .sub-men2").hide();
                $(".sidebar-list .sub-menu1").hide();
                $(".sidebar-list .sub-menu3").hide();
                $(".sidebar-list .sub-menu4").hide();

            })




            $(".sidebar-list #a3").click(function () {
                $(".sidebar-list .sub-menu3").show();
                $(".sidebar-list .sub-menu").hide();
                $(".sidebar-list .sub-men2").hide();
                $(".sidebar-list .sub-menu1").hide();
                $(".sidebar-list .sub-menu4").hide();
            })

            $(".sidebar-list #a2").click(function () {
                $(".sidebar-list .sub-menu2").show();
                $(".sidebar-list .sub-menu1").hide();
                $(".sidebar-list .sub-menu").hide();
                $(".sidebar-list .sub-menu3").hide();
                $(".sidebar-list .sub-menu4").hide();

            })

            $(".sidebar-list #a1").click(function () {
                $(".sidebar-list .sub-menu1").show();
                $(".sidebar-list .sub-menu").hide();
                $(".sidebar-list .sub-menu2").hide();
                $(".sidebar-list .sub-menu3").hide();
                $(".sidebar-list .sub-menu4").hide();
            })


            $(".sidebar-list #a4").click(function () {
                $(".sidebar-list .sub-menu4").show();
                $(".sidebar-list .sub-menu").hide();
                $(".sidebar-list .sub-menu1").hide();
                $(".sidebar-list .sub-menu2").hide();
                $(".sidebar-list .sub-menu3").hide();
            })


            $(".sidebar-list").mouseenter(function () {
                $(".sidebar-list .sub-menu").hide();

            })
            $(".sidebar-list ").mouseenter(function () {
                $(".sidebar-list .sub-menu1").hide();

            })

            $(".sidebar-list").mouseenter(function () {
                $(".sidebar-list .sub-menu2").hide();

            })
            $(".sidebar-list ").mouseenter(function () {
                $(".sidebar-list .sub-menu13").hide();

            })

            $(".sidebar-list ").mouseenter(function () {
                $(".sidebar-list .sub-menu14").hide();

            })


        })
    </script>
    <style>
        .sidebar-list li .icon-font-video {
            margin-right: 5px;
            color: #888;
            font-size: 14px;
        }

        .sidebar-list li #a1 {
            padding: 0 16px 0 20px;
            display: block;
            height: 38px;
            line-height: 38px;
            color: #333;
        }

        .sidebar-list li #a1:hover {
            background: #fff;
            color: #286a46;
        }

        .sub-menu1 {
            border-top: 1px solid #e5e5e5;
            background: #fff;
        }

        .sub-menu1 {
            border-top: 1px solid #e5e5e5;
            background: #fff;
        }

        .sub-menu1 li {
            padding-left: 21px;
        }

        .sub-menu1 li.on {
            background: #1963AA;
        }

        .sub-menu1 li.on #a1 {
            background: #1963AA;
            color: #fff;
        }

        .sub-menu1 li.on .icon-font {
            color: #fff;
        }

        .sub-menu1 .icon-font {
            font-size: 11px;
        }

        .icon-font-video {
            font-family: 'icomoon';
            speak: none;
            font-weight: 400;
            font-style: normal;
            font-variant: normal;
            text-transform: none;
            line-height: 1;
            -webkit-font-smoothing: antialiased;
        }
    </style>


    <style>
        .sidebar-list li .icon-font-user {
            margin-right: 5px;
            color: #888;
            font-size: 14px;
        }

        .sidebar-list li #a2 {
            padding: 0 16px 0 20px;
            display: block;
            height: 38px;
            line-height: 38px;
            color: #333;
        }

        .sidebar-list li #a2:hover {
            background: #fff;
            color: #286a46;
        }

        .sub-menu2 {
            border-top: 1px solid #e5e5e5;
            background: #fff;

        }

        .sub-menu2 {
            border-top: 1px solid #e5e5e5;
            background: #fff;
        }

        .sub-menu2 li {
            padding-left: 21px;
        }

        .sub-menu2 li.on {
            background: #1963AA;
        }

        .sub-menu2 li.on #a2 {
            background: #1963AA;
            color: #fff;
        }

        .sub-menu2 li.on .icon-font {
            color: #fff;
        }

        .sub-menu2 .icon-font {
            font-size: 11px;
        }

        .icon-font-user {
            font-family: 'icomoon';
            speak: none;
            font-weight: 400;
            font-style: normal;
            font-variant: normal;
            text-transform: none;
            line-height: 1;
            -webkit-font-smoothing: antialiased;
        }
    </style>


    <style>
        .sidebar-list li .icon-font-user {
            margin-right: 5px;
            color: #888;
            font-size: 14px;
        }

        .sidebar-list li #a4 {
            padding: 0 16px 0 20px;
            display: block;
            height: 38px;
            line-height: 38px;
            color: #333;
        }

        .sidebar-list li #a4:hover {
            background: #fff;
            color: #286a46;
        }

        .sub-menu4 {
            border-top: 1px solid #e5e5e5;
            background: #fff;

        }

        .sub-menu4 {
            border-top: 1px solid #e5e5e5;
            background: #fff;
        }

        .sub-menu4 li {
            padding-left: 21px;
        }

        .sub-menu4 li.on {
            background: #1963AA;
        }

        .sub-menu4 li.on #a4 {
            background: #1963AA;
            color: #fff;
        }

        .sub-menu4 li.on .icon-font {
            color: #fff;
        }

        .sub-menu4 .icon-font {
            font-size: 11px;
        }

        .icon-font-user {
            font-family: 'icomoon';
            speak: none;
            font-weight: 400;
            font-style: normal;
            font-variant: normal;
            text-transform: none;
            line-height: 1;
            -webkit-font-smoothing: antialiased;
        }
    </style>


    <style>
        .sidebar-list li .icon-font-message {
            margin-right: 5px;
            color: #888;
            font-size: 14px;
        }

        .sidebar-list li #a3 {
            padding: 0 16px 0 20px;
            display: block;
            height: 38px;
            line-height: 38px;
            color: #333;
        }

        .sidebar-list li #a3:hover {
            background: #fff;
            color: #286a46;
        }

        .sub-menu3 {
            border-top: 1px solid #e5e5e5;
            background: #fff;
        }

        .sub-menu3 {
            border-top: 1px solid #e5e5e5;
            background: #fff;
        }

        .sub-menu3 li {
            padding-left: 21px;
        }

        .sub-menu3 li.on {
            background: #1963AA;
        }

        .sub-menu3 li.on #a2 {
            background: #1963AA;
            color: #fff;
        }

        .sub-menu3 li.on .icon-font {
            color: #fff;
        }

        .sub-menu2 .icon-font {
            font-size: 11px;
        }

        .icon-font-message {
            font-family: 'icomoon';
            speak: none;
            font-weight: 400;
            font-style: normal;
            font-variant: normal;
            text-transform: none;
            line-height: 1;
            -webkit-font-smoothing: antialiased;
        }
    </style>
    <style>

        #formParticular .search-tab{

            margin-top: 10px;
        }
        .result-wrapParticular{
            margin-left:90px;

        }
        .result-wrapStart{
            margin-top: 70px;
            margin-left: 90px;
        }

        .result-wrapStartAdd{
            margin-top: 70px;
            margin-left:300px;
        }
        #fenye{
            margin-left: 550px;

        }

    </style>

</head>

<body>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>后台管理</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="javascript:void(0);"><i class="icon-font">&#xe003;</i>用户管理</a>
                    <ul class="sub-menu">
                        <li>
                            <a href="${pageContext.request.contextPath}/order/list?page=0"><i
                                    class="icon-font">&#xe008;</i>模糊查询</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/order/orderStat?page=1" id="a7"><i
                                    class="icon-font">&#xe005;</i>查询全部</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/order/orderStatWan?page=2"><i class="icon-font">&#xe006;</i> 用户状态更改 </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/order/orderStatTui?page=3"><i class="icon-font">&#xe008;</i>查看用户信息</a>
                        </li>


                    </ul>

                    <a href="javascript:void(0);" id="a1"><i class="icon-font-video">&#xe003;</i>房屋管理</a>
                    <ul class="sub-menu1">
                        <li>
                            <a href=""><i class="icon-font">&#xe008;</i>按条件查询房屋</a>
                        </li>
                        <li>
                            <a href=""><i class="icon-font">&#xe005;</i>查询房屋信息</a>
                        </li>
                        <li>
                            <a href=""><i class="icon-font">&#xe006;</i>根据房东查询房屋</a>
                        </li>

                    </ul>


                    <a href="javascript:void(0);" id="a2"><i class="icon-font-user">&#xe003;</i>订单管理</a>
                    <ul class="sub-menu2">
                        <li>
                            <a href="${pageContext.request.contextPath}/user/list?page1=0"><i class="icon-font">&#xe008;</i>根据用户查询订单列表</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/user/userNames?page1=1"><i class="icon-font">&#xe005;</i>根据订单号查询订单详细信息</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/user/userByAddress?page1=2"><i class="icon-font">&#xe006;</i>根据订单id查询订单信息</a>
                        </li>

                    </ul>


                    <a href="javascript:void(0);" id="a3"><i class="icon-font-message">&#xe003;</i>充值管理</a>
                    <ul class="sub-menu3">
                        <li>
                            <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticularByUserId=1"><i class="icon-font">&#xe008;</i>根据用户id查询充值记录列表</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/particular/selectById?pageParticularById=1"><i class="icon-font">&#xe005;</i>根据充值id查询充值记录信息</a>
                        </li>
                    </ul>


                    <a href="javascript:void(0);" id="a4"><i class="icon-font-message">&#xe003;</i>其他管理</a>
                    <ul class="sub-menu4">
                        <li>
                            <a href="${pageContext.request.contextPath}/start/addYe?pageStart=0"><i class="icon-font">&#xe008;</i>新增起租时间信息</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/start/selectAll?pageStart=1"><i class="icon-font">&#xe005;</i>查询起租时间信息</a>
                        </li>

                        <li>
                            <a href=""><i class="icon-font">&#xe005;</i>修改房屋详细信息</a>
                        </li>

                        <li>
                            <a href=""><i class="icon-font">&#xe005;</i>查询房屋详细信息</a>
                        </li>

                        <li>
                            <a href=""><i class="icon-font">&#xe005;</i>查询城市信息</a>
                        </li>

                        <li>
                            <a href=""><i class="icon-font">&#xe005;</i>新增城市信息</a>
                        </li>

                        <li>
                            <a href=""><i class="icon-font">&#xe005;</i>修改城市信息</a>
                        </li>

                        <li>
                            <a href=""><i class="icon-font">&#xe005;</i>删除城市信息</a>
                        </li>
                    </ul>

                </li>

            </ul>
        </div>
    </div>

    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i>
                <a href="javascript:void(0);" color="#white">首页</a><span class="crumb-step">&gt;</span><span
                        class="crumb-name">后台功能</span></div>
        </div>

        <c:if test="${pageParticularByUserId==1}">

            <form action="${pageContext.request.contextPath}/particular/selectByUserId?pageParticularByUserId=1&page=1&size=2"method="post" id="formParticular">

                <table class="search-tab">
                    <tr>
                        <th width="70">关键字:</th>
                        <td><input class="common-text" placeholder="请输入用户Id" name="userId"  id="text" type="text" value="${userId}"></td>

                        <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="chaxun">

                        </td>


                    </tr>

                </table>


                <br/>
                <div class="result-wrapParticular">

                    <table class="result-tab" width="100%">
                        <tr>

                            <th>充值编号</th>
                            <th>用户编号</th>
                            <th>用户姓名</th>
                            <th>用户可以资金</th>
                            <th>充值时间</th>
                            <th>状态</th>
                        </tr>
                        <c:forEach items="${particulars}" var="particulars">
                            <tr>
                                <td>${particulars.id}</td>
                                <td>${particulars.user.id}</td>
                                <td>${particulars.userName}</td>
                                <td>${particulars.money}</td>
                                <td><fmt:formatDate value="${particulars.refillTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                                <c:if test="${particulars.state==0}">
                                    <td>正常</td>
                                </c:if>
                                <c:if test="${particulars.state==1}">
                                    <td>删除</td>
                                </c:if>
                            </tr>
                        </c:forEach>
                    </table>

                </div>
            </form>

            <div id="fenye">

                <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticularByUserId=1&userId=${userId}&page=1&size=2">首页</a>
                <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticularByUserId=1&userId=${userId}&page=${pageInfo.pageNum-1}&size=2">上一页</a>
                <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                    <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticularByUserId=10&userId=${userId}&page=${pageNum}&size=2">${pageNum}</a>
                </c:forEach>
                <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticularByUserId=1&userId=${userId}&page=${pageInfo.pageNum+1}&size=2">下一页</a>
                <a  href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticularByUserId=1&userId=${userId}&page=${pageInfo.pages}&size=2" aria-label="Next"> 尾页</a>


            </div>


        </c:if>

        <c:if test="${pageParticularById==1}">

            <form action="${pageContext.request.contextPath}/particular/selectById?pageParticularById=1"method="post" id="formParticular">

                <table class="search-tab">
                    <tr>
                        <th width="70">关键字:</th>
                        <td><input class="common-text" placeholder="请输入Id" name="id"  id="text" type="text" value="${id}"></td>

                        <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="chaxun">

                        </td>

                    </tr>

                </table>


                <br/>
                <div class="result-wrapParticular">

                    <table class="result-tab" width="100%">
                        <tr>

                            <th>充值编号</th>
                            <th>用户编号</th>
                            <th>用户姓名</th>
                            <th>用户可以资金</th>
                            <th>充值时间</th>
                            <th>状态</th>
                        </tr>

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

                </div>
            </form>
        </c:if>

        <c:if test="${pageStart==1}">

            <div class="result-wrapStart">

                    <div class="result-content">

                        <table class="result-tab" width="100%">
                            <th>起租时间编号</th>
                            <th>起租时间</th>
                            <th>可计算起租时间</th>
                            <th>状态</th>
                            <th>操作</th>
                            <c:forEach items="${starts}" var="starts">

                                <tr>
                                    <td>${starts.id}</td>
                                    <td>${starts.startName}</td>
                                    <td>${starts.startValue}</td>
                                    <c:if test="${starts.state==0}">
                                        <td>正常</td>
                                    </c:if>
                                    <c:if test="${starts.state==1}">
                                        <td>删除</td>
                                    </c:if>
                                    <td><a href="${pageContext.request.contextPath}/start/delete?pageStart=1&id=${starts.id}">删除</a>&nbsp;
                                        <a href="${pageContext.request.contextPath}/start/updateYe?pageStart=2&id=${starts.id}">修改</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>

            </div>
            <br/>
            <div id="fenye">


                <a href="${pageContext.request.contextPath}/start/selectAll?pageStart=1&page=1&size=2">首页</a>
                <a href="${pageContext.request.contextPath}/start/selectAll?pageStart=1&page=${pageInfo.pageNum-1}&size=2">上一页</a>
                <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                    <a href="${pageContext.request.contextPath}/start/selectAll?pageStart=1&page=${pageNum}&size=2">${pageNum}</a>
                </c:forEach>
                <a href="${pageContext.request.contextPath}/start/selectAll?pageStart=1&page=${pageInfo.pageNum+1}&size=2">下一页</a>
                <a  href="${pageContext.request.contextPath}/start/selectAll?pageStart=1&page=${pageInfo.pages}&size=2" aria-label="Next"> 尾页</a>



            </div>

        </c:if>

        <c:if test="${pageStart==0}">

            <div class="result-wrapStartAdd">

                <div class="result-content">

                    <form method="post" action="${pageContext.request.contextPath}/start/add?pageStart=1" >

                        起租时间: &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="startName"/>   (必填项)

                        <br/>

                        <br/>
                        可计算起租时间:<input type="text" name="startValue"/>(必填项)
                        <br/>

                        <br/>
                        <input type="submit" value="添加">
                    </form>
                </div>

            </div>
        </c:if>

        <c:if test="${pageStart==2}">

            <div class="result-wrapStartAdd">

                <div class="result-content">

                    <form method="post" action="${pageContext.request.contextPath}/start/update?pageStart=1">
                        起租时间id:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="id" value="${start.id}" readonly="readonly"/>
                        <br/><br/>
                        起租时间: &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="startName" value="${start.startName}"/> <br/><br/>
                        可计算起租时间:&nbsp;<input type="text" name="startValue" value="${start.startValue}"/> <br/><br/>

                        <input type="submit" value="修改">
                    </form>
                </div>

            </div>
        </c:if>

    </div>

</div>
</body>

</html>