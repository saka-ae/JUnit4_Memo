select 取引口座.口座番号, 取引口座.回数, 名義
	from	(
				select 口座番号, count(*) as 回数
				 from 取引
				 group by 日付, 口座番号
				 having count(*) >= 3
			) as 取引口座
	join 口座
		on 取引口座.口座番号 = 口座.口座番号
