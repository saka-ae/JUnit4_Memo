select	substring(職業コード, 1, 1) as 職業タイプ,
		max(HP) as 最小HP, min(HP) as 最小HP, avg(HP) as 平均HP,
		max(MP) as 最小MP, min(MP) as 最小MP, avg(MP) as 平均MP
	from パーティー
	group by substring(職業コード, 1, 1)
