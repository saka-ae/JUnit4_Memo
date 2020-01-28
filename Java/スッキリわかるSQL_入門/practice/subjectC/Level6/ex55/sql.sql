select 経験イベント.イベント番号, クリア結果
	from 経験イベント
	join イベント
		on 経験イベント.イベント番号 = イベント.イベント番号
	where	クリア区分 = '1'
		and	タイプ in ('1', '3')
;

select イベント番号, クリア結果
	from 経験イベント
	where	クリア区分 = '1'
		and	イベント番号 in (
			select イベント番号 from イベント where タイプ in ('1', '3')
							)
