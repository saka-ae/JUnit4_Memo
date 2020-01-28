select イベント番号, イベント名称
	from イベント
	where イベント番号 not in	(
		select distinct イベント番号
			from 経験イベント
							)
	order by イベント番号