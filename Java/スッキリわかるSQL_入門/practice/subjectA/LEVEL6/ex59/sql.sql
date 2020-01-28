update 口座
	set	残高 = 残高
				+	(
						select sum(入金額)
						from 取引
						where	口座番号 = '0351333'
							and 日付 = '2013-01-11'
					)
				- 	(
						select sum(出金額)
						from 取引
						where	口座番号 = '0351333'
							and 日付 = '2013-01-11'
					),
		更新日 = '2013-01-11'
	where 口座番号 = '0351333'
;

update 口座
	set	残高 = 残高
				+	(
						select sum(入金額) - sum(出金額)
						from 取引
						where	口座番号 = '0351333'
							and 日付 = '2013-01-11'
					),
		更新日 = '2013-01-11'
	where 口座番号 = '0351333'
