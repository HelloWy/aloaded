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
				detailUrl:"fxiakuInfo.do",
				submitUrl:"savefxiakuInfo.do",
				returnUrl:"<%=path%>/clothesInfo/stok.do",
			submitBtn : "btnSaveOrModify",
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
				<input type="button" id="btnSaveOrModify" name="btnSaveOrModify"
					class="btn btn82 btn_save_bottom" value="保 存" /> <input
					type="button" id="btnClose" name="btnClose"
					class="btn btn82 btn_close" value="关 闭" />
			</div>
		</div>
		<input type="hidden" id="basePath" name="basePath" value="<%=path%>" />
		<form action="" id="form" method="post">
			<input type="hidden" id="id" name="id" value="<%=id%>" />
			<table border="0" cellpadding="0" cellspacing="0" class="form_table">
				<tr>
					<td class="td_right">被装类型：</td>
					<td><input type="text" id="clothesname" name="clothesname"
						value="" class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">175/93：</td>
					<td><input type="text" id="a175b93" name="a175b93" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">175/83：</td>
					<td><input type="text" id="a175b83" name="a175b83" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/78：</td>
					<td><input type="text" id="a170b78" name="a170b78" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/73：</td>
					<td><input type="text" id="a170b73" name="a170b73" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/68：</td>
					<td><input type="text" id="a170b68" name="a170b68" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/64：</td>
					<td><input type="text" id="a170b64" name="a170b64" value=""
						class="input_long" require="NotNull" /></td>
				</tr>

				<tr>
					<td class="td_right">165/88：</td>
					<td><input type="text" id="a165b88" name="a165b88" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/83：</td>
					<td><input type="text" id="a165b83" name="a165b83" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/78：</td>
					<td><input type="text" id="a165b78" name="a165b78" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/73：</td>
					<td><input type="text" id="a165b73" name="a165b73" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/68：</td>
					<td><input type="text" id="a165b68" name="a165b68" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/64：</td>
					<td><input type="text" id="a165b64" name="a165b64" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				
				<tr>
					<td class="td_right">160/88：</td>
					<td><input type="text" id="a160b88" name="a160b88" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/83：</td>
					<td><input type="text" id="a160b83" name="a160b83" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/78：</td>
					<td><input type="text" id="a160b78" name="a160b78" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/73：</td>
					<td><input type="text" id="a160b73" name="a160b73" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/68：</td>
					<td><input type="text" id="a160b68" name="a160b68" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/64：</td>
					<td><input type="text" id="a160b64" name="a160b64" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/60：</td>
					<td><input type="text" id="a160b60" name="a160b60" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				
				<tr>
					<td class="td_right">155/83：</td>
					<td><input type="text" id="a155b83" name="a155b83" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/78：</td>
					<td><input type="text" id="a155b78" name="a155b78" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/68：</td>
					<td><input type="text" id="a155b68" name="a155b68" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/64：</td>
					<td><input type="text" id="a155b64" name="a155b64" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/60：</td>
					<td><input type="text" id="a155b60" name="a155b60" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>