update 商品
	set 商品コード = replace(商品コード, 'M', 'E')
;

update 商品
	set 商品コード = 'E' || substring(商品コード, 2, 4)
	where substring(商品コード, 1, 1) = 'M'
