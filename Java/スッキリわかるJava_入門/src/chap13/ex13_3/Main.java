package chap13.ex13_3;

public class Main {

	public static void main(String[] args) {
		Y[] array = { new A(), new B() };
		
		for (Y y : array)
			y.b();
	}
	
}
