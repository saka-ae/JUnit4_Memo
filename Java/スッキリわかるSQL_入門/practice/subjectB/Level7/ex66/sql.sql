select	注文日,
		商品.商品コード || ':' || 商品名 as 商品,
		coalesce(数量, 0) as 数量
	from 商品
	left join 注文
		on 商品.商品コード = 注文.商品コード
	where 商品区分 = '3'
