insert into 廃止口座
	select 口座番号, 名義, 種別, 残高, CURRENT_DATE
		from 口座
		where 口座番号 = '2761055'
;

delete from 口座
	where 口座番号 = '2761055'
