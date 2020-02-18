package chap7.sample7_01_03_1;

public class Main {

	public static void main(String[] args) {
		Sheep sheep = new Sheep();

		Sheep another = (Sheep) sheep.clone();
	}

}
