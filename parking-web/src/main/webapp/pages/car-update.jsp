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




    <title>数据 - AdminLTE2定制版</title>
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
                数据管理 <small>数据列表</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="#">数据管理</a></li>
                <li class="active">数据列表</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <form action="${path}/monthlyTicket/save"
              method="post">
            <!-- 正文区域 -->
            <section class="content"> <!--月票信息-->

                <div class="panel panel-default">
                    <div class="panel-heading">月票信息</div>
                    <div class="row data-type">

                        <div class="col-md-2 title">车牌号</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="productNum"
                                   placeholder="车牌号" value="">
                        </div>
                        <div class="col-md-2 title">车主姓名</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="productName"
                                   placeholder="车主姓名" value="">
                        </div>
                        <div class="col-md-2 title">到期时间</div>
                        <div class="col-md-4 data">
                            <div class="input-group date">
                                <div class="input-group-addon">
                                    <i class="fa fa-calendar"></i>
                                </div>
                                <input type="text" class="form-control pull-right"
                                       id="datepicker-a3" name="departureTime">
                            </div>
                        </div>


<%--                        <div class="col-md-2 title">出发城市</div>--%>
<%--                        <div class="col-md-4 data">--%>
<%--                            <input type="text" class="form-control" name="cityName"--%>
<%--                                   placeholder="出发城市" value="">--%>
<%--                        </div>--%>

<%--                        <div class="col-md-2 title">产品价格</div>--%>
<%--                        <div class="col-md-4 data">--%>
<%--                            <input type="text" class="form-control" placeholder="产品价格"--%>
<%--                                   name="productPrice" value="">--%>
<%--                        </div>--%>

<%--                        <div class="col-md-2 title">产品状态</div>--%>
<%--                        <div class="col-md-4 data">--%>
<%--                            <select class="form-control select2" style="width: 100%"--%>
<%--                                    name="productStatus">--%>
<%--                                <option value="0" selected="selected">关闭</option>--%>
<%--                                <option value="1">开启</option>--%>
<%--                            </select>--%>
<%--                        </div>--%>

<%--                        <div class="col-md-2 title rowHeight2x">其他信息</div>--%>
<%--                        <div class="col-md-10 data rowHeight2x">--%>
<%--							<textarea class="form-control" rows="3" placeholder="其他信息"--%>
<%--                                      name="productDesc"></textarea>--%>
<%--                        </div>--%>

                    </div>
                </div>
                <!--订单信息/--> <!--工具栏-->
                <div class="box-tools text-center">
                    <button type="submit" class="btn bg-maroon">保存</button>
                    <button type="button" class="btn bg-default"
                            onclick="history.back(-1);">返回</button>
                </div>
                <!--工具栏/--> </section>
            <!-- 正文区域 /-->
        </form>

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
            + pageSize;
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