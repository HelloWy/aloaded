<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=path%>/js/dialog/default/ymPrompt.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="<%=path%>/js/jquery.js"></script>
<script src="<%=path%>/js/dialog/ymPrompt.js" type="text/javascript"></script>
<script src="<%=path%>/js/wyjquery/login.js" type="text/javascript"></script>

<title>被装管理后台</title>

</head>
<frameset rows="88,*" cols="*" frameborder="no" border="0"
	framespacing="0">
	<frame src="<%=path%>/frame/utop.do" name="topFrame" scrolling="no"
		noresize="noresize" id="topFrame" title="topFrame" />
	<frameset id="mainFrame" cols="187,*" frameborder="no" border="0"
		framespacing="0">
		<frame src="<%=path%>/frame/uleft.do" name="leftFrame" scrolling="no"
			noresize="noresize" id="leftFrame" title="leftFrame" />
		<frame src="<%=path%>/uNotice/notice.do" name="rightFrame"
			id="rightFrame" title="rightFrame" />
	</frameset>
</frameset>
<noframes>
	<body>
	</body>
</noframes>
</html>
