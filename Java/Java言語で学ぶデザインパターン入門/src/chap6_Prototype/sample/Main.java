package chap6_Prototype.sample;

import chap6_Prototype.sample.framework.Manager;
import chap6_Prototype.sample.framework.Product;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();

		UnderlinePen upen = new UnderlinePen('~');
		manager.register("underline",	upen);

		MessageBox mbox	 = new MessageBox('*');
		manager.register("message box",	mbox);


		String str = "Hello world!";

		Product underlinePen = manager.create("underline");
		underlinePen.use(str);

		Product messageBox = manager.create("message box");
		messageBox.use(str);
	}

}
