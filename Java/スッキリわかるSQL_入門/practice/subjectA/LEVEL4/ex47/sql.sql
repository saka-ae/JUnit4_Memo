select	口座番号, 名義, 種別, 残高,
		substring( cast(更新日 as varchar), 1, 4)
		|| '年'
		|| substring( cast(更新日 as varchar), 6, 2)
		|| '月'
		|| substring( cast(更新日 as varchar), 9, 2)
		|| '日'
		as 更新日
	from 口座
	where 更新日 >= '2013-01-01'
