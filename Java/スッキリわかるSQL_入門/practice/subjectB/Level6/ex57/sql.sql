select 注文日, 商品コード
	from 注文
	where 商品コード in	(
		select 商品コード
			from 商品
			where 商品名 like '%あったか%'
							)
	order by 注文日
