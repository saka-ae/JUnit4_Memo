select	coalesce( cast(前提イベント番号 as varchar), '前提なし') as 前提イベント番号,
		イベント番号,
		coalesce( cast(後続イベント番号 as varchar), '後続なし') as 後続イベント番号
	from イベント
	order by イベント番号
