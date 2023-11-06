<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>您已经登录成功！欢迎:${ existUser.username }</h1>
<a href="${ pageContext.request.contextPath }/jsp/sub.jsp">提交数据</a>
</body>
</html>