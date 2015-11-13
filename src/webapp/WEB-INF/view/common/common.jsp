<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>

<!-- 添加bootstrap -->
<link rel="stylesheet" href="${ctx}/static/bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${ctx}/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${ctx}/static/css/app.css">

<!-- jquery -->
<script type="text/javascript" src="${ctx}/static/jquery/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx}/static/angular/angular.min.js"></script>
<script type="text/javascript" src="${ctx}/static/angular/angular-route.min.js"></script>


<script type="text/javascript" src="${ctx}/static/js/app.js"></script>
<script type="text/javascript" src="${ctx}/static/js/controllers/controllers.js"></script>
<script type="text/javascript" src="${ctx}/static/js/directives/directives.js"></script>
<script type="text/javascript" src="${ctx}/static/js/filters/filters.js"></script>
<script type="text/javascript" src="${ctx}/static/js/services/services.js"></script>