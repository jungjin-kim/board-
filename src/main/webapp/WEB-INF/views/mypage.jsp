<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>MYPAGE</h1>
		<table border="1">
			<tr>
				<th>작성자</th>
				<td>${login2.memberid }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${login2.membername }</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="button" value="수정" onclick="location.href='memberupdateform.do?memberno=${login2.memberno}'" />
					<input type="button" value="탈퇴" onclick="location.href='memberdelete.do?memberno=${login2.memberno}'" />
					<input type="button" value="취소" onclick="location.href='member.do?memberid=${login2.memberid}'" />
				</td>
			</tr>
		</table>
	
</body>
</html>