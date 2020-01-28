select *
	from 口座
	where 更新日  > all
		(
			select 日付
				from 取引
		)
