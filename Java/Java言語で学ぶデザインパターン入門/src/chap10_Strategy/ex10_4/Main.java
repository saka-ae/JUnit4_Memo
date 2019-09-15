package chap10_Strategy.ex10_4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("d", "b", "c", "e", "a");

		Sorter sorter = new InsertionSorter();
		Sort sort = new Sort(sorter);

		printList(list);

		sort.sort(list);
		printList(list);


		Sorter reverseSorter = new Reverse();
		Sort reverseSort = new Sort(reverseSorter);

		reverseSort.sort(list);
		printList(list);
	}


	private static void printList(List<String> list) {
		for (String str : list)
			System.out.print(str + " ");
		System.out.println();
	}

}
