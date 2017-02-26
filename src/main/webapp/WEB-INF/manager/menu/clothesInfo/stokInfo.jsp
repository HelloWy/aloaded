<%@page import="com.pumpkin.aloaded.entry.PageParam"%>
<%@page import="com.pumpkin.aloaded.dao.model.Clothes_information"%>
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
<title>被装信息查看</title>
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
			viewUrl : "stokInfo.do",
			colNames : [ "服装名称", "数量" ],
			colModels : [ 
			{
				name : 'clothesname'
			}, {
				name : 'clothesnum'
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
			editorUrl : "stokEditor.do",
			editorFrom : true, //判断是否是多个表进行的editor弹框
			openState : true,
			winWidth : 650,
			winHeight : 360,
			winPos : "c",
			winTitle : "当前窗口：服装信息编辑"
		};
		$("#listData").loadViewList(options);
	});
</script>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">被装信息管理</a></li>
			<li><a href="#">库存信息</a></li>
		</ul>
	</div>

	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<!--<li class="click"><span><img src="../../images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="../../images/t02.png" /></span>修改</li>
            <li><span><img src="../../images/t03.png" /></span>删除</li>
            <li><span><img src="../../images/t04.png" /></span>统计</li>-->
				<form action="" id="searchFastForm" name="searchFastForm">
					<li class="selectInput"><label style="float: left;">性别<b>:</b>&nbsp&nbsp
					</label>
						<div class="vocation">
							<select class="select1" id="sex" name="sex">
								<option>男</option>
								<option>女</option>
							</select>
						</div></li>
					<li class="selectInput"><label style="float: left;">被装类型<b>:</b>&nbsp&nbsp
					</label>
						<div class="vocation">
							<select id="clothestype" name="clothestype" class="select1">
								<%-- ${'female'==queryParam.sex?'selected':''} --%>
								<option value="1">帽子</option>
								<option value="2">上衣</option>
								<option value="3">下裤</option>
								<option value="4">大衣</option>
								<option value="5">鞋子</option>
								<option value="6">杂物</option>
								<option value="7">配饰</option>
							</select>
						</div></li>
				</form>
				<li><input style="margin: 10px 0 0 5px;'" id="btnSearchFast"
					name="btnSearchFast" type="submit" value="查询"></li>

				<!-- 				<form action="" id ="studentIdFrom" name = "studentIdFrom">
					<li class="selectInput"><label style="float: left;">学号<b>:</b>&nbsp&nbsp
					</label>
						<div class="vocation">
							<input type="text" class="dfinput" name="studentId"
								id="studentId" /> <input id="studentIdBtn" type="submit" value="查询">
						</div></li>
				</form> -->
			</ul>
			<ul class="toolbar1">
				<li><span><img src="${loaded}/images/t05.png" /></span>设置</li>
			</ul>
		</div>

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
