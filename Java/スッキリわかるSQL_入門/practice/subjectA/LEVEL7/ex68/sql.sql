select distinct	取引.口座番号,
					case	when 取引.口座番号 in (select 口座番号 from 廃止口座) then '解約済み'
							else 口座.名義
					end as 名義,
					case	when 取引.口座番号 in (select 口座番号 from 廃止口座) then 0
							else 残高
					end as 残高
	from 取引
	left join 口座
		on 取引.口座番号 = 口座.口座番号
	left join 廃止口座
		on 取引.口座番号 = 廃止口座.口座番号
	where	日付 = '2011-03-01'
;

select distinct 取引.口座番号, coalesce(名義, '解約済み') , coalesce(残高, 0)
	from 取引
	left join 口座
		on 取引.口座番号 = 口座.口座番号
	where	日付 = '2011-03-01'
