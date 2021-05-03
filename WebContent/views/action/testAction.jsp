<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<%@ include file="common.jsp" %> --%>
	<jsp:include page="common.jsp"/>	
	
	<!--< %@ include file="common.jsp" % > : 빌드 시에 체크함 --> 
	<%-- <jsp:include page="common.jsp"/> --%> <!-- 넣은 param 없으면 단일 태그 처리 -->
</body>
</html>