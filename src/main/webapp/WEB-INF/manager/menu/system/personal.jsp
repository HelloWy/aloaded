<%@page import="com.pumpkin.aloaded.dao.model.Adminlendinformation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	Adminlendinformation admin = (Adminlendinformation)session.getAttribute("AdminSession");
	String id = admin.getId().toString();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="<%=path%>/css/editor.css" type="text/css" />
<link rel="stylesheet" href="<%=path%>/css/button.css" type="text/css" />
<link rel="stylesheet" href="<%=path%>/js/dialog/default/ymPrompt.css"
	type="text/css" />

<script type="text/javascript" src="<%=path%>/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=path%>/js/jquery.json-2.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/dialog/ymPrompt.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/validator.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/main.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/utils.js"></script>

<script type="text/javascript">
$(function(){
	var id = '<%=id%>';
	var options = {
		detailUrl:"adminInfo.do",
		submitUrl:"saveAdminInfo.do",
		returnUrl:"<%=path%>/logout.do",
			submitBtn : "btnSaveOrModify",
			logout:true,
			formId : id
		};
		$("#form").loadEditData(options);
	});
</script>
</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">系统管理</a></li>
			<li><a href="#">个人中心</a></li>
		</ul>
	</div>
	<div id="container" style="margin-top: 100px;">
		<div class="bottomBar" >
			<div class="fr" style="margin-right: 10px;">

				<!--  <input
					type="button" id="btnClose" style="color: black;" name="btnClose"
					class="btn btn82 btn_close" value="关 闭" /> -->
			</div>
		</div>
		<input type="hidden" id="basePath" name="basePath" value="<%=path%>" />
		<form action="" id="form" method="post">
			<input type="hidden" id="id" name="id" value="<%=id%>" />
			<table border="0" cellpadding="0" cellspacing="0" class="form_table">
				
				<tr>
					<td class="td_right">姓名：</td>
					<td><input type="text" id="username" name="username" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">密码：</td>
					<td><input type="text" id="password" name="password" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				
				<tr>
					<td class="td_right"></td>
					<td></td>
				</tr>
				<tr>
					<td class="td_right"></td>
					<td align="left" width="87"><input type="button"
						id="btnSaveOrModify" name="btnSaveOrModify"
						class="btn btn82 btn_save_bottom" style="color: black;"
						value="保 存" /></td>
				</tr>
			</table>
		</form>

	</div>
</body>
</html>