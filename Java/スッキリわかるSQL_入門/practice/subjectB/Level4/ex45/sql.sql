select	商品コード, 商品名, 単価,
		trunc(単価 * 0.7, 0) as 値下げした単価
	from 商品
	where 単価 >= 10000
