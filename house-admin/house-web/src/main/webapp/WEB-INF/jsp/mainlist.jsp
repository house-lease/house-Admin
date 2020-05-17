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

        #form .search-tab {

            margin-top: 10px;
        }

        .result-wrapParticular {
            margin-left: 90px;

        }

        .result-wrapAddress {
            margin-left: 90px;
        }

        .result-wrapStart {
            margin-top: 70px;
            margin-left: 90px;
        }

        .result-wrapStartAdd {
            margin-top: 70px;
            margin-left: 300px;
        }

        .result-wrapHouseCarfulInfo {
            margin-top: 70px;
            margin-left: 600px;
        }

        #fenye {
            margin-left: 550px;

        }

        .result-wrapUser {
            margin-left: 90px;
        }

        .result-wrapUserInfo {
            margin-top: 50px;
            margin-left: 600px;
        }


        .result-wrapHouse {
            margin-top: 50px;
            margin-left: 600px;
        }

        .result-wrapHouseCareful {
            margin-top: 50px;
            margin-left: 600px;
        }

        .result-wrapHouseCarefulAll {
            margin-left: 90px;
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
                            <a href="${pageContext.request.contextPath}/user/selectByUser?pageUser=1" id="a7"><i
                                    class="icon-font">&#xe005;</i>查询用户信息</a>
                        </li>


                    </ul>

                    <a href="javascript:void(0);" id="a1"><i class="icon-font-video">&#xe003;</i>房屋管理</a>
                    <ul class="sub-menu1">
                        <li>
                            <a href="${pageContext.request.contextPath}/house/queryByPage?pageHouse=1"><i
                                    class="icon-font">&#xe008;</i>查询房屋信息</a>
                        </li>
                    </ul>


                    <a href="javascript:void(0);" id="a2"><i class="icon-font-user">&#xe003;</i>订单管理</a>
                    <ul class="sub-menu2">
                        <li>
                            <a href="${pageContext.request.contextPath}/record/getRecordList/?pageRecordList=1"><i
                                    class="icon-font">&#xe008;</i>查询订单</a>
                        </li>


                    </ul>


                    <a href="javascript:void(0);" id="a3"><i class="icon-font-message">&#xe003;</i>充值管理</a>
                    <ul class="sub-menu3">
                        <li>
                            <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticular=1"><i
                                    class="icon-font">&#xe008;</i>查询充值记录列表</a>
                        </li>

                    </ul>


                    <a href="javascript:void(0);" id="a4"><i class="icon-font-message">&#xe003;</i>其他管理</a>
                    <ul class="sub-menu4">
                        <li>
                            <a href="${pageContext.request.contextPath}/start/addYe?pageStart=0"><i class="icon-font">&#xe008;</i>新增起租时间信息</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/start/selectAll?pageStart=1"><i
                                    class="icon-font">&#xe005;</i>查询起租时间信息</a>
                        </li>


                        <li>
                            <a href="${pageContext.request.contextPath}/house/queryHouseCarefulById?pageCareful=1"><i
                                    class="icon-font">&#xe005;</i>查询房屋详细信息</a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/address/selectAll?pageAddress=1"><i
                                    class="icon-font">&#xe005;</i>查询城市信息</a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/address/insert?pageAddress=2"><i
                                    class="icon-font">&#xe005;</i>新增城市信息</a>
                        </li>


                    </ul>

                </li>

            </ul>
        </div>
    </div>

    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i>
                <a href="javascript:void(0);" color="#white">首页</a><span class="crumb-step">&gt</span><span
                        class="crumb-name">后台功能</span></div>
        </div>

        <c:if test="${pageParticular==1}">

            <form action="${pageContext.request.contextPath}/particular/selectByUserId?pageParticular=1&page=1&size=2"
                  method="post" id="form">

                <table class="search-tab">
                    <tr>
                        <th width="70">关键字:</th>
                        <td><input class="common-text" placeholder="请输入phone" name="phone" id="text" type="text"
                                   value="${phone}"></td>
                        </td>
                        <th width="70">关键字:</th>
                        <td><input class="common-text" placeholder="请输入id" name="id" id="text" type="text"
                                   value="${id}"></td>

                        <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="chaxun"></td>
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
                                <td><fmt:formatDate value="${particulars.refillTime}"
                                                    pattern="yyyy-MM-dd hh:mm:ss"/></td>
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
            <c:if test="${id==null || id==''}">
                <div id="fenye">

                    <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticular=1&phone=${phone}&page=1&size=2">首页</a>
                    <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticular=1&phone=${phone}&page=${pageInfo.pageNum-1}&size=2">上一页</a>
                    <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                        <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticular=10&phone=${phone}&page=${pageNum}&size=2">${pageNum}</a>
                    </c:forEach>
                    <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticular=1&phone=${phone}&page=${pageInfo.pageNum+1}&size=2">下一页</a>
                    <a href="${pageContext.request.contextPath}/particular/selectByUserId?pageParticular=1&phone=${phone}&page=${pageInfo.pages}&size=2"
                       aria-label="Next"> 尾页</a>


                </div>
            </c:if>

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
                                <td>
                                    <a href="${pageContext.request.contextPath}/start/delete?pageStart=1&id=${starts.id}">删除</a>&nbsp;
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
                <a href="${pageContext.request.contextPath}/start/selectAll?pageStart=1&page=${pageInfo.pages}&size=2"
                   aria-label="Next"> 尾页</a>


            </div>

        </c:if>

        <c:if test="${pageStart==0}">

            <div class="result-wrapStartAdd">

                <div class="result-content">

                    <form method="post" action="${pageContext.request.contextPath}/start/add?pageStart=1">

                        起租时间: &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="startName"/>
                        (必填项)

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
                        起租时间id:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="id"
                                                                                 value="${start.id}"
                                                                                 readonly="readonly"/>
                        <br/><br/>
                        起租时间: &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="startName"
                                                                                            value="${start.startName}"/>
                        <br/><br/>
                        可计算起租时间:&nbsp;<input type="text" name="startValue" value="${start.startValue}"/> <br/><br/>

                        <input type="submit" value="修改">
                    </form>
                </div>

            </div>
        </c:if>

        <c:if test="${pageUser==1}">

            <form action="${pageContext.request.contextPath}/user/selectByUser?pageUser=1" method="post"
                  id="form">

                <table class="search-tab">
                    <tr>
                        <th width="70">关键字:</th>
                        <td><input class="common-text" placeholder="请输入用户名称" name="username" id="username" type="text"
                                   value="${username}"></td>
                        <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="query">
                        </td>
                    </tr>
                </table>


                <br/>

                <div class="result-wrapUser">
                    <table class="result-tab" width="100%">
                        <tr>
                            <th>用户编号</th>
                            <th>用户昵称</th>
                            <th>用户性别</th>
                            <th>用户名</th>
                            <th>身份证号</th>
                            <th>手机号</th>
                            <th>房东认证</th>
                            <th>注册时间</th>
                            <!--<th>头像路径</th>-->
                            <th>用户的唯一标识</th>
                            <th>用户状态</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach items="${userList}" var="user">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.nickname}</td>
                                <c:if test="${user.sex==0}">
                                    <td>男</td>
                                </c:if>
                                <c:if test="${user.sex==1}">
                                    <td>女</td>
                                </c:if>
                                <td style="color: red">${user.userName}</td>
                                <td>${user.idcard}</td>
                                <td>${user.phone}</td>
                                <!-- 房东认证 0代表普通用户 1代表房东-->
                                <c:if test="${user.landlord==0}">
                                    <td>普通用户</td>
                                </c:if>
                                <c:if test="${user.landlord==1}">
                                    <td>房东</td>
                                </c:if>

                                <td><fmt:formatDate value="${user.registerTime}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                                <!-- 头像路径-->
                                <!--<td style="text-overflow : clip; ">${user.imageUrl}</td>-->
                                <td>${user.openId}</td>
                                <c:if test="${user.state==0}">
                                    <td>正常</td>
                                </c:if>
                                <c:if test="${user.state==1}">
                                    <td>失效</td>
                                </c:if>
                                <td>
                                    <a href="${pageContext.request.contextPath}/user/selectByUserMessage?pageUser=2&id=${user.id}">查看</a>
                                    &nbsp;
                                    <a href="${pageContext.request.contextPath}/user/updateByState?pageUser=1&id=${user.id}">修改</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>

                </div>

            </form>
            <c:if test="${username=='' || username==null}">
                <div id="fenye">

                    <a href="${pageContext.request.contextPath}/user/selectByUser?pageUser=1&username=${username}&page=1&size=2">首页</a>
                    <a href="${pageContext.request.contextPath}/user/selectByUser?pageUser=1&username=${username}&page=${pageInfo.pageNum-1}&size=2">上一页</a>
                    <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                        <a href="${pageContext.request.contextPath}/user/selectByUser?pageUser=1&username=${username}&page=${pageNum}&size=2">${pageNum}</a>
                    </c:forEach>
                    <a href="${pageContext.request.contextPath}/user/selectByUser?pageUser=1&username=${username}&page=${pageInfo.pageNum+1}&size=2">下一页</a>
                    <a href="${pageContext.request.contextPath}/user/selectByUser?pageUser=1&username=${username}&page=${pageInfo.pages}&size=2"
                       aria-label="Next"> 尾页</a>


                </div>
            </c:if>

        </c:if>

        <c:if test="${pageUser==2}">

        <div class="result-wrapUserInfo">

            <div class="result-content">


                <c:forEach items="${users}" var="user">
                    用户编号:&nbsp;${user.id}
                    <br/><br/>
                    用户昵称:&nbsp;${user.nickname}
                    <br/><br/>
                    用户性别:&nbsp;
                    <c:if test="${user.sex==0}">
                        男
                    </c:if>
                    <c:if test="${user.sex==1}">
                        女
                    </c:if> <br/><br/>
                    用户名:&nbsp;${user.userName} <br/><br/>
                    身份证:&nbsp;${user.idcard} <br/><br/>
                    手机号:&nbsp;${user.phone} <br/><br/>
                    房东认证:&nbsp;
                    <!-- 房东认证 0代表普通用户 1代表房东-->
                    <c:if test="${user.landlord==0}">
                        普通用户
                    </c:if>
                    <c:if test="${user.landlord==1}">
                        房东
                    </c:if> <br/><br/>
                    注册时间:&nbsp;<fmt:formatDate value="${user.registerTime}" pattern="yyyy-MM-dd hh:mm:ss"/>
                    <br/><br/>

                    用户的唯一标识:&nbsp;${user.openId} <br/><br/>

                    用户状态:&nbsp;
                    <c:if test="${user.state==0}">
                        正常
                    </c:if>
                    <c:if test="${user.state==1}">
                        失效
                    </c:if>

                </c:forEach>

            </div>

            </c:if>

        <c:if test="${pageCareful==3}">

                <div class="result-wrapHouseCarfulInfo">

                    <div class="result-content">

                        <form method="post" action="${pageContext.request.contextPath}/house/modifyById?pageCareful=1">
                            <input type="hidden" readonly value="${houseCareful.id}" name="id"/>
                            房屋id:
                            <input type="text" name="houseId" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.houseId}" readonly>
                            <br/> <br/>

                            床:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="text" name="chuang" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.chuang}">
                            (0代表有 1代表没有)<br/> <br/>
                            沙发:&nbsp;&nbsp;&nbsp;
                            <input type="text" name="shafa" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.shafa}"><br/> <br/>

                            空调:&nbsp;&nbsp;&nbsp;
                            <input type="text" name="kongtiao" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.kongtiao}"><br/> <br/>
                            燃气:&nbsp;&nbsp;&nbsp;
                            <input type="text" name="ranqi" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.ranqi}"><br/> <br/>
                            洗衣机:
                            <input type="text" name="xiyiji" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.xiyiji}"><br/> <br/>
                            宽带:&nbsp;&nbsp;&nbsp;
                            <input type="text" name="kuandai" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.kuandai}"><br/> <br/>
                            电视:&nbsp;&nbsp;&nbsp;
                            <input type="text" name="dianshi" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.dianshi}"><br/> <br/>
                            冰箱:&nbsp;&nbsp;&nbsp;
                            <input type="text" name="bingxiang" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off"
                                   class="layui-input" value="${houseCareful.bingxiang}"><br/> <br/>

                            <input type="submit" value="修改">
                        </form>
                    </div>

                </div>
            </c:if>

        <c:if test="${pageCareful==2}">

            <div class="result-wrapHouseCareful">

                <div class="result-content">

                    房屋名字:${house.houseName}<br/><br/>
                    房东名字: ${house.userName}<br/><br/>
                    起租月数: ${house.startName}<br/><br/>
                    月价格:${house.price}<br/><br/>
                    房屋描述: ${house.narrate}<br/><br/>
                    小区: ${house.uptown}<br/><br/>
                    城市: ${house.address}<br/><br/>
                    类型名字:${house.houseTypeName}<br/><br/>
                    租赁类型名字:${house.houseLeaseName}<br/><br/>
                    剩余房间: ${house.residueRoom}<br/><br/>
                    状态:
                    <c:if test="${house.state == 1}">满租</c:if>
                    <c:if test="${house.state == 0}">可租</c:if>

                </div>

                </c:if>

        <c:if test="${pageCareful==1}">

                    <form action="${pageContext.request.contextPath}/house/queryHouseCarefulById?pageCareful=1"
                          method="post" id="form">

                        <table class="search-tab">
                            <tr>
                                <th width="70">关键字:</th>
                                <td><input class="common-text" placeholder="请输入房屋id" name="houseId" id="text"
                                           type="text"
                                ></td>

                                <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="chaxun">

                                </td>


                            </tr>

                        </table>


                        <br/>
                        <div class="result-wrapHouseCarefulAll">

                            <table class="result-tab" width="100%">
                                <tr>
                                    <td>id</td>
                                    <td>房屋id</td>
                                    <td>床</td>
                                    <td>沙发</td>
                                    <td>空调</td>
                                    <td>燃气</td>
                                    <td>洗衣机</td>
                                    <td>宽带</td>
                                    <td>电视</td>
                                    <td>电冰箱</td>
                                    <td>操作</td>
                                </tr>
                                <c:forEach items="${houseCarefuls}" var="item">
                                    <td>${item.id}</td>
                                    <td>
                                            ${item.houseId}
                                    </td>
                                    <td>
                                        <c:if test="${item.chuang == 0}">有</c:if>
                                        <c:if test="${item.chuang == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <c:if test="${item.shafa == 0}">有</c:if>
                                        <c:if test="${item.shafa == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <c:if test="${item.kongtiao == 0}">有</c:if>
                                        <c:if test="${item.kongtiao == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <c:if test="${item.ranqi == 0}">有</c:if>
                                        <c:if test="${item.ranqi == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <c:if test="${item.xiyiji == 0}">有</c:if>
                                        <c:if test="${item.xiyiji == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <c:if test="${item.kuandai == 0}">有</c:if>
                                        <c:if test="${item.kuandai == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <c:if test="${item.dianshi == 0}">有</c:if>
                                        <c:if test="${item.dianshi == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <c:if test="${item.bingxiang == 0}">有</c:if>
                                        <c:if test="${item.bingxiang == 1}">没有</c:if>
                                    </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/house/selectHouseCarefulById?pageCareful=3&id=${item.houseId}">修改</a>
                                        &nbsp;<a
                                            href="${pageContext.request.contextPath}/house/queryByHouseId?pageCareful=2&houseId=${item.houseId}">查看</a>
                                    </td>
                                </c:forEach>
                            </table>

                        </div>
                    </form>

                </c:if>

        <c:if test="${pageRecordList==1}">

                    <form action="${pageContext.request.contextPath}/record/getRecordList?pageRecordList=1"
                          method="post" id="form">

                        <table class="search-tab">
                            <tr>
                                <th width="70">关键字:</th>
                                <td><input class="common-text" placeholder="订单号" id="record" name="record" id="text"
                                           type="text"
                                ></td>

                                <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="chaxun">

                                </td>


                            </tr>

                            <tr>
                                <th width="70">关键字:</th>
                                <td><input class="common-text" placeholder="手机号" name="phone" id="userId" id="text"
                                           type="text"
                                ></td>

                                <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="chaxun">

                                </td>


                            </tr>

                        </table>


                        <br/>
                        <div class="result-wrapParticular">

                            <table class="result-tab" width="100%">
                                <tr>
                                    <td>订单id</td>
                                    <td>订单号</td>
                                    <td>付款人id</td>
                                    <td>付款人姓名</td>
                                    <td>收款人id</td>
                                    <td>收款人姓名</td>
                                    <td>房屋id</td>
                                    <td>房屋名字</td>
                                    <td>交易时间</td>
                                    <td>交易金额</td>
                                    <td>交易状态</td>
                                    <td>订单状态</td>
                                </tr>
                                <c:forEach items="${recordPageInfo.list}" var="item">
                                    <tr>
                                        <td>${item.id}</td>
                                        <td>${item.record}</td>
                                        <td>${item.payerUser.id}</td>
                                        <td>${item.payerName}</td>
                                        <td>${item.payeeUser.id}</td>
                                        <td>${item.payeeName}</td>
                                        <td>${item.house.id}</td>
                                        <td>${item.houseName}</td>
                                        <td><fmt:formatDate value="${item.dealTime}"
                                                            pattern="yyyy-MM-dd hh:mm:ss"/></td>
                                        <td>${item.dealMoney}</td>
                                        <td>${item.dealState}</td>
                                        <td>${item.state}</td>
                                    </tr>
                                </c:forEach>
                            </table>

                        </div>
                    </form>
                    <c:if test="${record==''||record==null}">
                        <div id="fenye">

                            <a href="${pageContext.request.contextPath}/record/getRecordList/?pageRecordList=1&userId=${userId}&pageCode=${recordPageInfo.navigateFirstPage}">首页</a>
                            <a href="${pageContext.request.contextPath}/record/getRecordList/?pageRecordList=1&userId=${userId}&pageCode=${recordPageInfo.prePage}">上一页</a>
                            <c:forEach var="i" begin="1" end="${recordPageInfo.pages}">
                                <a href="${pageContext.request.contextPath}/record/getRecordList/?pageRecordList=1&userId=${userId}&pageCode=${i}">${i}</a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/record/getRecordList/?pageRecordList=1&userId=${userId}&pageCode=${recordPageInfo.nextPage}">下一页</a>
                            <a href="${pageContext.request.contextPath}/record/getRecordList/?pageRecordList=1&userId=${userId}&pageCode=${recordPageInfo.navigateLastPage}">尾页</a>

                        </div>
                    </c:if>


                </c:if>

        <c:if test="${pageHouse==1}">

                    <form action="${pageContext.request.contextPath}/house/queryByPage?pageHouse=1"
                          method="post" id="form">

                        <table class="search-tab">
                            <tr>
                                <th width="70">房屋名称:</th>
                                <td><input class="common-text" placeholder="请输入房屋名称" name="houseName" id="houseName"
                                           type="text" value="${houseName}"/></td>
                                <th width="70">房屋编号:</th>
                                <td><input class="common-text" placeholder="请输入房屋编号" name="id" id="第" type="text"
                                           value="${id}"/></td>
                                <th width="70">房东姓名:</th>
                                <td><input class="common-text" placeholder="请输入房东姓名" name="userName" id="userName"
                                           type="text" value="${userName}"/></td>
                                <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit" id="query">
                                </td>
                            </tr>

                        </table>


                        <br/>
                        <div class="result-wrapParticular">

                            <table class="result-tab" width="100%">
                                <tr>
                                    <th>房屋编号</th>
                                    <th style="color: #0e9aef">房东姓名</th>
                                    <th>起租时间</th>
                                    <th>起租实际类型</th>
                                    <th>月价格</th>
                                    <th>房屋描述</th>
                                    <th>房屋名字</th>
                                    <th>小区</th>
                                    <th>城市</th>
                                    <th>房屋类型名字</th>
                                    <th>房屋租赁类型名字</th>
                                    <th>剩余房间</th>
                                    <th>房屋状态</th>
                                    <th>操作</th>
                                </tr>
                                <c:forEach items="${housesList}" var="house">
                                    <tr>
                                        <td>${house.id}</td>
                                        <!--- 房东姓名-->
                                        <td>
                                                ${house.userName}
                                        </td>
                                        <!-- 起租时间-->
                                        <td>${house.startName}</td>
                                        <td>${house.startValue}</td>
                                        <td>${house.price}</td>
                                        <td>${house.narrate}</td>
                                        <td style="color:red;">${house.houseName}</td>
                                        <td>${house.uptown}</td>
                                        <td>${house.address}</td>
                                        <!-- 房屋类型对象-->
                                        <td>${house.houseTypeName}</td>
                                        <!-- 房屋租赁类型-->
                                        <td>${house.houseLeaseName}</td>

                                        <td>${house.residueRoom}</td>
                                        <!-- 房屋状态 0可租 1满租-->
                                        <c:if test="${house.state==0}">
                                            <td>可租</td>
                                        </c:if>
                                        <c:if test="${house.state==1}">
                                            <td>满租</td>
                                        </c:if>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/house/selectHouseCareful?pageHouse=2&houseId=${house.id}">查看</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>

                        </div>
                    </form>
                    <c:if test="${houseName ==null ||houseName=='' && id==null || id==''}">
                        <div id="fenye">
                            <a href="${pageContext.request.contextPath}/house/queryByPage?pageHouse=1&userName=${userName}&page=1&size=2">首页</a>
                            <a href="${pageContext.request.contextPath}/house/queryByPage?pageHouse=1&userName=${userName}&page=${pageInfo.pageNum-1}&size=2">上一页</a>
                            <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                                <a href="${pageContext.request.contextPath}/house/queryByPage?pageHouse=1&userName=${userName}&page=${pageNum}&size=2">${pageNum}</a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/house/queryByPage?pageHouse=1&userName=${userName}&page=${pageInfo.pageNum+1}&size=2">下一页</a>
                            <a href="${pageContext.request.contextPath}/house/queryByPage?pageHouse=1&userName=${userName}&page=${pageInfo.pages}&size=2"
                               aria-label="Next"> 尾页</a>
                        </div>
                    </c:if>


                </c:if>

        <c:if test="${pageHouse==2}">

                    <div class="result-wrapHouse">

                        <div class="result-content">
                            房屋详情编号:${houseCareful.id}<br/><br/>
                            房屋编号:${houseCareful.houseId}<br/><br/>
                            床:
                            <c:if test="${houseCareful.chuang == 0}">有</c:if>
                            <c:if test="${houseCareful.chuang == 1}">没有</c:if><br/><br/>

                            沙发:
                            <c:if test="${houseCareful.shafa == 0}">有</c:if>
                            <c:if test="${houseCareful.shafa == 1}">没有</c:if><br/><br/>
                            空调:
                            <c:if test="${houseCareful.kongtiao == 0}">有</c:if>
                            <c:if test="${houseCareful.kongtiao == 1}">没有</c:if><br/><br/>
                            燃气:
                            <c:if test="${houseCareful.ranqi == 0}">有</c:if>
                            <c:if test="${houseCareful.ranqi == 1}">没有</c:if><br/><br/>
                            洗衣机:
                            <c:if test="${houseCareful.xiyiji == 0}">有</c:if>
                            <c:if test="${houseCareful.xiyiji == 1}">没有</c:if><br/><br/>
                            宽带:
                            <c:if test="${houseCareful.kuandai == 0}">有</c:if>
                            <c:if test="${houseCareful.kuandai == 1}">没有</c:if><br/><br/>
                            电视:
                            <c:if test="${houseCareful.dianshi == 0}">有</c:if>
                            <c:if test="${houseCareful.dianshi == 1}">没有</c:if><br/><br/>
                            冰箱:
                            <c:if test="${houseCareful.bingxiang == 0}">有</c:if>
                            <c:if test="${houseCareful.bingxiang == 1}">没有</c:if>
                        </div>

                    </div>
                </c:if>

        <c:if test="${pageAddress==1}">

                    <form action="${pageContext.request.contextPath}/address/selectAll?pageAddress=1"
                          method="post" id="form">

                        <table class="search-tab">
                            <tr>
                                <th width="70">城市名:</th>
                                <td><input class="common-text" placeholder="请输入城市名" name="address" id="address"
                                           type="text" value="${houseName}"/></td>
                                <td><input name="sub" value="查询" type="submit" id="query"></td>

                            </tr>

                        </table>


                        <br/>
                        <div class="result-wrapAddress">

                            <table class="result-tab" width="100%">
                                <tr>
                                    <th>城市编号</th>
                                    <th>城市名</th>
                                    <th>父级编号</th>
                                    <th>城市的状态</th>
                                    <th>操作</th>
                                </tr>
                                <c:forEach items="${addressList}" var="address">
                                    <tr>
                                        <td>${address.id}</td>
                                        <td>${address.address}</td>
                                        <td>${address.parentId}</td>
                                        <c:if test="${address.state == 0}">
                                            <td>正常</td>
                                        </c:if>
                                        <c:if test="${address.state == 1}">
                                            <td>删除</td>
                                        </c:if>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/address/selectById?pageAddress=3&id=${address.id}">修改</a>
                                            <a href="${pageContext.request.contextPath}/address/deleteByState?pageAddress=1&id=${address.id}">删除</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>

                        </div>
                    </form>

                    <c:if test="${address==null||address==''}">
                        <div id="fenye">


                            <a href="${pageContext.request.contextPath}/address/selectAll?pageAddress=1&page=1&size=2">首页</a>
                            <a href="${pageContext.request.contextPath}/address/selectAll?pageAddress=1&page=${pageInfo.pageNum-1}&size=2">上一页</a>
                            <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                                <a href="${pageContext.request.contextPath}/address/selectAll?pageAddress=1&page=${pageNum}&size=2">${pageNum}</a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/address/selectAll?pageAddress=1&page=${pageInfo.pageNum+1}&size=2">下一页</a>
                            <a href="${pageContext.request.contextPath}/address/selectAll?pageAddress=1&page=${pageInfo.pages}&size=2"
                               aria-label="Next"> 尾页</a>


                        </div>
                    </c:if>


                </c:if>

        <c:if test="${pageAddress==2}">

                    <div class="result-wrapStartAdd">

                        <div class="result-content">

                            <form method="post"
                                  action="${pageContext.request.contextPath}/address/insertAddress?pageAddress=1">
                                城市名:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address"><br/><br/>
                                父级编号:<input type="text" name="parentId"><br/><br/>

                                <br>
                                <input type="submit" name="sub" value="添加">
                            </form>
                        </div>

                    </div>
                </c:if>

        <c:if test="${pageAddress==3}">

                    <div class="result-wrapStartAdd">

                        <div class="result-content">

                            <form method="post"
                                  action="${pageContext.request.contextPath}/address/updateByDelete?pageAddress=1">
                                城市编号:<input type="text" value="${address.id}" name="id" readonly="readonly"/> <br/><br/>
                                城市名:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" value="${address.address}"
                                                                   name="address"> <br/><br/>
                                父级编号:<input type="text" value="${address.parentId}" name="parentId"> <br/><br/>
                                <input type="submit" value="修改" id="sub"/>
                            </form>
                        </div>

                    </div>
                </c:if>

            </div>

        </div>
    </div>

</div>
</body>
<script>
    const record = document.getElementById("record");
    const userID = document.getElementById("userId");
    const form = document.querySelector("form");
    form.onsubmit = (event) => {
        if (record.value === '' || userID.value === '') {
            return true;
        }
        alert("订单号和用户名不能同时使用");
        return false;
    }
</script>
</html>