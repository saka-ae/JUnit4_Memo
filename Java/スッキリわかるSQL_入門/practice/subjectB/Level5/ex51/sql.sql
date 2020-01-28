select 商品コード, sum(数量) as 販売した数量
	from 注文
	group by 商品コード
	having sum(数量) < 5
