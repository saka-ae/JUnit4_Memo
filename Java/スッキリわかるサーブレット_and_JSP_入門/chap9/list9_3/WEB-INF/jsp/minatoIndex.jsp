<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap9.list9_3.model.SiteEV" %>

<%
	SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>湊くんのページ</title>
</head>
<body>
	<h1>湊くんのページにようこそ</h1>
	<p>
		<a href="/example/MinatoIndex?action=like">よいね</a>: <%= siteEV.getLike() %>人
		<a href="/example/MinatoIndex?action=dislike">よくないね</a>: <%= siteEV.getDislike() %>人
	</p>

	<h2>湊くんとは！？</h2>
	<p>...</p>
</body>
</html>