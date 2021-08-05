<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${login2.memberid }님 회원정보수정</h1>
	<form action="memberupdateres.do" method="post">
		<input type="hidden" name="memberno" value="${login2.memberno }" />
		<table border="1">
			<tr>
				<th>작성자</th>
				<td>${login2.memberid }</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="memberpw" value="${login2.memberpw }" /></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="membername" value="${membername }" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="수정" />
					<input type="button" value="취소" onclick="location.href='mypage.do?memberno=${login2.memberno}'" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>