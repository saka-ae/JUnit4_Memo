package chap2_Adapter.sample1;

public class Banner {
	private String _str;


	public Banner(String str) {
		_str = str;
	}


	public void showWithParen() {
		System.out.println("(" + _str + ")");
	}

	public void showWithAster() {
		System.out.println("*" + _str + "*");
	}

}
