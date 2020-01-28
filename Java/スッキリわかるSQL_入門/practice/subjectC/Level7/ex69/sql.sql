select	E.イベント番号, E.イベント名称,
		E.前提イベント番号, 前E.イベント名称 as 前提イベント名称,
		E.後続イベント番号, 後E.イベント名称 as 後続イベント名称
	from イベント as E
	left join イベント as 前E
		on E.前提イベント番号 = 前E.イベント番号
	left join イベント as 後E
		on E.後続イベント番号 = 後E.イベント番号
	where	E.前提イベント番号 is not null
		or	E.後続イベント番号 is not null
