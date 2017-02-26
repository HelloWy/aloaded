<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>被装管理后台登陆</title>
<link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/js/dialog/default/ymPrompt.css" rel="stylesheet"
	type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script src="<%=path%>/js/dialog/ymPrompt.js" type="text/javascript"></script>
<script src="<%=path%>/js/wyjquery/login.js" type="text/javascript"></script>
<script src="<%=path%>/js/cloud.js" type="text/javascript"></script>
<script type="text/javascript" src="<%=path%>/js/jquery.json-2.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery.pageHelper.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/main.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/view.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/utils.js"></script>


<script language="javascript">
	$(function() {
		$('.loginbox').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 692) / 2
		});
		$(window).resize(function() {
			$('.loginbox').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 692) / 2
			});
		});
		$.login();

		var options = {
			addBtn : "btnAdd",
			openState : true,
			addUrl : "userRegisterT.do",
			winWidth : 650,
			winHeight : 360,
			winPos : "c",
			winTitle : "当前窗口：用户注册"
		};
		$("#listData").loadViewList(options);
	});
</script>

</head>
<body
	style="background-color: #1c77ac; background-image: url(images/light.png); background-repeat: no-repeat; background-position: center top; overflow: hidden;">

	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>


	<div class="logintop">
		<span>欢迎登录后台管理界面平台</span>
		<ul>
			<li><a href="#">回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>

	<div class="loginbody">
		<span class="systemlogo"></span>
		<div class="loginbox">
			<from action="">
			<ul>

				<li><input id="adminName" name="adminName" type="text"
					class="loginuser" value="admin" /></li>
				<li><input name="password" id="password" type="password"
					class="loginpwd" /></li>
				<li><input name="submitBtn" id="submitBtn" type="button"
					class="loginbtn" value="登录" /><label><a href="#"><input
							name="type" id="type" type="checkbox" value="1">管理员</a></label><label><i
						id="btnAdd" name="btnAdd">注册</i></label><label><a href="#">忘记密码？</a></label></li>
			</ul>
			</from>
		</div>

	</div>
	<div class="rightinfo">
		<table id="listData" class="tablelist">
			<tbody>
			</tbody>
		</table>
		<div id="pager" class="pagin"></div>
	</div>
	<div class="loginbm">2016</div>
</body>
</html>
