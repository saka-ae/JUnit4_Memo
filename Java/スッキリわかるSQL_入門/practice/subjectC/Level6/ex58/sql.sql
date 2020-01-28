select count(イベント番号) as 未着手イベント数
	from イベント
	where イベント番号 not in	(
		select distinct イベント番号
			from 経験イベント
							)
