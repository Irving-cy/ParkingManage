<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>停车管理系统首页</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- iCheck -->
    <!-- Morris chart -->
    <!-- jvectormap -->
    <!-- Date Picker -->
    <!-- Daterange picker -->
    <!-- Bootstrap time Picker -->
    <!--<link rel="stylesheet" href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/${pageContext.request.contextPath}/../plugins/timepicker/bootstrap-timepicker.min.css">-->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--数据表格-->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- Bootstrap Color Picker -->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--bootstrap-markdown-->
    <!-- Theme style -->
    <!-- AdminLTE Skins. Choose a skin from the css/skins
           folder instead of downloading all of them to reduce the load. -->
    <!-- Ion Slider -->
    <!-- ion slider Nice -->
    <!-- bootstrap slider -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery 2.2.3 -->
    <!-- jQuery UI 1.11.4 -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.6 -->
    <!-- Morris.js charts -->
    <!-- Sparkline -->
    <!-- jvectormap -->
    <!-- jQuery Knob Chart -->
    <!-- daterangepicker -->
    <!-- datepicker -->
    <!-- Bootstrap WYSIHTML5 -->
    <!-- Slimscroll -->
    <!-- FastClick -->
    <!-- iCheck -->
    <!-- AdminLTE App -->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- bootstrap color picker -->
    <!-- bootstrap time picker -->
    <!--<script src="${pageContext.request.contextPath}/${pageContext.request.contextPath}/${pageContext.request.contextPath}/../plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
    <!-- Bootstrap WYSIHTML5 -->
    <!--bootstrap-markdown-->
    <!-- CK Editor -->
    <!-- InputMask -->
    <!-- DataTables -->
    <!-- ChartJS 1.0.1 -->
    <!-- FLOT CHARTS -->
    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
    <!-- jQuery Knob -->
    <!-- Sparkline -->
    <!-- Morris.js charts -->
    <!-- Ion Slider -->
    <!-- Bootstrap slider -->
    <!-- 页面meta /-->

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../plugins/bootstrap-slider/slider.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="/static/header.jsp"></jsp:include>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="/static/aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                出入车辆明细 <small></small>
            </h1>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">
            <!--日报信息-->
            <div class="panel panel-default">
                <div class="panel-heading">车辆进出日报信息</div>
                <!--数据列表-->
                <table id="dataList"
                       class="table table-bordered table-striped table-hover dataTable">
                    <thead>
                    <tr>
                        <th class="">用户姓名</th>
                        <th class="">车牌号</th>
                        <th class="">离开时间</th>
                        <th class="">停车时间</th>
                        <th class="">用户型号</th>
                        <th class="">本次费用</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="record" items="${pageInfo.list}">
                        <tr>
                            <td><input type="text" size="10" value="${record.name}"
                                       readonly="readonly"></td>
                            <td><input type="text" size="10" value="${record.carNumber}"
                                       readonly="readonly"></td>
                            <td><input type="text" size="20" value="${record.outTimeStr}"
                                       readonly="readonly"></td>
                            <td><input type="text" size="20" value="${record.inTimeStr}"
                                       readonly="readonly"></td>
                            <td><input type="text" size="10" value="${record.type}"
                                       readonly="readonly"></td>
                            <td><input type="text" size="25" value="${record.fee}元"
                                       readonly="readonly"></td>
                        </tr>
                    </c:forEach>


                    </tbody>
                </table>
                <!--数据列表/-->
            </div>
            <!--日报信息/-->

<%--            <!-- .box-footer-->--%>
<%--            <div class="box-footer">--%>
<%--                <div class="pull-left">--%>
<%--                    <div class="form-group form-inline">--%>
<%--                        总共${pageInfo.pages} 页，共${pageInfo.total} 条数据。 每页--%>
<%--                        <select class="form-control" onchange="changePageSize()" id="changePageSize">--%>
<%--                            <c:forEach begin="1" end="${pageInfo.total>5?5:pageInfo.total}" var="rowNum">--%>
<%--                                <option>--%>
<%--                                    <c:if test="${pageInfo.pageSize == rowNum}">--%>
<%--                                        ${rowNum}--%>
<%--                                    </c:if>--%>
<%--                                    <c:if test="${pageInfo.pageSize != rowNum}">--%>
<%--                                        ${rowNum}--%>
<%--                                    </c:if>--%>
<%--                                </option>--%>
<%--                            </c:forEach>--%>
<%--                        </select> 条--%>
<%--                    </div>--%>
<%--                </div>--%>

<%--                <div class="box-tools pull-right">--%>
<%--                    <ul class="pagination">--%>
<%--                        <li>--%>
<%--                            <a href="${pageContext.request.contextPath}/dailyIncome/findDetailByTime?time=${time}&page=1&pageSize=${pageInfo.total}" aria-label="Previous">首页</a>--%>
<%--                        </li>--%>
<%--                        <li>--%>
<%--                            <a href="${pageContext.request.contextPath}/dailyIncome/findDetailByTime?time=${time}&page=${pageInfo.pageNum-1}&pageSize=${pageInfo.total>5?5:pageInfo.total}">上一页</a>--%>
<%--                        </li>--%>
<%--                        <c:forEach begin="1" end="${pageInfo.pages}" var="pNum">--%>
<%--                            <li>--%>
<%--                                <a href="${pageContext.request.contextPath}/dailyIncome/findDetailByTime?time=${time}&page=${pNum}&pageSize=${pageInfo.total>5?5:pageInfo.total}">${pNum}</a>--%>
<%--                            </li>--%>
<%--                        </c:forEach>--%>
<%--                        <li>--%>
<%--                            <a href="${pageContext.request.contextPath}/dailyIncome/findDetailByTime?time=${time}&page=${pageInfo.pageNum+1}&pageSize=${pageInfo.total>5?5:pageInfo.total}">下一页</a>--%>
<%--                        </li>--%>
<%--                        <li>--%>
<%--                            <a href="${pageContext.request.contextPath}/dailyIncome/findDetailByTime?time=${time}&page=${pageInfo.pages}&pageSize=${pageInfo.total>5?5:pageInfo.total}" aria-label="Next">尾页</a>--%>
<%--                        </li>--%>
<%--                    </ul>--%>
<%--                </div>--%>

<%--            </div>--%>
<%--            <!-- /.box-footer-->--%>

            <!--工具栏-->
            <div class="box-tools text-center">

                <button type="button" class="btn bg-default"
                        onclick="history.back(-1);">返回</button>
            </div>
            <!--工具栏/-->
        </section>
        <!-- 正文区域 /-->


    </div>
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <jsp:include page="/static/footer.jsp"/>
    <!-- 底部导航 /-->

</div>

<script
        src="${pageContext.request.contextPath}/../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/raphael/raphael-min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/morris/morris.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/sparkline/jquery.sparkline.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/knob/jquery.knob.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/daterangepicker/moment.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/daterangepicker/daterangepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/fastclick/fastclick.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/iCheck/icheck.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/adminLTE/js/app.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/treeTable/jquery.treetable.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/select2/select2.full.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap-markdown/js/markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/ckeditor/ckeditor.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/datatables/jquery.dataTables.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/datatables/dataTables.bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/chartjs/Chart.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/flot/jquery.flot.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/flot/jquery.flot.resize.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/flot/jquery.flot.pie.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/flot/jquery.flot.categories.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/ionslider/ion.rangeSlider.min.js"></script>
<script
        src="${pageContext.request.contextPath}/../plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script>
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
        setSidebarActive("admin-index");
    });
</script>
</body>

</html>