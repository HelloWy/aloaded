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
<title>已处理消息</title>
<link href="${loaded}/css/style.css" rel="stylesheet" type="text/css" />
<link href="${loaded}/css/select.css" rel="stylesheet" type="text/css" />
<link href="${loaded}/js/dialog/default/ymPrompt.css" rel="stylesheet"
	type="text/css" />

<%-- <link href="${loaded}/css/tankuang.css" rel="stylesheet" type="text/css" /> --%>
<script type="text/javascript" src="${loaded}/js/jquery.js"></script>
<script type="text/javascript" src="${loaded}/js/jquery.json-2.2.min.js"></script>
<script type="text/javascript" src="${loaded}/js/jquery.pageHelper.js"></script>
<script type="text/javascript" src="${loaded}/js/dialog/ymPrompt.js"></script>
<script type="text/javascript" src="${loaded}/js/wyjquery/main.js"></script>
<script type="text/javascript" src="${loaded}/js/wyjquery/view.js"></script>
<script type="text/javascript" src="${loaded}/js/wyjquery/utils.js"></script>

<script type="text/javascript" src="${loaded}/js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="${loaded}/js/select-ui.min.js"></script>
<script type="text/javascript" src="${loaded}/js/ajax/student.js"></script>

<script type="text/javascript">
	$(function() {
		var options = {
			viewUrl : "processedList.do",
			colNames : [ "用户名","回复人", "回复内容", "时间" ],
			colModels : [ {
				name : 'username'
			}, {
				name : 'adminname'
			},{
				name : 'replycontext'
			}, {
				name : 'replytime'
			} ],
			pager : {
				page : 1,
				rows : 10
			},
			orderNum : true, //序号
			operateState : false, //是否有操作
			/* operate : [ "modify" ], //操作状态
			searchFastForm : "searchFastForm", //from表单
			searchFastBtn : "btnSearchFast", //from表单按钮
			editorUrl : "stuEditor.do",
			openState : true,
			winWidth : 650,
			winHeight : 360,
			winPos : "c",
			winTitle : "当前窗口：信息详情" */
		};
		$("#listData").loadViewList(options);
	});
</script>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">消息管理</a></li>
			<li><a href="#">未处理消息</a></li>
		</ul>
	</div>

	<div class="rightinfo">
		<%-- <div class="tools">
			<ul class="toolbar">
				<form action="" id="searchFastForm" name="searchFastForm">
					<li class="selectInput"><label style="float: left;">学号<b>:</b>&nbsp&nbsp
					</label>
						<div class="vocation">
							<input type="text" class="dfinput" name="studentId"
								id="studentId" /> <input id="studentIdBtn" type="submit"
								value="查询">
						</div></li>
			</ul>
			<ul class="toolbar1">
				<li><span><img src="${loaded}/images/t05.png" /></span>设置</li>
			</ul>
		</div> --%>

		<table id="listData" class="tablelist">
			<tbody>
			</tbody>
		</table>
		<div id="pager" class="pagin"></div>
	</div>
	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>
