package chap10_Strategy.ex10_4;

import java.util.List;

public interface Sorter {

	<T extends Comparable> void sort(List<T> dataList);

}
