update 経験イベント
	set	クリア区分 = '1',
		クリア結果 = 'B',
		ルート番号 =	(
			select max(ルート番号)
				from 経験イベント
						) + 1
	where イベント番号 = 9
;

insert into 経験イベント (イベント番号, クリア区分)
	values (
		(
			select 後続イベント番号
				from イベント
				where イベント番号 = 9
		),
		'0'
	)
