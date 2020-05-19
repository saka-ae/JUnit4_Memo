<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap10.list10_1.model.User" %>
<%@ page import="chap10.list10_1.model.Mutter" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>

<%
	User loginUser = (User) session.getAttribute("loginUser");
	List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
	String errorMsg = (String) request.getAttribute("errorMsg");
%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>どこつぶ</title>
</head>
<body>
	<h1>どこつぶメイン</h1>
	<p>
		<%= loginUser.getName() %> さん、ログイン中
		<a href="/docoTsubu/Logout">ログアウト</a>
	</p>
	<p><a href="/docoTsubu/Main">更新</a>
	<form action="/docoTsubu/Main" method="post">
		<input type="text" name="text">
		<input type="submit" value="つぶやく">
	</form>

	<% if (Objects.nonNull(errorMsg)) { %>
		<p><%= errorMsg %>
	<% } %>

	<% for (Mutter mutter : mutterList) { %>
		<p><%= mutter.getUserName() %>:<%= mutter.getText() %></p>
	<% } %>
</body>
</html>