<%--
  Created by IntelliJ IDEA.
  User: Lengyu
  Date: 2019/7/14
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>张猿猿</p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>
        <!-- search form -->
        <!--<form action="#" method="get" class="sidebar-form">
    <div class="input-group">
        <input type="text" name="q" class="form-control" placeholder="搜索...">
        <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
    </div>
</form>-->
        <!-- /.search form -->


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>

            <li id="admin-index"><a href="${pageContext.request.contextPath}/index.jsp"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

            <!-- 菜单 -->

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>系统管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="charts-chartjs">
                        <a href="all-charts-chartjs.html">
                            <i class="fa fa-circle-o"></i>用户管理
                        </a>
                    </li>

                    <li id="charts-morris">
                        <a href="all-charts-morris.html">
                            <i class="fa fa-circle-o"></i>角色管理
                        </a>
                    </li>

                    <li id="charts-flot">
                        <a href="all-charts-flot.html">
                            <i class="fa fa-circle-o"></i>权限管理
                        </a>
                    </li>

                </ul>
            </li>


            <li class="treeview">
                <a href="#">
                    <i class="fa fa-folder"></i> <span>基础数据管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-login">
                        <a href="all-admin-login.html">
                            <i class="fa fa-circle-o"></i>订单管理
                        </a>
                    </li>

                    <li id="admin-register">
                        <a href="${pageContext.request.contextPath}/product/findAll.do">
                            <i class="fa fa-circle-o"></i>产品管理
                        </a>
                    </li>

                </ul>
            </li>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
