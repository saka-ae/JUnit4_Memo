select	口座番号, 日付, 取引事由名,
		case	when 入金額 > 0 then 入金額
				when 出金額 > 0 then 出金額
		end as 取引金額
	from 取引
	join 取引事由
		on	取引.取引事由ID = 取引事由.取引事由ID
	where 口座番号 in ('0311240', '1234161', '2750902')
	order by 口座番号, 取引番号
;

select	口座番号, 日付, 取引事由名,
		coalesce(入金額, 出金額) as 取引金額
	from 取引
	join 取引事由
		on	取引.取引事由ID = 取引事由.取引事由ID
	where 口座番号 in ('0311240', '1234161', '2750902')
	order by 口座番号, 取引番号
