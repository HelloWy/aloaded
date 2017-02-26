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
<title>公告栏列表</title>
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
			viewUrl : "noticeList.do",
			colNames : [ "发布时间", "标题", "发布内容", "发布人" ],
			colModels : [ {
				name : 'createtime'
			}, {
				name : 'title'
			}, {
				name : 'announcement'
			}, {
				name : 'createname'
			} ],
			pager : {
				page : 1,
				rows : 10
			},
			orderNum : true, //序号
			operateState : true, //是否有操作
			operate : [ "modify" ], //操作状态
			searchFastForm : "searchFastForm", //from表单
			searchFastBtn : "btnSearchFast", //from表单按钮
			openState : true,
			editorUrl : "naticeEditor.do",
			winWidth : 650,
			winHeight : 360,
			winPos : "c",
			winTitle : "当前窗口：公告详情"
		};
		$("#listData").loadViewList(options);
	});
</script>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#"></a></li>
			<li><a href="#">公告栏</a></li>
		</ul>
	</div>

	<div class="xline"></div>
	<div class="box"></div>
	<div class="welinfo">
		<span><img src="${loaded }/images/sun.png" alt="提醒" /></span> <b>公告栏</b>
	</div>
	<ul class="infolist">
		<li><h1>标题：${natice.title }</h1></li>
		<li><h1>内容：${natice.announcement }</h1></li>
		<li><h1>发布时间：${natice.createtime }</h1></li>
		<li><h1>发布人：${natice.createname }</h1></li>
	</ul>
	<div class="xline"></div>
	<div class="box"></div>
	<div class="welinfo">
		<span><img src="${loaded }/images/dp.png" alt="提醒" /></span> <b>历史公告列表</b>
	</div>
	<div class="rightinfo">
		<%-- <div class="tools">
			<ul class="toolbar" style="width: auto; float: left;">
				<li class="click" id="btnAdd" name="btnAdd"><span><img src="${loaded }/images/t01.png" /></span>添加</li>

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
