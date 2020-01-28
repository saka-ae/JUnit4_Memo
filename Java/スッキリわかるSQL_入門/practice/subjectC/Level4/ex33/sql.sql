select 名称 as なまえ, HP as 現在のHP, HP + 50 as 装備後のHP
	from パーティー
	where 職業コード in ('11', '21')
