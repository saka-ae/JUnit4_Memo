package chap12_Decorator.ex12_2;

public abstract class MultiDisplay {

	public void show() {
		for (int i=0; i < getRows(); i++) {
			String text = getRowText(i);
			System.out.println(text);
		}
	}


	public abstract String getRowText(int row);

	public abstract int getColumns();

	public abstract int getRows();

}
