select	注文日, 注文番号, 注文枝番, 注文.商品コード,
		coalesce(商品.商品名, 廃番商品.商品名) as 商品名,
		coalesce(商品.単価, 廃番商品.単価) as 単価,
		数量,
		coalesce(商品.単価, 廃番商品.単価) * 数量 - coalesce(クーポン割引料, 0) as 注文金額
	from 注文
	left join 商品
		on	注文.商品コード = 商品.商品コード
	left join 廃番商品
		on	注文.商品コード = 廃番商品.商品コード
	where 注文番号 = '201204030010'
