package chap20_Flyweight.ex20_2;

import java.util.Random;

import chap20_Flyweight.ex20_1.JapaneseNumberString;

public class Main {
	private static final int NUM_STRING	= 1000;
	private static final int UPPER			= 100;


	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(UPPER + 1);
		String numStr = String.valueOf(num);

		// unshared
		System.out.print("unshared used memory: ");
		testAllocation(numStr, false);

		// shared
		System.out.print("shared used memory: ");
		testAllocation(numStr, true);
	}


	private static void testAllocation(String numStr, boolean shared) {
		JapaneseNumberString[] jnsArray = new JapaneseNumberString[NUM_STRING];

		for (int i=0; i < jnsArray.length; i++) {
			jnsArray[i] = new JapaneseNumberString(numStr, shared);
		}

		long usedMemory = computeUsedMemory();
		System.out.println(usedMemory);
	}

	private static long computeUsedMemory() {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();

		long total	= runtime.totalMemory();
		long free	= runtime.freeMemory();

		return total - free;
	}

}
