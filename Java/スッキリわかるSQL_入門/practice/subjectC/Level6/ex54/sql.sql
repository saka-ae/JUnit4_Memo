update パーティー
	set MP = MP + round(
		(
			select sum(MP)
				from パーティー
				where 職業コード <> '20'
		) * 0.1, 0)
	where 職業コード = '20'
;

update パーティー
	set MP = MP +
		(
			select round(sum(MP) * 0.1, 0)
				from パーティー
				where 職業コード <> '20'
		)
	where 職業コード = '20'
