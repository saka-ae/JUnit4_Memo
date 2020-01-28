select	substring( cast(注文日 as varchar), 1,4) || substring( cast(注文日 as varchar), 6,2) as 年月,
		count(注文枝番) as 注文件数
	from 注文
	group by substring( cast(注文日 as varchar), 1,4) || substring( cast(注文日 as varchar), 6,2)
	order by substring( cast(注文日 as varchar), 1,4) || substring( cast(注文日 as varchar), 6,2)
;

select	substring(注文番号, 1,6) as 年月,
		count(注文枝番) as 注文件数
	from 注文
	group by substring(注文番号, 1,6)
	order by substring(注文番号, 1,6)
