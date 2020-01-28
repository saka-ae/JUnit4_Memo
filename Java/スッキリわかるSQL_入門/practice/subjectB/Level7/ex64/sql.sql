select distinct 注文.商品コード, 商品名
	from 注文
	join 商品
		on 注文.商品コード = 商品.商品コード
	where	注文日 >= '2011-08-01'
		and	注文日 < '2011-09-01'
