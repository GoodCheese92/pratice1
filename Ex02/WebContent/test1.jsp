<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			table{margin:5px auto;
				  border-collapse: collapse;
				  border-width: 5px;}
			caption{font:bold 30px "hy헤드라인m", sans-serif;
			   		color:blue;}
			th{background:#ffff8f;}
			td{text-align: center;}
			.ex03 table{border-top: 5px black solid;
						border-bottom: 5px black solid;}
			.ex03 th{border-bottom: 2px black solid;}
			.ex03 tr:nth-child(3){border-bottom: 2px black solid;}
			.ex03 h1{text-align:center;}
			.ex03 a{display: block;
					text-align: center;}	
		</style>
	</head>
	<body>
		<table border='1'>
			<caption>회원목록</caption>
			<tr>
				<th>회원번호</th>
				<th>아이디</th>
				<th>이름</th>
				<th>등급</th>
				<th>포인트</th>
			</tr>
			<tr>
				<td>1</td>
				<td>jack</td>
				<td>잭</td>
				<td>vip</td>
				<td>5000</td>
			</tr>
			<tr>
				<td>1</td>
				<td>jack</td>
				<td>잭</td>
				<td>vip</td>
				<td>5000</td>
			</tr>
			<tr>
				<td>2</td>
				<td>scott</td>
				<td>스캇</td>
				<td>gold</td>
				<td>4000</td>
			</tr>
			<tr>
				<td>3</td>
				<td>wolf</td>
				<td>울프</td>
				<td>bronze</td>
				<td>1000</td>
			</tr>
			<tr>
				<td>4</td>
				<td>eagle</td>
				<td>이글</td>
				<td>silver</td>
				<td>3500</td>
			</tr>
			<tr>
				<td>5</td>
				<td>prodo</td>
				<td>프로도</td>
				<td>gold</td>
				<td>4500</td>
			</tr>
		</table>
		
		<div>
		<table>
			<tr>
				<td><h2>회원 관리 프로그램</h2><td>
			</tr>
			<tr>
				<td colspan='2'><input placeholder="아이디"><td>
			</tr>
			<tr>
				<td colspan='2'><input placeholder="이름"><td>
			</tr>
			<tr>
				<td><input type="button" value="로그인">
				<a href="#">회원가입</a></td>
			</tr>
		</table>
		</div>
		
		<div class='ex03'>
			<h1>회원 관리 시스템</h1>
			<a href="#">로그아웃</a><br>
			<hr>
			<table>
				<tr>
					<th>아이디</th>
					<th>이름</th>
					<th>등급</th>
					<th>포인트</th>
				</tr>
				<tr>
					<td>scott</td>
					<td><input value="스캇"></td>
					<td>gold</td>
					<td><input value="4000"></td>
				</tr>
				<tr>
					<td colspan='4'>
						<input type='button' value="수정하기">
						<input type='button' value="탈퇴하기">
					</td>
				</tr>
			</table>
		</div>
		<hr>
		<div class='ex04'>
		<table>
			<caption>회원 가입 폼</caption>
			<tr>
				<th>아이디</th>
				<td><input></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input></td>
			</tr>
			<tr>
				<td colspan='2'>
					<input type='button' value='회원가입'>
					<input type='button' value='돌아가기'>
				</td>
			</tr>
		</table>
		</div>
		<hr>
		<h1>가입되었습니다.</h1>
		<a href=#>로그인</a>
	</body>
</html>