select イベント番号, イベント名称
	from イベント
	where イベント番号 < all	(
		select イベント番号
			from 経験イベント
			where ルート番号 = 5
								)