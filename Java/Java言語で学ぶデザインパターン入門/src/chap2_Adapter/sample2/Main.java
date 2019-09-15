package chap2_Adapter.sample2;

import chap2_Adapter.sample1.Print;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}

}
