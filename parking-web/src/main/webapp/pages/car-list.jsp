<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">




    <title>月票管理</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">




    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

    <link rel="stylesheet"
          href="${path}/../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${path}/../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${path}/../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${path}/../plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${path}/../plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${path}/../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${path}/../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${path}/../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${path}/../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${path}/../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${path}/../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${path}/../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${path}/../plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${path}/../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${path}/../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${path}/../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${path}/../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${path}/../css/style.css">
    <link rel="stylesheet"
          href="${path}/../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${path}/../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${path}/../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet"
          href="${path}/../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="/static/header.jsp"></jsp:include>
    <!-- 页面头部 /-->
    <!-- 导航侧栏 -->
    <jsp:include page="/static/aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <!-- @@master = admin-layout.html-->
    <!-- @@block = content -->

    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                月票管理 <small>月票数据</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="#">月票管理</a></li>
                <li class="active">月票数据</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">

            <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">列表</h3>
                </div>

                <div class="box-body">

                    <!-- 数据表格 -->
                    <div class="table-box">

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">
<%--                                    <button type="button" class="btn btn-default" title="新建" onclick="location.href='${pageContext.request.contextPath}/user/add'">--%>
<%--                                        <i class="fa fa-file-o"></i> 新建--%>
<%--                                    </button>--%>
                                    <button type="button" class="btn btn-default" title="刷新" onclick="location.href='${pageContext.request.contextPath}/monthlyTicket/findAll'">
                                        <i class="fa fa-refresh"></i> 刷新
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div class="box-tools pull-right">
                            <div class="has-feedback">
                                <form action="${pageContext.request.contextPath}/monthlyTicket/findAll?page=1&pageSize=${pageInfo.pageSize}" method="post">
                                    <div style="width:540px; height:30px;float:right">
                                        <input type="text" class="form-control input-sm" name="carNum" value="" id="carNum" placeholder="车牌号" style="width:235px;height:30px;float:left">
                                        <input type="text" class="form-control input-sm" name="ownerName" value="" id="ownerName" placeholder="车主姓名" style="width:235px;height:30px;float:left">
                                        <button type="submit" class="btn btn-default" value="" style="width:60px;height:30px;">
                                            搜索
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <!--工具栏/-->

<%--                        <!--工具栏-->--%>
<%--                        <div class="pull-left">--%>
<%--                            <form method="post" action="${path}/monthlyTicket/findAll?page=1&pageSize=${pageInfo.pageSize}">--%>
<%--                                <div class="has-feedback">--%>
<%--                                    <input type="text" name="carNum" class="form-control input-sm" placeholder="车牌号">&emsp;--%>
<%--                                    <input type="text" name="ownerName" class="form-control input-sm" placeholder="车主姓名">&emsp;--%>
<%--                                    <b><input type="submit" style="color: green;font-size: 15px;text-align: center" class="form-control input-sm" value="查    询"></b>&emsp;--%>
<%--                                </div>--%>

<%--                            </form>--%>

<%--                        </div>--%>
<%--                        <div class="box-tools pull-right">--%>
<%--&lt;%&ndash;                            <div class="has-feedback">&ndash;%&gt;--%>
<%--&lt;%&ndash;                                <input type="text" class="form-control input-sm"&ndash;%&gt;--%>
<%--&lt;%&ndash;                                       placeholder="车主姓名"> <span&ndash;%&gt;--%>
<%--&lt;%&ndash;                                    class="glyphicon glyphicon-search form-control-feedback"></span>&ndash;%&gt;--%>
<%--&lt;%&ndash;                            </div>&ndash;%&gt;--%>
<%--                        </div>--%>
<%--                        <!--工具栏/-->--%>

                        <!--数据列表-->
                        <table id="dataList"
                               class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right: 0px;"><input
                                        id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th>车牌号</th>
                                <th>车主姓名</th>
                                <th>到期日期</th>
