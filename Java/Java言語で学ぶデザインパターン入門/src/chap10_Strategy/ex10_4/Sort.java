package chap10_Strategy.ex10_4;

import java.util.List;

public class Sort {
	private Sorter _sorter;


	public Sort(Sorter sorter) {
		_sorter = sorter;
	}


	public <T extends Comparable> void sort(List<T> dataList) {
		_sorter.sort(dataList);
	}

}
