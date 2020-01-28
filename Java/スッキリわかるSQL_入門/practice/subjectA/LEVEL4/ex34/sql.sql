SELECT 口座番号, 残高 / 1000 AS 千円単位の残高
	FROM 口座
	WHERE 残高 >= 1000000