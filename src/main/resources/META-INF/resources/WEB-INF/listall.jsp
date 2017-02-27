<%@page import="java.util.List"%>
<%@page import="com.example.domain.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>listall.jsp</title>
<!-- 1.animate -->
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.min.css">
<!-- 2.bootstrap -->
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
<!-- 3.jquery -->
<script type="text/javascript" src="/webjars/jquery/1.11.1/jquery.min.js"></script>
<!-- 4.bootstrap.js -->
<script type="text/javascript" src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</head>
<body>
<h3 style="text-align:center;">직원리스트</h3>
<br>

<div class="container">
<table class="table table-hover">
<%List<Emp> list=(List<Emp>)request.getAttribute("emps");
	for (Emp e: list){
%>
<tr>
<td><%=e.getEmpno()%></td>
<td><%=e.getEname()%></td>
<td><%=e.getJob()%></td>
<td><%=e.getMgr()%></td>
<td><%=e.getHiredate()%></td>
<td><%=e.getSal()%></td>
<td><%=e.getComm()%></td>
<td><%=e.getDeptno()%></td>
</tr>
<%		
	}
%>
</table>
</div>
<br>
<div class="container">
<table class="table table-condensed">
<c:forEach var="e" items="${emps}">


<tr>
<td class="info">${e.empno}</td>
<td class="danger">${e.ename}</td>
<td class="success">${e.job}</td>
<td class="active">${e.mgr}</td> 
<td class="success">${e.hiredate}</td> 
<td class="danger">${e.sal}</td> 
<td class="info">${e.comm}</td> 
<td class="danger">${e.deptno}</td> 

</tr>
</c:forEach>
</table>
</div>
</body>
</html>