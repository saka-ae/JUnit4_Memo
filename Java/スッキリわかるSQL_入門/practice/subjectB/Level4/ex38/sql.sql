select distinct	商品区分 as 区分,
					case 商品区分	when '1' then '衣類'
									when '2' then '靴'
									when '3' then '雑貨'
									when '9' then '未分類'
					end as 区分名
	from 商品
