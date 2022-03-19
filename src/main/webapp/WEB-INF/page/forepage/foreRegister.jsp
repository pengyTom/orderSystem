<%--
  Created by IntelliJ IDEA.
  User: zhaoyingxin
  Date: 2021/11/19
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@ include file="../../foreinclude/foreHander.jsp" %>

<!--=============================================
= breadcrumb area =
=============================================-->

<div class="breadcrumb-area pt-15 pb-15">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <!--=======  breadcrumb container  =======-->

                <div class="breadcrumb-container">
                    <nav>
                        <ul>
                            <li class="parent-page"><a
                                    href="${pageContext.request.contextPath}/fore/foreIndexHome">Home</a></li>
                            <li>Register</li>
                        </ul>
                    </nav>
                </div>

                <!--=======  End of breadcrumb container  =======-->
            </div>
        </div>
    </div>
</div>

<!--===== End of breadcrumb area ======-->

<!--=============================================
= Login Register page content =
=============================================-->

<div class="page-section mb-50">
    <div class="container">

        <div class="row">
            <div class="col-sm-12 col-md-12 col-lg-3 col-xs-12"></div>
            <div class="col-sm-12 col-md-12 col-lg-6 col-xs-12">
                <form action="${pageContext.request.contextPath}/fore/foreRegister" method="post" class="loginForm">

                    <div class="login-form">
                        <h4 class="login-title">Register</h4>

                        <div class="row">
                            <div class="col-md-6 col-12 mb-20">
                                <label>账号</label>
                                <label for="name"></label><input class="mb-0" type="text" name="name" id="name"
                                                                 placeholder="账号为英文+数字组合形式">
                            </div>
                            <div class="col-md-6 col-12 mb-20">
                                <label>密码</label>
                                <label for="password"></label><input class="mb-0" type="text" name="password"
                                                                     id="password" placeholder="请输入密码">
                            </div>
                            <div class="col-md-12 mb-20">
                                <label>地址:</label>
                                <label for="address"></label><input class="mb-0" type="text" name="address" id="address"
                                                                    placeholder="电子邮箱">
                            </div>
                            <div class="col-md-6 mb-20">
                                <label>手机:</label>
                                <label for="phone"></label><input class="mb-0" type="password" name="phone" id="phone"
                                                                  placeholder="联系方式">
                            </div>

                            <div class="col-12">
                                <button type="submit" class="register-button mt-0">Register</button>
                            </div>
                        </div>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>

<!--===== 元素选择器，表单提交后触发验证 ======-->
<script src="${pageContext.request.contextPath}/js/jquery/2.0.0/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        //验证不能为空
        $("form.loginForm").submit(function () {
            if (0 === $("#name").val().length || 0 === $("#password").val().length || 0 === $("#address").val().length) {
                alert("信息填写完整后在进行注册");
                return false;
            }
            //1.验证手机号是否存在?存在提示用户已注册，请登录跳转登录页面   不存在注册成功
            return true;
        });
    })
</script>

<%@ include file="../../foreinclude/foreFooter.jsp" %>
