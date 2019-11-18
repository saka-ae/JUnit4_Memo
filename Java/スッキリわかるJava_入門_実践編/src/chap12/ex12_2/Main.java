package chap12.ex12_2;

import java.util.List;

import chap12.ex12_1.Item;

public class Main {

	public static void main(String[] args) {
		int lower = 1;

		System.out.println(lower + "円以上のアイテム一覧表");
		List<Item> items = ItemsDAO.findByMinimumPrice(1);

		for (Item item : items) {
			System.out.println(item);
		}
	}

}
