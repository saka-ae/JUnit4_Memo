<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap8.list8_3.model.User" %>

<%
	User registerUser = (User) session.getAttribute("registerUser");
%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ユーザー登録</title>
</head>
<body>
	<pre>
下記のユーザーを登録します

ログインID:
  <%= registerUser.getId() %>
名前:
  <%= registerUser.getName() %>
	</pre>

	<a href="/example/RegisterUser">戻る</a>
	<a href="/example/RegisterUser?action=done">登録</a>
</body>
</html>