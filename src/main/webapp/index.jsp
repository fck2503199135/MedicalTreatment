
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>名医his系统</title>
    <link rel="stylesheet" href="./vendor/simple-line-icons/css/simple-line-icons.css">
    <link rel="stylesheet" href="./vendor/font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="./css/styles.css">


</head>
<body class="sidebar-fixed header-fixed">
<div class="page-wrapper">
    <nav class="navbar page-header">
        <a href="#" class="btn btn-link sidebar-mobile-toggle d-md-none mr-auto">
            <i class="fa fa-bars"></i>
        </a>

        <a class="navbar-brand" href="#">
            <!--<img src="./imgs/logo.png" alt="logo">-->
            名医诊所云系统

        </a>

        <a href="#" class="btn btn-link sidebar-toggle d-md-down-none">
            <i class="fa fa-bars"></i>
        </a>

        <ul class="navbar-nav ml-auto">
            <li class="nav-item d-md-down-none">
                <a href="#">
                    <i class="fa fa-bell"></i>
                    <%--<span class="badge badge-pill badge-danger">5 </span>--%>
                </a>
            </li>

            <li class="nav-item d-md-down-none">
                <a href="#">
                    <i class="fa fa-envelope-open"></i>
                    <%--<span class="badge badge-pill badge-danger">5 </span>--%>
                </a>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true"
                   aria-expanded="false">
                    <img src="./imgs/avatar-1.png" class="avatar avatar-sm" alt="logo">
                    <span class="small ml-1 d-md-down-none">
                        <!--John Smith-->

                        <shiro:principal property="username"></shiro:principal>
                        <%--用户名--%>
                    </span>
                </a>

                <div class="dropdown-menu dropdown-menu-right">
                    <div class="dropdown-header">Account</div>

                    <a href="#" class="dropdown-item">
                        <i class="fa fa-user"></i> 简况
                    </a>

                    <a href="#" class="dropdown-item">
                        <i class="fa fa-envelope"></i> 信息
                    </a>

                    <div class="dropdown-header">设置</div>

                    <a href="#" class="dropdown-item">
                        <i class="fa fa-bell"></i> 通知
                    </a>

                    <a href="#" class="dropdown-item">
                        <i class="fa fa-wrench"></i> 设置
                    </a>

                    <a href="#" class="dropdown-item">
                        <i class="fa fa-lock"></i> 退出
                        <a href="logout"> 退出</a>


                    </a>
                </div>
            </li>
        </ul>
    </nav>


    <div class="main-container">


        <div class="sidebar">
            <nav class="sidebar-nav">
                <ul class="nav">
                    <li class="nav-title"></li>

                    <li class="nav-item">
                        <a href="index.html" class="nav-link active">
                            <i class="icon icon-speedometer"></i> 首页
                        </a>
                    </li>


                <shiro:hasRole name="admin">
                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-target"></i> 系统设置
                            <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="doctor.html" aria-controls="char" target="right" class="nav-link">
                                    <i class="icon icon-target"></i> 医生管理
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="dept.html" class="nav-link" aria-controls="char" target="right">
                                    <i class="icon icon-target"></i> 科室管理
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="reg_fee.html" class="nav-link" aria-controls="char" target="right">
                                    <i class="icon icon-target"></i> 挂号费管理
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="prescription.html" class="nav-link" aria-controls="char" target="right">
                                    <i class="icon icon-target"></i> 处方附加费
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="inspection.html" class="nav-link" aria-controls="char" target="right">
                                    <i class="icon icon-target"></i> 项目检查费
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="dictionary.html" class="nav-link" aria-controls="char" target="right">
                                    <i class="icon icon-target"></i> 字典表维护
                                </a>
                            <li class="nav-item">
                                <a href="hospital.html" class="nav-link" aria-controls="char" target="right">
                                    <i class="icon icon-target"></i> 诊所信息
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="icon icon-target"></i> 第三方配置
                                </a>
                            </li>

                        </ul>
                    </li>
                </shiro:hasRole>

                    <shiro:hasRole name="admin">
                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-energy"></i> 药品进存销<i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="medicinal.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-energy"></i> 药品信息维护
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="supplier.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-energy"></i> 供应商维护
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="purchase.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-energy"></i> 采购入库
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="reviewed.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-energy"></i> 入库审核
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="mediclibrary.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-energy"></i> 库存查询
                                </a>
                            </li>

                        </ul>
                    </li>
                    </shiro:hasRole>

                    <%--<shiro:hasRole name="doctor">                    </shiro:hasRole>--%>
                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle" target="right" aria-controls="char">
                            <i class="icon icon-graph"></i> 看病就诊 <i class="fa fa-caret-left"></i>
                        </a>
                        <shiro:hasRole name="doctor">
                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="treat.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>新开就诊
                                </a>
                            </li>
                        </ul>
                        </shiro:hasRole>

                        <shiro:hasRole name="doctor">
                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="visit.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>就诊列表
                                </a>
                            </li>
                        </ul>
                        </shiro:hasRole>

                        <shiro:hasRole name="admin">
                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="scheduling.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>医生排班
                                </a>
                            </li>
                        </ul>
                        </shiro:hasRole>

                        <shiro:hasRole name="patient">
                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="registered.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>门诊挂号
                                </a>
                            </li>
                        </ul>
                        </shiro:hasRole>

                        <shiro:hasRole name="doctor">
                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="reglist.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>挂号列表
                                </a>
                            </li>
                        </ul>

                        </shiro:hasRole>

                        <shiro:hasRole name="doctor">
                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="patient.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>患者库
                                </a>
                            </li>
                        </ul>
                        </shiro:hasRole>


                    </li>

