select 商品名, length(商品名) as 文字数
	from 商品
	where length(商品名) > 10
	order by length(商品名)
