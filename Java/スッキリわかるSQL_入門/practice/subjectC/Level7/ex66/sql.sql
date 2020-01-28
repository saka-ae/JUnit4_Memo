select	ID,
		coalesce(名称, '仲間になっていない！') as なまえ,
		コード名称 as 職業
	from パーティー
	right join	(
		select コード値, コード名称
			from コード
			where コード種別 = 1
				) as 職業コード
		on 職業コード.コード値 = 職業コード
