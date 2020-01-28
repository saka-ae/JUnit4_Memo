select	商品コード
	from 注文
	where 商品コード like 'Z%'
	group by 商品コード
	having sum(数量) >= 100
