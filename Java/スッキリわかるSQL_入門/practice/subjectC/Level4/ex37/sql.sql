select	イベント番号, イベント名称,
		case タイプ	when '1' then '強制'
					when '2' then 'フリー'
					when '3' then '特殊'
		end as タイプ,
		case	when イベント番号 between 1 and 10		then '序盤'
				when イベント番号 between 11 and 17	then '中盤'
				else '終盤'
		end as 発生時期
	from イベント
