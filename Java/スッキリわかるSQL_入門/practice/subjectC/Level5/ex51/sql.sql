select	substring(ID, 1, 1) as パーティー, avg(HP) as 平均HP, avg(MP) as 平均MP
	from パーティー
	group by substring(ID, 1, 1)
	having avg(HP) > 100
