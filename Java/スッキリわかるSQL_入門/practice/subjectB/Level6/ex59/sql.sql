select	販売集計.販売数 as 割引による販売数,
		trunc(販売集計.合計割引額 / 販売集計.販売数, 0) as 平均割引額
	from	(
		select sum(数量) as 販売数, sum(クーポン割引料) as 合計割引額
			from 注文
			where	商品コード = 'W0746'
				and	クーポン割引料 is not null
			) as 販売集計
