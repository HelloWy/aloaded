<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<title>菜单管理</title>
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
			<script type="text/javascript" src="<%=path%>/js/ajax/addMsg.js"></script>
<script type="text/javascript">
		$(function(){
			var options = {
				/* detailUrl:"msgReply.do", */
				submitUrl:"addMsg.do",
				returnUrl:"<%=path%>/uMsgBoard/msg.do",
			submitBtn : "btnSaveOrModify",
			closeBtn : "btnClose",
			openState : true
		};
		$("#form").loadEditData(options);
	});
</script>
</head>
<body>
	<div id="container">
		<div class="bottomBar">
			<div class="fr" style="margin-right: 10px;">
				<input type="button" id="btnSaveOrModify" name="btnSaveOrModify"
					class="btn btn82 btn_save_bottom" value="保 存" /> <input
					type="button" id="btnClose" name="btnClose"
					class="btn btn82 btn_close" value="关 闭" />
			</div>
		</div>
		<input type="hidden" id="basePath" name="basePath" value="<%=path%>" />
		<form action="" id="form" method="post">
			<table border="0" cellpadding="0" cellspacing="0" class="form_table">
				<tr>
					<td class="td_right">我的被装品茗是：</td>
					<td><select calss="select" id="sex" name="sex" require="NotNull" >
							<option value="0">性别</option>
							<option value="1">男</option>
							<option value="2">女</option>
					</select> <select calss="select" id="clothestype" name="clothestype" require="NotNull" >
							<option value="0">被装类型</option>
							<option value="1">帽子</option>
							<option value="2">上衣</option>
							<option value="3">下裤</option>
							<option value="4">大衣</option>
							<option value="5">鞋子</option>
							<option value="6">杂物</option>
							<option value="7">配饰</option>
					</select> <select calss="select" id="clothesname" name="clothesname" require="NotNull" >				
					<option value="0">服裝品茗</option>
					</select></td>
				</tr>
				<tr>
					<td class="td_right">号码是：</td>
					<td><select id="size" name="size" require="NotNull" >
					<option value="0">型号</option>
					</select></td>
				</tr>
				<tr>
					<td class="td_right">想要调换的号码是：</td>
					<td><select id="changesize" name="changesize" require="NotNull" >
					<option value="0">型号</option>
					</select></td>
				</tr>
				<tr>
					<td class="td_right">备注：</td>
					<td><input type="text" id="context" name="context" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">联系方式：</td>
					<td><input type="text" id="userphone" name="userphone"
						value="" class="input_long" require="NotNull" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>