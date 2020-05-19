<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate, java.time.format.DateTimeFormatter" %>

<%
String[] luckArray = { "大吉", "中吉", "小吉" };

int index = (int) (Math.random() * luckArray.length);
String luck = luckArray[index];

DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
LocalDate date = LocalDate.now();
String today = fmt.format(date);
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>占い</title>
</head>
<body>
	<p><%= today %> の運勢は<%= luck %>です</p>
</body>
</html>