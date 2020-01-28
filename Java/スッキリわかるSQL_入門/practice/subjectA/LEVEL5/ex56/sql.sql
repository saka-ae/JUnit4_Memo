select	coalesce(substring( cast(更新日 as varchar), 1, 4), 'XXXX') as 更新年,
		sum(残高) as 合計,
		max(残高) as 最大,
		min(残高) as 最小,
		avg(残高) as 平均,
		count(*) as 件数
	from 口座
	group by 更新年
