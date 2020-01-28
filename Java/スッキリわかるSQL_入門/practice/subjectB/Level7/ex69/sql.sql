select	商品.商品コード, 商品名, 単価, coalesce(数量, 0),
		単価 * coalesce(数量, 0) as 総売上金額
	from 商品
	left join	(
		select 商品コード, sum(数量) as 数量
			from 注文
			group by 商品コード
			) as 注文数量
		on 商品.商品コード = 注文数量.商品コード
	where 商品.商品コード like 'B%'
	order by 商品コード
