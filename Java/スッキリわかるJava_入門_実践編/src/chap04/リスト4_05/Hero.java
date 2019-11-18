package chap04.リスト4_05;

public class Hero {

	private String name;
	private int hp;

	@Override
	public int hashCode() {
		int result = 37;

		int num = 31;
		result = result * num + name.hashCode();
		result = result * num + hp;

		return result;
	}

}
