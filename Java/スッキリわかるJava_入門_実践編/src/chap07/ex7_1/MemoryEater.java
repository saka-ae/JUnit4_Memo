package chap07.ex7_1;

public class MemoryEater {

	public static void main(String[] args) {
		long[] array = new long[1_280_000];

		for (int i=0; i < array.length; i++)
			array[i] = i;
	}

}
