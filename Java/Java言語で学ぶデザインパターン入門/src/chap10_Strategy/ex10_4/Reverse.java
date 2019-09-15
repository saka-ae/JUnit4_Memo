package chap10_Strategy.ex10_4;

import java.util.Collections;
import java.util.List;

public class Reverse implements Sorter {

	@Override
	public <T extends Comparable> void sort(List<T> dataList) {
		Collections.reverse(dataList);
	}

}
