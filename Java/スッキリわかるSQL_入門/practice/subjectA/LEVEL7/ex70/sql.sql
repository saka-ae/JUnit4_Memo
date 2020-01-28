select distinct	coalesce(取引.取引事由ID, 取引事由.取引事由ID),
					取引事由名
	from 取引
	full join 取引事由
		on 取引.取引事由ID = 取引事由.取引事由ID
