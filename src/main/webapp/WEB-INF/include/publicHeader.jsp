<%--
  Created by IntelliJ IDEA.
  User: zhaoyingxin
  Date: 2021/9/29
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!--_header 作为公共模版分离出去-->
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl">
            <a class="logo navbar-logo f-l mr-10 hidden-xs" href="${pageContext.request.contextPath}/fore/foreIndex"
               target="_blank">前台首页</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a class="logo navbar-logo f-l mr-10 hidden-xs"
               href="${pageContext.request.contextPath}/back/index">后台首页</a>

            <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:">&#xe667;</a>

            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li>
                        <c:if test="${subject.hasRole('admin')}">
                            <span style="color: #1b6d85;font-size: 15px">超级管理员</span>
                        </c:if>
                        <c:if test="${!subject.hasRole('admin')}">
                            <span style="color: #1a1a1a ;font-size: 15px">商家管理员</span>
                        </c:if>
                        <a href="javascript:" class="dropdown"
                           style="color: yellowgreen;font-size: 15px">${subject.principal}
                            <i class="Hui-iconfont">&#xe6d5;></i>
                        </a>
                        <a href="${pageContext.request.contextPath}/back/isLogout" style="color: saddlebrown">退出
                        </a>
                    </li>
                    <li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:" class="dropDown_A"
                                                                               title="换肤"><i class="Hui-iconfont"
                                                                                             class="c-green"
                                                                                             style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:" data-val="orange" title="橙色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<!--/_header 作为公共模版分离出去-->
