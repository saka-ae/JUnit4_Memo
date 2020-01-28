select	取引番号,
		cast(取引事由.取引事由ID as varchar) || ':' || 取引事由.取引事由名 as 取引事由,
		日付, 口座番号, 入金額, 出金額
	from 取引
	right join 取引事由
		on 取引.取引事由ID = 取引事由.取引事由ID
