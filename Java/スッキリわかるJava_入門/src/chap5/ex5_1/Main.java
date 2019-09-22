package chap5.ex5_1;

public class Main {

	public static void main(String[] args) {
		introduceOneself();
	}


	private static void introduceOneself() {
		String	name	= "Kernighan";
		int		age		= 77;
		double	height	= 1.75;
		char	gender	= '男';

		System.out.println(name);
		System.out.println(age + "歳");
		System.out.println(height + "m");
		System.out.println(gender);
	}

}
