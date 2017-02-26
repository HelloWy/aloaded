<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String id = request.getParameter("id") == null ? "" : request.getParameter("id").toString().trim();
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
<script type="text/javascript">
		$(function(){
			var id = '<%=id%>';
			var options = {
				detailUrl:"noticInfo.do",
				returnUrl:"<%=path%>/uNotice/notice.do",
			closeBtn : "btnClose",
			openState : true,
			formId : id
		};
		$("#form").loadEditData(options);
	});
</script>
</head>
<body>
	<div id="container">
		<div class="bottomBar">
			<div class="fr" style="margin-right: 10px;">
				<input type="button" id="btnClose" name="btnClose"
					class="btn btn82 btn_close" value="关 闭" />
			</div>
		</div>
		<input type="hidden" id="basePath" name="basePath" value="<%=path%>" />
		<form action="" id="form" method="post">
			<input type="hidden" id="id" name="id" value="<%=id%>" />
			<table border="0" cellpadding="0" cellspacing="0" class="form_table">
				<tr>
					<td class="td_right">标题：</td>
					<td><input type="text" id="title" name="title"
						value="" class="input_long" readonly="readonly" /></td>
				</tr>
				<tr>
					<td class="td_right">内容：</td>
					<td><textarea name="announcement" id="announcement" rows="5" style="width: 320px;" readonly="readonly"></textarea></td>
				</tr>
				<tr>
					<td class="td_right">发布人：</td>
					<td><input type="text" id="createname" name="createname"
						value="" class="input_long" require="NotNull"  readonly="readonly"/></td>
				</tr>
				<tr>
					<td class="td_right">发布时间：</td>
					<td><input type="text" id="createtime" name="createtime"
						value="" class="input_long" require="NotNull" readonly="readonly"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>