<%--                                <th class="sorting_desc sorting_desc_disabled">出发城市</th>--%>
<%--                                <th class="sorting">出发时间</th>--%>
<%--                                <th class="text-center sorting">产品价格</th>--%>
<%--                                <th class="sorting">产品描述</th>--%>
<%--                                <th class="text-center sorting">状态</th>--%>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>


                            <c:forEach items="${pageInfo.list}" var="Car">

                                <tr>
                                    <td><input name="ids" type="checkbox"></td>
                                    <td>${Car.carNumber }</td>
                                    <td>${Car.carOwnerName }</td>
                                    <td>${Car.expireDateStr }</td>
                                    <td style="text-align: center">
<%--                                        <button type="button" class="btn bg-olive btn-xs">订单</button>--%>
<%--                                        <button type="button" class="btn bg-olive btn-xs">详情</button>--%>
                                        <button type="button" class="btn bg-olive btn-xs" onclick="location.href='#'">会员续费</button>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <!--数据列表/-->

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="has-feedback">
<%--                                <input type="text" class="form-control input-sm"--%>
<%--                                       placeholder="车牌号"> <span--%>
<%--                                    class="glyphicon glyphicon-search form-control-feedback"></span>--%>
                            </div>
<%--                            <div class="form-group form-inline">--%>
<%--                                <div class="btn-group">--%>
<%--                                    <button type="button" class="btn btn-default" title="新建">--%>
<%--                                        <i class="fa fa-file-o"></i> 新建--%>
<%--                                    </button>--%>
<%--                                    <button type="button" class="btn btn-default" title="删除">--%>
<%--                                        <i class="fa fa-trash-o"></i> 删除--%>
<%--                                    </button>--%>
<%--                                    <button type="button" class="btn btn-default" title="开启">--%>
<%--                                        <i class="fa fa-check"></i> 开启--%>
<%--                                    </button>--%>
<%--                                    <button type="button" class="btn btn-default" title="屏蔽">--%>
<%--                                        <i class="fa fa-ban"></i> 屏蔽--%>
<%--                                    </button>--%>
<%--                                    <button type="button" class="btn btn-default" title="刷新">--%>
<%--                                        <i class="fa fa-refresh"></i> 刷新--%>
<%--                                    </button>--%>
<%--                                </div>--%>
<%--                            </div>--%>
                        </div>
                        <div class="box-tools pull-right">
<%--                            <div class="has-feedback">--%>
<%--                                <input type="text" class="form-control input-sm"--%>
<%--                                       placeholder="车主姓名"> <span--%>
<%--                                    class="glyphicon glyphicon-search form-control-feedback"></span>--%>
<%--                            </div>--%>
                        </div>
                        <!--工具栏/-->

                    </div>
                    <!-- 数据表格 /-->


                </div>
                <!-- /.box-body -->

                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            总共 ${pageInfo.pages} 页，共 ${pageInfo.total} 条数据。 每页
                            <select class="form-control" onchange="changePageSize()" id="changePageSize">
                                <c:forEach begin="1" end="8" var="rowsNum">
                                    <option>${rowsNum}</option>
                                </c:forEach>

                            </select> 条
                        </div>
                    </div>

                    <div class="box-tools pull-right">
                        <ul class="pagination" >
                            <li><a href="${path}/monthlyTicket/findAll?page=1&pageSize=${pageInfo.pageSize}&carNum=${carNum}&ownerName=${ownerName}" aria-label="Previous">首页</a></li>
                            <li><a href="${path}/monthlyTicket/findAll?page=${pageInfo.pageNum<=1?1:pageInfo.pageNum-1}&pageSize=${pageInfo.pageSize}&carNum=${carNum}&ownerName=${ownerName}">上一页</a></li>
                            <c:forEach begin="1" end="${pageInfo.pages}" var="pageNo">
                                <li><a href="${path}/monthlyTicket/findAll?page=${pageNo}&pageSize=${pageInfo.pageSize}&carNum=${carNum}&ownerName=${ownerName}">${pageNo}</a></li>
                            </c:forEach>
                            <li><a href="${path}/monthlyTicket/findAll?page=${pageInfo.pageNum>=pageInfo.pages?pageInfo.pages:pageInfo.pageNum+1}&pageSize=${pageInfo.pageSize}&carNum=${carNum}&ownerName=${ownerName}">下一页</a></li>
                            <li><a href="${path}/monthlyTicket/findAll?page=${pageInfo.pages}&pageSize=${pageInfo.pageSize}&carNum=${carNum}&ownerName=${ownerName}" aria-label="Next">尾页</a></li>
                        </ul>
                    </div>

                </div>
                <!-- /.box-footer-->



            </div>

        </section>
        <!-- 正文区域 /-->

    </div>
    <!-- @@close -->
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <jsp:include page="/static/footer.jsp"></jsp:include>
    <!-- 底部导航 /-->

