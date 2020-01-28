select 商品コード, sum(数量) as 販売した数量
	from 注文
	group by 商品コード
	order by sum(数量) desc, 商品コード
	limit 10
