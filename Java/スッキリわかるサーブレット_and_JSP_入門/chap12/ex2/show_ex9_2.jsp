<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Fruit</title>
</head>
<body>
	<p>${applicationScope.fruit.name} の値段は ${applicationScope.fruit.price} 円です。</p>
</body>
</html>