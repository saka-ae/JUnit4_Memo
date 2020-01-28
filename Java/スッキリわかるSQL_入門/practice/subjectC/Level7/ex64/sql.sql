select	イベント.イベント番号, イベント名称,
		coalesce(クリア区分, '未クリア') as クリア区分
	from イベント
	left join 経験イベント
		on 経験イベント.イベント番号 = イベント.イベント番号
	where タイプ = '1'
