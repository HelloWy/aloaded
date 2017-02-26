<%@page import="com.pumpkin.aloaded.dao.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	User user = (User) session.getAttribute("UserSession");
	String id = user.getIdentyid().toString();
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
<script type="text/javascript" src="<%=path%>/js/jquery.json-2.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/dialog/ymPrompt.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/validator.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/main.js"></script>
<script type="text/javascript" src="<%=path%>/js/wyjquery/utils.js"></script>

<script type="text/javascript">
$(function(){
	var id = '<%=id%>';
	var options = {
		detailUrl:"userInfo.do",
		submitUrl:"saveUserInfo.do",
		returnUrl:"<%=path%>/uCenter/center.do",
			submitBtn : "btnSaveOrModify",
			logout : true,
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
	<div id="container" style="width: 100%;">
		<input type="hidden" id="basePath" name="basePath" value="<%=path%>" />
		<form action="" id="form" method="post">
			<input type="hidden" id="id" name="id" value="<%=id%>" />
			<table border="0" cellpadding="0" cellspacing="0" class="form_table">

				<tr>
					<td class="td_right">姓名：</td>
					<td><input type="text" id="name" name="name" value=""
						class="input_long" require="NotNull" /></td>
					<td class="td_right">学号：</td>
					<td><input type="text" id="studentId" name="studentId" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">身份证号：</td>
					<td><input type="text" id="identityId" name="identityId" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">性别：</td>
					<td><input type="text" id="sex" name="sex" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXXX1：</td>
					<td><input type="text" id="qihouqu" name="qihouqu" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXXX2：</td>
					<td><input type="text" id="junbingzhong" name="junbingzhong" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXXX3：</td>
					<td><input type="text" id="danweiqufen" name="danweiqufen" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXXX4：</td>
					<td><input type="text" id="danweileixing" name="danweileixing" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXXX5：</td>
					<td><input type="text" id="zhiwujibie" name="zhiwujibie" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXXX6：</td>
					<td><input type="text" id="xianzhishijian" name="xianzhishijian" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXXX7：</td>
					<td><input type="text" id="junxianjibie" name="junxianjibie" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXXX8：</td>
					<td><input type="text" id="xianxianshijian" name="xianxianshijian" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXXX9：</td>
					<td><input type="text" id="gongzuogangwei" name="gongzuogangwei" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXX10：</td>
					<td><input type="text" id="gongzuoshijian" name="gongzuoshijian" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXX11：</td>
					<td><input type="text" id="ruwushijian" name="ruwushijian" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXX12：</td>
					<td><input type="text" id="tiganshijian" name="tiganshijian" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXX13：</td>
					<td><input type="text" id="gaixuanshijian" name="gaixuanshijian" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXX14：</td>
					<td><input type="text" id="zucema" name="zucema" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXX15：</td>
					<td><input type="text" id="dengjibiaohao" name="dengjibiaohao" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XXX16：</td>
					<td><input type="text" id="gaixuanshijian" name="gaixuanshijian" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XXX17：</td>
					<td><input type="text" id="zucema" name="zucema" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XX1：</td>
					<td><input type="text" id="shengao" name="shengao" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XX2：</td>
					<td><input type="text" id="xiongwei" name="xiongwei" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">XX3：</td>
					<td><input type="text" id="yaowei" name="yaowei" value=""
						class="input_long" require="NotNull" /></td>
						<td class="td_right">XX4：</td>
					<td><input type="text" id="touwei" name="touwei" value=""
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