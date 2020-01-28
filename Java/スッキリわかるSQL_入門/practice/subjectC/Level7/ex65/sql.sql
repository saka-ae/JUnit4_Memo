select	ID, 名称 as なまえ,
		職業コード.コード名称 as 職業,
		状態コード.コード名称 as 状態
	from パーティー
	join コード as 職業コード
		on		職業コード.コード種別 = 1
			and	職業コード.コード値 = パーティー.職業コード
	join コード as 状態コード
		on		状態コード.コード種別 = 2
			and	状態コード.コード値 = パーティー.状態コード
	order by ID
;

select	ID, 名称 as なまえ,
		職業コード.コード名称 as 職業,
		状態コード.コード名称 as 状態
	from パーティー
	join	(
		select コード値, コード名称
			from コード
			where コード種別 = 1
			) as 職業コード
		on 職業コード.コード値 = パーティー.職業コード
	join	(
		select コード値, コード名称
			from コード
			where コード種別 = 2
			) as 状態コード
		on 状態コード.コード値 = パーティー.状態コード
	order by ID
