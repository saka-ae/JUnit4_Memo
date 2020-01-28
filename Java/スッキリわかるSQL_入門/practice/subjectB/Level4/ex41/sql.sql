select	注文日,
		SUBSTRING(注文番号, 9, 4) as 注文番号
	from 注文
