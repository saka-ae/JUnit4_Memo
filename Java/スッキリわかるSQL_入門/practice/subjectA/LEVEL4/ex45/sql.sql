select	口座番号, 残高,
		case	when 残高 < 500000 then TRUNC(残高 * 0.0001, 0)
				when 残高 < 2000000 then TRUNC(残高 * 0.0002, 0)
				else TRUNC(残高 * 0.0003, 0)
		end as 残高別利息
	from 口座
	order by 残高別利息 desc, 口座番号
;
