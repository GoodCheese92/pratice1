<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>화면설계</title>
		
		<link rel='stylesheet' href='css/display.css'>	
		
		<script src="js/ex01_javascript.js"> </script>
	</head>
	<body>
		<div class="entire_div">
			<div class="menuBar">
				<ul>
					<li><a href='#'><img src='image/home.png'></a></li>
					<li><a href='#'><img src='image/coffee.png'></a></li>
					<li><a href='#'><img src='image/AD.png'></a></li>
					<li><a href='#'><img src='image/print.jpg'></a></li>
					<li><a href='#'><img src='image/AS.png'></a></li>
				</ul>
			</div>
			<div class='content'>
				<div class="header1">
					<img src='image/background.png'>
				</div>
				<div class="content_menu">
					<ul>
						<li class='li1'><a href="#">HOME</a></li>
						<li><a href="#">COFFEE</a></li>
						<li><a href="#">CF</a></li>
						<li><a href="#">PRINT</a></li>
						<li><a href="#">문의하기</a></li>
					</ul>
				</div>
				
				<form>
				<div>
					<table border='1' class='question'>
						<caption>제품 문의하기</caption>
						<tr>
							<th>제목</th>
							<td><input name="title"></td>
						</tr>
						<tr>
							<th>작성자</th>
							<td><input name="writer"></td>
						</tr>
						<tr>
							<th>답변받을 이메일</th>
							<td><input name="email1">@
								<input name="email2">
							</td>
						</tr>
						<tr>
							<th>문의내용</th>
							<td><input class='qInput' name="qna_contents"></td>
						</tr>
						<tr>
							<td colspan='2'>
								<input type='button' value="문의하기" onclick="send(this.form);">
								<input type='button' value="초기화">
							</td>
						</tr>
						</form>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>