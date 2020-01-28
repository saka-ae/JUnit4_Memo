select 商品コード, sum(数量) as 数量合計
	from 注文
	group by 商品コード
	order by 商品コード
