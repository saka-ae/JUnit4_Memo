select *
	from 口座
	where	名義 like 'カワ%'
		or	名義 like '_カワ%'
		or	名義 like '__カワ%'
		or	名義 like '___カワ%'
;

select *
	from 口座
	where substring(名義, 1, 5) like '%カワ%'
;
