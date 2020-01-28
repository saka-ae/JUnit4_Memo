select	名称 as なまえ, HP, 状態コード,
		case	when HP < 50					then 3
				when HP between 51 and 100		then 2
				when HP between 101 and 150	then 1
				else 0
		end + cast(状態コード as integer) as リスク値
	from パーティー
	order by リスク値 desc, HP
