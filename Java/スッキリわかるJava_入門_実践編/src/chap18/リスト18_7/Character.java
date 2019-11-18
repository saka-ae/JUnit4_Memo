package chap18.リスト18_7;

public abstract class Character {

	protected String name;


	public final void introduce() {
		System.out.println(name + "自己紹介開始");

		doIntroduce();

		System.out.println("自己紹介終了");
	}


	protected abstract void doIntroduce();

}
