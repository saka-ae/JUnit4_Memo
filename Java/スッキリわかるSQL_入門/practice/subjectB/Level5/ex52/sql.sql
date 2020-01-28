select	count(クーポン割引料) as 割引件数,
		sum(クーポン割引料) as 割引額合計
	from 注文
