<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원가입</h1>
	<form action="registerres.do" method="post">
		<table border="1">
			<tr>
				<th>ID</th>
				<td><input type="text" name="memberid" /></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="text" name="memberpw" /></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><input type="text" name="membername" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" name="회원가입" />
					<input type="button" name="취소" onclick="location.href=''" />
				</td>
			</tr>
		</table>
	</form>
		
</body>
</html>