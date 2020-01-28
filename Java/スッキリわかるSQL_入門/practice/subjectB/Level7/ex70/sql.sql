select	K1.商品コード, K1.商品名, K1.関連商品コード,
		K2.商品名 as 関連商品名
	from 商品
	join 商品 as K1
		on 商品.関連商品コード = K1.商品コード
	join 商品 as K2
		on K1.関連商品コード = K2.商品コード
