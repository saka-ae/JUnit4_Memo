select 口座番号, 残高, TRUNC(残高 * 0.0002, 0) as 利息
	from 口座
	order by 残高 desc
;