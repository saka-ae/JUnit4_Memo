package chap12_Decorator.sample;

public abstract class Display {

	public void show() {
		System.out.println(this.getText());
	}


	public abstract String getText();

	public abstract int getLength();

}
