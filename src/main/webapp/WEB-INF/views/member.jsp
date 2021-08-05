<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${login3.membername }님 안녕하세요 </h1>
	<a href="list.do">list</a>
	<a href="mypage.do?memberno=${login3.memberno} ">회원정보 보기</a>
	<a href="#">로그아웃</a>
	
</body>
</html>