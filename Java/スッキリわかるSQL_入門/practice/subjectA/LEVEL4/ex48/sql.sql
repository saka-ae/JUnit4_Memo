select	case	when 更新日 is null then '設定なし'
				else cast(更新日 as varchar)
		end as 更新日
	from 口座
;

SELECT COALESCE (cast(更新日 as varchar), '設定なし') AS 更新日
	FROM 口座
;
