select クリア結果, count(イベント番号) as イベント数
	from 経験イベント
	where クリア区分 = '1'
	group by クリア結果
	order by クリア結果
