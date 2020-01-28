select イベント番号, イベント名称, 前提イベント番号
	from イベント
	where 前提イベント番号 in	(
		select イベント番号
			from 経験イベント
			where クリア区分 = '1'
								)
