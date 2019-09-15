package chap5_Singleton.sample;

public class Singleton {
	private static Singleton _singleton = new Singleton();


	private Singleton() {
		System.out.println("コンストラクタを実行");
	}


	public static Singleton getInstance() {
		return _singleton;
	}

}
