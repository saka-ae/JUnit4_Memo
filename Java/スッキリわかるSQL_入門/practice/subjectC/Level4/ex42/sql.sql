select	名称 as なまえ, HP,
		power(HP, 0) as 攻撃1回目,
		power(HP, 1) as 攻撃2回目,
		power(HP, 2) as 攻撃3回目
	from パーティー
	where 職業コード = '10'
