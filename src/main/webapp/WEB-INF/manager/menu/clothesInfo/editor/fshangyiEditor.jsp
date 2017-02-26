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
				detailUrl:"fshangyiInfo.do",
				submitUrl:"savefshangyiInfo.do",
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
					<td class="td_right">175/88：</td>
					<td><input type="text" id="a175b88" name="a175b88" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/96：</td>
					<td><input type="text" id="a170b96" name="a170b96" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/92：</td>
					<td><input type="text" id="a170b92" name="a170b92" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/88：</td>
					<td><input type="text" id="a170b88" name="a170b88" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">170/84：</td>
					<td><input type="text" id="a170b84" name="a170b84" value=""
						class="input_long" require="NotNull" /></td>
				</tr>

				<tr>
					<td class="td_right">170/80：</td>
					<td><input type="text" id="a170b80" name="a170b80" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/100：</td>
					<td><input type="text" id="a165b100" name="a165b100" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/96：</td>
					<td><input type="text" id="a165b96" name="a165b96" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/92：</td>
					<td><input type="text" id="a165b92" name="a165b92" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/88：</td>
					<td><input type="text" id="a165b88" name="a165b88" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/84：</td>
					<td><input type="text" id="a165b84" name="a165b84" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">165/80：</td>
					<td><input type="text" id="a165b80" name="a165b80" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				
				<tr>
					<td class="td_right">160/100：</td>
					<td><input type="text" id="a160b100" name="a160b100" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/96：</td>
					<td><input type="text" id="a160b96" name="a160b96" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/92：</td>
					<td><input type="text" id="a160b92" name="a160b92" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/88：</td>
					<td><input type="text" id="a160b88" name="a160b88" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/84：</td>
					<td><input type="text" id="a160b84" name="a160b84" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/80：</td>
					<td><input type="text" id="a160b80" name="a160b80" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">160/76：</td>
					<td><input type="text" id="a160b76" name="a160b76" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				
				<tr>
					<td class="td_right">155/96：</td>
					<td><input type="text" id="a155b96" name="a155b96" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/92：</td>
					<td><input type="text" id="a155b92" name="a155b92" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/88：</td>
					<td><input type="text" id="a155b88" name="a155b88" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/84：</td>
					<td><input type="text" id="a155b84" name="a155b84" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/80：</td>
					<td><input type="text" id="a155b80" name="a155b80" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
				<tr>
					<td class="td_right">155/76：</td>
					<td><input type="text" id="a155b76" name="a155b76" value=""
						class="input_long" require="NotNull" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>