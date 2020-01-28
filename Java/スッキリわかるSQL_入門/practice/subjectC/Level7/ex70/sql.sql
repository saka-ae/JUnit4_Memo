select	前E.イベント番号,
		前E.イベント名称,
		count(前E.イベント番号) as 前提イベント数
	from イベント as E
	join イベント as 前E
		on E.前提イベント番号 = 前E.イベント番号
	group by 前E.イベント番号, 前E.イベント名称
	order by 前E.イベント番号
