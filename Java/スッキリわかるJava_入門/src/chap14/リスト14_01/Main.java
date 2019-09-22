package chap14.リスト14_01;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(start);

		for (int i=0; i < 1_000_000; i++)
			/* 空の処理 */;

		long end = System.currentTimeMillis();
		System.out.println(end);

		System.out.println("処理時間: " + (end - start));
	}

}
