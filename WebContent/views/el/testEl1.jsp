<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>전달된 request 객체에서 저장된 정보 출력하기</h2>
<%-- 	<%
		String name = (String) request.getAttribute("name");
		int age = (Integer)	request.getAttribute("age");
		String phone = (String) request.getAttribute("phone");
	
	%>
	
	name : <%= name %>
	age : <%= age %>
	phone : <%= phone %> --%>

	<!-- el 표현식으로 출력 확인 -->	
	<!-- requestScope뿐만 아니라 sessionScope 등도 사용 가능 -->
<%--
	name : ${ sessionScope.name } <br> 	
	name : ${ requestScope.name } <br> 
	age : ${ requestScope.age } <br>
	phone : ${ requestScope.phone } <br>
 --%>
 
 	<!-- 스코프 범위 생략 가능하다(알아서 찾아온다 : page > request > session > application) -->
    name : ${ name } <br>
    age : ${ age } <br>
    phone : ${ phone } <br>
    
    <br>
    
    <!-- 꼭 해봐야 하는 부분 -->
    <h2>items 이름으로 저장된 리스트 정보 출력하기</h2>
    <!-- 방법 1 -->
    <%
    	ArrayList<String> items = (ArrayList<String>)request.getAttribute("items");
    %>
    
    <%
    	for(int i =0; i < items.size(); i++) { %>
    		<%= i %> : <%= items.get(i) %><br> <!-- 이 부분이 테이블의 <td> -->
    		
    <%  } %>
    
    <!-- 방법 2-1. -->
    0 : ${ requestScope.items[0] }<br>
    1 : ${ requestScope.items[1] }<br>
    2 : ${ requestScope.items[2] }<br>
    
    <!-- 방법 2-2 -->
    0 : ${ items[0] }<br>
    1 : ${ items[1] }<br>
    2 : ${ items[2] }<br>
    
    
</body>
</html>