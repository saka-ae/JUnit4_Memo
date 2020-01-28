select case	when sum(MP) < 500						then '敵は見とれている！'
				when sum(MP) >= 500 and sum(MP) < 1000	then '敵は呆然としている！'
				when sum(MP) >= 1000					then '敵はひれ伏している！'
		end as 敵の行動
	from パーティー