</div>


<script
        src="${path}/../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${path}/../plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script
        src="${path}/../plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${path}/../plugins/raphael/raphael-min.js"></script>
<script
        src="${path}/../plugins/morris/morris.min.js"></script>
<script
        src="${path}/../plugins/sparkline/jquery.sparkline.min.js"></script>
<script
        src="${path}/../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
        src="${path}/../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
        src="${path}/../plugins/knob/jquery.knob.js"></script>
<script
        src="${path}/../plugins/daterangepicker/moment.min.js"></script>
<script
        src="${path}/../plugins/daterangepicker/daterangepicker.js"></script>
<script
        src="${path}/../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script
        src="${path}/../plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${path}/../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${path}/../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="${path}/../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script
        src="${path}/../plugins/fastclick/fastclick.js"></script>
<script
        src="${path}/../plugins/iCheck/icheck.min.js"></script>
<script
        src="${path}/../plugins/adminLTE/js/app.min.js"></script>
<script
        src="${path}/../plugins/treeTable/jquery.treetable.js"></script>
<script
        src="${path}/../plugins/select2/select2.full.min.js"></script>
<script
        src="${path}/../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="${path}/../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script
        src="${path}/../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="${path}/../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script
        src="${path}/../plugins/bootstrap-markdown/js/markdown.js"></script>
<script
        src="${path}/../plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script
        src="${path}/../plugins/ckeditor/ckeditor.js"></script>
<script
        src="${path}/../plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="${path}/../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script
        src="${path}/../plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script
        src="${path}/../plugins/datatables/jquery.dataTables.min.js"></script>
<script
        src="${path}/../plugins/datatables/dataTables.bootstrap.min.js"></script>
<script
        src="${path}/../plugins/chartjs/Chart.min.js"></script>
<script
        src="${path}/../plugins/flot/jquery.flot.min.js"></script>
<script
        src="${path}/../plugins/flot/jquery.flot.resize.min.js"></script>
<script
        src="${path}/../plugins/flot/jquery.flot.pie.min.js"></script>
<script
        src="${path}/../plugins/flot/jquery.flot.categories.min.js"></script>
<script
        src="${path}/../plugins/ionslider/ion.rangeSlider.min.js"></script>
<script
        src="${path}/../plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script
        src="${path}/../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script
        src="${path}/../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>

    <%-- 当每页显示条数发生改变时,及时刷新页面 --%>
    function changePageSize() {
        //获取下拉框的值
        var pageSize = $("#changePageSize").val();
        //向服务器发送请求，改变没页显示条数
        location.href = "${path}/monthlyTicket/findAll?page=1&pageSize="
            + pageSize + "&carNum=${carNum}&ownerName=${ownerName}";
    }

    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale : 'zh-CN'
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document).ready(function() {

        // 激活导航位置
        setSidebarActive("admin-datalist");

        // 列表按钮
        $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass : 'icheckbox_square-blue',
            increaseArea : '20%'
        });
        // 全选操作
        $("#selall").click(function() {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });
</script>
</body>

</html>