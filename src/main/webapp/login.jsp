<%--

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<!doctype html>--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>登录</title>
    <link rel="stylesheet" href="./vendor/simple-line-icons/css/simple-line-icons.css">
    <link rel="stylesheet" href="./vendor/font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="./css/styles.css">
</head>
<body>
<div class="page-wrapper flex-row align-items-center">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-5">
                <div class="card p-4">
                    <div class="card-header text-center text-uppercase h4 font-weight-light">
                        欢迎登录！
                    </div>
                    <form method="post" action="login">
                        <!--<input name="username">-->
                        <!--<input name="password">-->
                        <!--<input type="submit" value="提交">-->

                        <div class="card-body py-5">

                            <div class="form-group">
                                <label class="form-control-label">用户名</label>
                                <input type="text" class="form-control" name="username">
                            </div>

                            <div class="form-group">
                                <label class="form-control-label">密码</label>
                                <input type="password" class="form-control" name="password">
                            </div>

                            <div class="custom-control custom-checkbox mt-4">
                                <input type="checkbox" class="custom-control-input" id="login">
                                <label class="custom-control-label" for="login">Check this custom checkbox</label>
                            </div>
                        </div>

                        <div class="card-footer">
                            <div class="row">
                                <div class="col-6">
                                    <button type="submit" class="btn btn-primary px-5">登录</button>
                                </div>

                                <div class="col-6">
                                    <a href="register.jsp" class="btn btn-link">注册
                                    </a>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
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
