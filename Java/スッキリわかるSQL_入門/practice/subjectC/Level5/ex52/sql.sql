select sum(
			case	when HP < 100	then 1
					when HP >= 100 and HP < 150	then 2
					when HP >= 150 and HP < 200	then 3
					when HP >= 200				then 5
			end
		) as 扉の数
	from パーティー
