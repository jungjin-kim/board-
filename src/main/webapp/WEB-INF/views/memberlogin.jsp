<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		$("#loginChk").hide();
	});
	
	function login(){
		var memberid = $("#memberid").val().trim();
		var memberpw = $("#memberpw").val().trim();
		
		var loginVal = {
				// 자바스크립트 object, 리터럴객체
				"memberid": memberid,
				"memberpw": memberpw
		}
		
		if (memberid == null || memberid == "" || memberpw == null || memberpw == ""){
			alert("ID와 PW를 다시 확인해주세요!!")
		} else {
			$.ajax({
				type: "post",
				url: "ajaxlogin.do",
				// data속성 : controller로 전달하는 값 -> 문자열!! (JSON형태의 문자열로 보낸다)
				// request
				data: JSON.stringify(loginVal),
				// contentType : request의 헤더에 담겨져서 넘어가는 값
				// application을 통해서 넘어가는데, 얘는 json이야!
				contentType: "application/json",
				dataType:"json",
				success: function(msg){
					if (msg.check == true) {
						location.href="member.do";
					} else {
						$("#loginChk").show();
						$("#loginChk").html("ID 혹은 PW를 다시 확인해주세요!");
					}
				},
				error: function(){
					alert("통신실패");
				}
			});
		}
	}

</script>
</head>
<body>

	<table border="1">
		<tr>
			<th>ID</th>
			<td><input type="text" id="memberid" /></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="password" id="memberpw" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="login" onclick="login();" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center" id="loginChk"></td>
		</tr>
	</table>

</body>
</html>