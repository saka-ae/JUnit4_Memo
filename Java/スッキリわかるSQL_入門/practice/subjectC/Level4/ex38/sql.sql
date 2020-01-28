select	名称 as 名前,
		HP as 現在のHP,
		length(名称) * 10 as 予想ダメージ
	from パーティー
