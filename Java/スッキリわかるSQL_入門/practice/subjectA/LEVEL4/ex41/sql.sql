select length(口座番号), length( replace(名義, ' ', '') ), length(cast( 残高 as varchar) )
	from 口座
