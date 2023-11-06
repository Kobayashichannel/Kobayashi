<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>demo2.jsp</h1>
<% System.out.println("demo2.jsp执行了...");%>
<jsp:forward page="/filter/demo3.jsp"></jsp:forward>
</body>
</html>