select 名称, MP
	from パーティー
	where MP = (
		select max(MP)
			from パーティー
				)
