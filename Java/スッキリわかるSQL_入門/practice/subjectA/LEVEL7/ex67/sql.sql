select distinct 取引.口座番号, 名義, 残高
	from 取引
	join 口座
		on 取引.口座番号 = 口座.口座番号
	where	日付 = '2011-03-01'
		and	取引.口座番号 not in	(
										select distinct 口座番号
											from 廃止口座
									)
;

select distinct 取引.口座番号, 名義, 残高
	from 取引
	join 口座
		on 取引.口座番号 = 口座.口座番号
	where	日付 = '2011-03-01'
