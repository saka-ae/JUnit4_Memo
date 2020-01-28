select	商品コード,商品名, 単価,
		case	when 単価 < 3000	then 'S'
				when 単価 < 10000	then 'M'
				when 単価 >= 10000	then 'L'
		end as 販売価格ランク,
		case 商品区分	when '1' then 商品区分 || ':' || '衣類'
						when '2' then 商品区分 || ':' || '靴'
						when '3' then 商品区分 || ':' || '雑貨'
						when '9' then 商品区分 || ':' || '未分類'
		end as 商品区分
	from 商品
	order by 単価, 商品コード
;

select	商品コード,商品名, 単価,
		case	when 単価 < 3000	then 'S'
				when 単価 < 10000	then 'M'
				when 単価 >= 10000	then 'L'
		end as 販売価格ランク,
		商品区分 || ':' ||
			case 商品区分	when '1' then '衣類'
							when '2' then '靴'
							when '3' then '雑貨'
							when '9' then '未分類'
			end as 商品区分
	from 商品
	order by 単価, 商品コード
