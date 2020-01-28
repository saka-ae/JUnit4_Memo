select	case クリア区分	when '0' then '参加したがクリアしていない'
						when '1' then 'クリアした'
		end as 区分,
		count(イベント番号) as イベント数
	from 経験イベント
	group by クリア区分
	order by 区分
