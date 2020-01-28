select	名称 as なまえ,
		HP as 現在のHP,
		round( cast(HP as numeric) / (select sum(HP) from パーティー) * 100, 1) as パーティーでの割合
	from パーティー
	where 職業コード = '01'
