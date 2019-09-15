package chap5_Singleton.ex5_2;

public class Main {

	public static void main(String[] args) {
		Triple obj0 = Triple.getInstance(0);
		System.out.println(obj0.getId());

		for (int i=0; i < 3; i++) {
			Triple obj = Triple.getInstance(i);
			System.out.println(obj.getId());
		}
	}

}
