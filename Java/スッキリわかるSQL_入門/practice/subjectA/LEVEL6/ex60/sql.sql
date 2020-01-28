select	残高,
		(
			select sum(入金額)
				from 取引
				where	口座番号 = '1115600'
				and 日付 = '2012-12-28'
		) as 入金額合計,
		(
			select sum(出金額)
				from 取引
				where	口座番号 = '1115600'
				and 日付 = '2012-12-28'
		) as 出金額合計
	from 口座
	where 口座番号 = '1115600'
