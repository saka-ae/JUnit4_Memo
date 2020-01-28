select 商品区分, min(単価) as 最少額, max(単価) as 最高額
	from 商品
	group by 商品区分
	order by 商品区分