<shiro:hasRole name="admin">
                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle" target="right" aria-controls="char">
                            <i class="icon icon-graph"></i> 数据统计 <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="clinic_statistics.jsp" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>诊所收支统计
                                </a>
                            </li>
                        </ul>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="Drugsales.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>药品销售统计
                                </a>
                            </li>
                        </ul>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="schedulig.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>检查项目统计
                                </a>
                            </li>
                        </ul>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="registred.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>年月报表统计
                                </a>
                            </li>
                        </ul>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="regist.html" class="nav-link" target="right" aria-controls="char">
                                    <i class="icon icon-graph"></i>工作量统计
                                </a>
                            </li>
                        </ul>

                        <!--<ul class="nav-dropdown-items">-->
                        <!--<li class="nav-item">-->
                        <!--<a href="patient.html" class="nav-link" target="right" aria-controls="char">-->
                        <!--<i class="icon icon-graph"></i>患者库-->
                        <!--</a>-->
                        <!--</li>-->
                        <!--</ul>-->



                    </li>
</shiro:hasRole>
                    <li class="nav-item">
                        <a href="forms.html" class="nav-link">
                            <i class="icon icon-puzzle"></i>
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="tables.html" class="nav-link">
                            <i class="icon icon-grid"></i> 收费发药
                        </a>
                    </li>

                    <!--<li class="nav-title">More</li>-->

                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-umbrella"></i> Pages <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="blank.html" class="nav-link">
                                    <i class="icon icon-umbrella"></i> Blank Page
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="login.html" class="nav-link">
                                    <i class="icon icon-umbrella"></i> Login
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="register.jsp" class="nav-link">
                                    <i class="icon icon-umbrella"></i> Register
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="invoice.html" class="nav-link">
                                    <i class="icon icon-umbrella"></i> Invoice
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="404.html" class="nav-link">
                                    <i class="icon icon-umbrella"></i> 404
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="500.html" class="nav-link">
                                    <i class="icon icon-umbrella"></i> 500
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="settings.html" class="nav-link">
                                    <i class="icon icon-umbrella"></i> Settings
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="content" style="padding:0;">

            <iframe src="doctor.html" name="right" class="" style="width: 100%;height:1000px"></iframe>
            <!--<div class="container-fluid" >-->
            <!---->


            <!--</div>-->
        </div>
    </div>
</div>
<script src="./vendor/jquery/jquery.min.js"></script>
<script src="./vendor/popper.js/popper.min.js"></script>
<script src="./vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="./vendor/chart.js/chart.min.js"></script>
<script src="./js/carbon.js"></script>
<script src="./js/demo.js"></script>
</body>
</html>

