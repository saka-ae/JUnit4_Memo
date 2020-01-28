select	case タイプ	when '1' then '強制'
					when '2' then 'フリー'
					when '3' then '特殊'
		end as タイプ,
		count(イベント番号) as  イベント数
	from イベント
	group by タイプ
