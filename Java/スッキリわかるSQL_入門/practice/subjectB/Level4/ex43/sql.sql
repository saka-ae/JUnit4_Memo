select substring(注文番号, 9, 4) as 注文番号
	from 注文
	where substring(注文番号, 9, 4) between '1000' and '2000'
	order by substring(注文番号, 9, 4)
