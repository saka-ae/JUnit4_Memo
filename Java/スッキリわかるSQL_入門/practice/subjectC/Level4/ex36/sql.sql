select	名称 as なまえ,
		cast(HP as varchar) || '/' || cast(MP as varchar) as HPとMP,
		case 状態コード	when '00' then ''
						when '01' then '眠り'
						when '02' then '毒'
						when '03' then '沈黙'
						when '04' then '混乱'
						when '09' then '気絶'
		end as ステータス
	from パーティー
