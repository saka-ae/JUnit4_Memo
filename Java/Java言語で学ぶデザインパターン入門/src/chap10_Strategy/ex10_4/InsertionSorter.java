package chap10_Strategy.ex10_4;

import java.util.Collections;
import java.util.List;

public class InsertionSorter implements Sorter {

	@Override
	public <T extends Comparable> void sort(List<T> dataList) {
		for (int i=0; i < dataList.size(); i++)
			for (int j = i + 1; j < dataList.size(); j++)
				if (dataList.get(i).compareTo(dataList.get(j)) > 0)
					Collections.swap(dataList, i, j);
	}

}
