<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>안녕하세요? common.jsp 입니다!!</h1>
	
	<h1>여기서부터 내용입니다.</h1>
	
	<% request.setAttribute("name", "홍길동"); %>
	<jsp:forward page="testForward.jsp"/>
</body>
</html>