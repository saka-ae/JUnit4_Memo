select 口座番号, 名義, 残高
	from 口座
	where 口座番号 in
		(
			select distinct 口座番号
				from 取引
				where 入金額 >= 1000000
		)
