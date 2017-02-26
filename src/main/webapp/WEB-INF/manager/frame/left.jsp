<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setAttribute("loaded", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
<link href="${loaded }/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${loaded }/js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active")
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	})
</script>


</head>

<body style="background: #f0f9fd;">
	<div class="lefttop">
		<span></span>导航栏
	</div>

	<dl class="leftmenu">

		<%-- 		<dd>
			<div class="title">
				<span><img src="../images/leftico01.png" /></span>管理信息
			</div>
			<ul class="menuson">
				<li class="active"><cite></cite><a
					href="../menu/demo/index.html" target="rightFrame">首页模版</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/right.html"
					target="rightFrame">数据列表</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/imgtable.html"
					target="rightFrame">图片数据表</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/form.html"
					target="rightFrame">添加编辑</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/imglist.html"
					target="rightFrame">图片列表</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/imglist1.html"
					target="rightFrame">自定义</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/tools.html"
					target="rightFrame">常用工具</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/filelist.html"
					target="rightFrame">信息管理</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/tab.html"
					target="rightFrame">Tab页</a><i></i></li>
				<li><cite></cite><a href="../menu/demo/error.html"
					target="rightFrame">404页面</a><i></i></li>
			</ul>
		</dd> --%>


		<dd>
			<div class="title">
				<span><img src="${loaded }/images/leftico02.png" /></span>用户信息管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${loaded }/userInfo/stu.do"
					target="rightFrame">用户信息</a><i></i></li>
				<%-- <li><cite></cite><a href="${loaded }/userInfo/stuUpload.do"
					target="rightFrame">录入用户信息</a><i></i></li> --%>
				<%-- <li><cite></cite><a href="${loaded }/userInfo/stuUpload.do"
					target="rightFrame">学员信息查询</a><i></i></li> --%>
			</ul>
		</dd>


		<dd>
			<div class="title">
				<span><img src="../images/leftico03.png" /></span>被装信息管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${loaded}/clothesInfo/stok.do"
					target="rightFrame">库存信息</a><i></i></li>
				<%-- <li><cite></cite><a href="${loaded}/clothesInfo/loadedtype.do" target="rightFrame">被装类别列表</a><i></i></li>
				<li><cite></cite><a href="#">被装品名列表</a><i></i></li> --%>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="../images/leftico04.png" /></span>消息管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${loaded}/msg/unDispost.do"
					target="rightFrame">未处理消息</a><i></i></li>
				<li><cite></cite><a href="${loaded}/msg/processed.do" target="rightFrame">已处理消息</a><i></i></li>
			</ul>

		</dd>

		<dd>
			<div class="title">
				<span><img src="../images/leftico04.png" /></span>系统管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${loaded}/system/personal.do"
					target="rightFrame">个人中心</a><i></i></li>
				<li><cite></cite><a href="${loaded }/system/msgBoard.do" target="rightFrame">留言板管理</a><i></i></li>
				<li><cite></cite><a href="${loaded }/system/notice.do" target="rightFrame">公告栏管理</a><i></i></li>
			</ul>

		</dd>


	</dl>
</body>
</html>