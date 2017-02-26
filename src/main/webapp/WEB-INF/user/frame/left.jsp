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
<title>无标题文档</title>
<link href="${loaded }/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${loaded }/js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active")
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	})
</script>


</head>

<body style="background: #f0f9fd;">
	<div class="lefttop">
		<span></span>导航栏
	</div>

	<dl class="leftmenu">
		<dd>

			<a href="${loaded }/uNotice/notice.do" target="rightFrame">
				<div class="title">
					<span><img src="${loaded }/images/leftico04.png" /></span>公告栏
				</div>
			</a>

		</dd>
		<dd>
			<a href="${loaded }/uCenter/center.do" target="rightFrame">
				<div class="title">
					<span><img src="${loaded }/images/leftico03.png" /></span>个人中心
				</div>
			</a>
		</dd>
		<dd>
			<a href="${loaded }/uMsgBoard/msg.do" target="rightFrame">
				<div class="title">
					<span><img src="${loaded }/images/leftico02.png" /></span>被装调换申请
				</div>
			</a>
		</dd>
		<dd>
			<a href="${loaded }/uSpeak/speak.do" target="rightFrame">
				<div class="title">
					<span><img src="${loaded }/images/leftico04.png" /></span>个人留言管理
				</div>
			</a>
		</dd>
		<dd>
			<a href="${loaded }/uSpeak/allSpeak.do" target="rightFrame">
				<div class="title">
					<span><img src="${loaded }/images/leftico04.png" /></span>留言板
				</div>
			</a>
		</dd>
	</dl>
</body>
</html>