package chap8.sample8_03_01_2;

public class SpreadSheet {

	private int cellA1;
	private int cellA2;

	public synchronized int sumRow() {
		return cellA1 + cellA2;
	}

	public synchronized void setRow(int a1, int a2) {
		cellA1 = a1;
		cellA2 = a2;
	}

}
