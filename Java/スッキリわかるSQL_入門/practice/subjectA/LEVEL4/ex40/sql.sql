select 口座番号, 名義,
		CASE	WHEN 残高 < 100000	then 'C'
				WHEN 残高 < 1000000 then 'B'
				else 'A'
		end as 残高ランク
	from 口座
