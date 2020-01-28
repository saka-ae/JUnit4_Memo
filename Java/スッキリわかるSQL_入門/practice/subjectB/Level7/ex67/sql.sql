select	注文日,
		商品.商品コード || ':' || coalesce(商品名, '（廃番済み）') as 商品,
		coalesce(数量, 0) as 数量
	from 注文
	full join 商品
		on 注文.商品コード = 商品.商品コード
	where 商品区分 = '3'
