select 口座.口座番号, 名義, 残高, 日付, 入金額, 出金額
	from 口座
	join 取引
		on 口座.口座番号 = 取引.口座番号
	where 口座.口座番号 = '0887132'
	order by 取引番号
