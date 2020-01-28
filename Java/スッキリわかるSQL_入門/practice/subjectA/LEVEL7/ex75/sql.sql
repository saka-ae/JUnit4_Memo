select 口座.名義, 口座番号, 種別, 残高, 更新日
	from 口座
	where	名義 in
		(
			select 名義
				from 口座
				group by 名義
				having count(*) > 1
		)
	order by 口座.名義, 口座番号
