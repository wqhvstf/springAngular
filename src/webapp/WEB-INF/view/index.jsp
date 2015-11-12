<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="common/common.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="AngularSpringmvcMybatis">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AngularSpringmvcMybatis App</title>
</head>
<body>
	<div class="wrapper">
		<ul class="menu">
			<li><a href="#/users">Users</a></li>
		</ul>
		<hr />
		<div ng-view></div>
	</div>
</body>
</html>