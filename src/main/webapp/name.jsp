<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<% 
	request.setAttribute("name","최범균");
%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
 <c:out value=" 안녕하세요 "/>
 <c:forTokens var="abc" items="안녕/하세요/hunit블로그/입니다" delims="/" />
</body>
</html>