select distinct	注文.商品コード,
					case	when 商品.商品コード is null then '廃番'
							else 商品.商品名
					end as 商品名
	from 注文
	left join 商品
		on 注文.商品コード = 商品.商品コード
	left join 廃番商品
		on 注文.商品コード = 廃番商品.商品コード
	where	注文日 >= '2011-08-01'
		and	注文日 < '2011-09-01'
;

select distinct	注文.商品コード, coalesce(商品名, '廃番') as 商品名
	from 注文
	left join 商品
		on 注文.商品コード = 商品.商品コード
	where	注文日 >= '2011-08-01'
		and	注文日 < '2011-09-01'
