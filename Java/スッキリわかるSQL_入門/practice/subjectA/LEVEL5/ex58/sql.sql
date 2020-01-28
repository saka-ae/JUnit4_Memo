select	substring(名義, 1, 1) as イニシャル,
		count(*) as 件数,
		avg( length(名義) - 1) as 平均
	from 口座
	group by イニシャル
	having	count(*) >= 10
		or	avg( length(名義) - 1) > 5
;

select	substring(名義, 1, 1) as イニシャル,
		count(*) as 件数,
		avg( length( replace(名義, '　', '') ) ) as 平均
	from 口座
	group by イニシャル
	having	count(*) >= 10
		or	avg( length( replace(名義, '　', '') ) ) > 5
