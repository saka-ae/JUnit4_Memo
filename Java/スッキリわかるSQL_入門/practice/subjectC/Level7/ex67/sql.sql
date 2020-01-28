select	イベント番号,
		クリア区分,
		コード値 || ':' || コード名称 as クリア結果
	from 経験イベント
	full join	(
		select コード値, コード名称
			from コード
			where コード種別 = 4
			) as クリア結果
		on コード値 = クリア結果
