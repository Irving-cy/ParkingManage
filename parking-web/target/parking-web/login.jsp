<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>数据 - AdminLTE2定制版 | Log in</title>

<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">

<link rel="stylesheet"
	href="${path}/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${path}/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${path}/plugins/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="${path}/plugins/adminLTE/css/AdminLTE.css">
<link rel="stylesheet"
	href="${path}/plugins/iCheck/square/blue.css">
<script type="text/javascript" src="${path}/plugins/jQuery/jquery-2.2.3.min.js"></script>

<script type="text/javascript">
		// 随机展示背景图片
		var imgs = [ "${path}/img/background1.jpg",
						"${path}/img/background2.jpg",
						"${path}/img/background3.jpg",
						"${path}/img/background4.jpg",
						"${path}/img/background5.jpg",
						"${path}/img/background6.jpg",
						"${path}/img/background7.jpg",
						"${path}/img/background8.jpg",
						"${path}/img/background9.jpg",
						"${path}/img/background10.jpg",
						"${path}/img/background11.jpg",
						"${path}/img/background12.jpg",
						"${path}/img/background13.jpg",
						"${path}/img/background14.jpg",
						"${path}/img/background15.jpg",
						"${path}/img/background16.jpg",
		  			  ];
		var random = parseInt(Math.random() * (imgs.length));

		$(function() {
					$("body").css("background-image","url(" + imgs[random] + ")");
				});
</script>

</head>

<body class="hold-transition login-page" id="body" >
	<div class="login-box">
		<div class="login-logo">
			<a href="all-admin-index.html"><b>停车管理系统</b></a>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">
			<p class="login-box-msg" style="color: black;font-size: 20px">登录系统</p>

			<form action="${path}/login" method="post">
				<div class="form-group has-feedback">
					<input type="text" name="username" class="form-control"
						placeholder="用户名"> <span
						class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="password" name="password" class="form-control"
						placeholder="密码"> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox icheck">
							<label><input type="checkbox"> 记住 下次自动登录</label>
						</div>
					</div>
					<!-- /.col -->
					<div class="col-xs-4">
						<button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
					</div>
					<!-- /.col -->
				</div>
			</form>

			<a href="#">忘记密码</a><br>


		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->

	<!-- jQuery 2.2.3 -->
	<!-- Bootstrap 3.3.6 -->
	<!-- iCheck -->
	<script
		src="${path}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script
		src="${path}/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${path}/plugins/iCheck/icheck.min.js"></script>
	<script>
		$(function() {
			$('input').iCheck({
				checkboxClass : 'icheckbox_square-blue',
				radioClass : 'iradio_square-blue',
				increaseArea : '20%' // optional
			});
		});
	</script>
</body>

</html>