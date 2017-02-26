<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setAttribute("loaded", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${loaded}/css/style.css" rel="stylesheet" type="text/css" />
<link href="${loaded}/css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${loaded}/js/jquery.js"></script>
</head>
<script type="text/javascript">
	$("#fileForm").ajaxForm(function(data) {
		alert(data);
	});
</script>
<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">用户信息管理</a></li>
			<li><a href="#">录入学院信息</a></li>
		</ul>
	</div>

	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<!--<li class="click"><span><img src="../../images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="../../images/t02.png" /></span>修改</li>
            <li><span><img src="../../images/t03.png" /></span>删除</li>
            <li><span><img src="../../images/t04.png" /></span>统计</li>-->

				<li class="selectInput">
					<div class="vocation" style="padding: 0;">
						<form id="fileForm" action="${loaded}/uploads.do?dir=file" method="post"
							enctype="multipart/form-data">
							<input type="file" name="file" /><br> <br> <label>&nbsp;</label><input
								name="" type="submit" class="btn" value="确认上传" />
						</form>
					</div>
				</li>
			</ul>
		</div>

	</div>

</body>
</html>