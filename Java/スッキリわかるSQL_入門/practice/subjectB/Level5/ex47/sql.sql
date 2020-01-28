select 注文日, sum(数量) as 数量合計
	from 注文
	group by 注文日
	order by 注文日
