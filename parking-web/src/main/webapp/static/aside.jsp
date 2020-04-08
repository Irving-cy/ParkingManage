<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security"%>

<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>
<%--					xxx--%>
					<security:authentication property="principal.username" />
				</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>系统管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<li id="user-setting"><a
						href="${pageContext.request.contextPath}/user/findAll?page=1&pageSize=${pageInfo.pageSize}"> <i
							class="fa fa-circle-o"></i> 用户管理
					</a></li>
					<li id="role-setting"><a
						href="${pageContext.request.contextPath}/fee/findAll"> <i
							class="fa fa-circle-o"></i> 费率设置
					</a></li>
				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>基础数据</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="product-setting"><a
						href="${pageContext.request.contextPath}/rukou/findAll?page=1&pageSize=${pageInfo.pageSize}">
							<i class="fa fa-circle-o"></i> 入口管理
					</a></li>
					<li id="order-setting"><a
						href="${pageContext.request.contextPath}/chukou/findAll?page=1&pageSize=${pageInfo.pageSize}"> <i
							class="fa fa-circle-o"></i> 出口管理
					</a></li>
					<li id="Ticket-setting"><a
							href="${pageContext.request.contextPath}/monthlyTicket/findAll?page=1&pageSize=${pageInfo.pageSize}">
						<i class="fa fa-circle-o"></i> 月票管理
					</a></li>
					<li id="dailyIncome-setting"><a
							href="${pageContext.request.contextPath}/dailyIncome/findAll?page=1&pageSize=${pageInfo.pageSize}">
						<i class="fa fa-circle-o"></i> 收入统计
					</a></li>

				</ul></li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>