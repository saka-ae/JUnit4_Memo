select *
	from 口座
	where		length( cast(残高 as varchar) ) >= 4
		and		cast(残高 as varchar) like '%000'
;