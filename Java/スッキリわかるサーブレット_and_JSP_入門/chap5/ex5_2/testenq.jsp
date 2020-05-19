<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8");

    String name		= request.getParameter("name");
    String qtype	= request.getParameter("qtype");
    String body		= request.getParameter("body");
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>問い合わせ内容</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>名前</th>
			<th>お問い合わせの種類</th>
			<th>お問い合わせ内容</th>
		</tr>
		<tr>
			<td><%= name %></td>
			<td><%= qtype %></td>
			<td><%= body %></td>
		</tr>
	</table>
</body>
</html>