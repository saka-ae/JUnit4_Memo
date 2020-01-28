select 名称 as なまえ, HP as 現在のHP, HP * 2 as 予想されるダメージ
	from パーティー
	where 職業コード = '11'
