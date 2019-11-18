package chap04.リスト4_08;

public class Hero implements Cloneable {

	private String name;
	private int hp;

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public Hero clone() {
		Hero result = new Hero();

		result.setName(name);
		result.setHp(hp);

		return result;
	}

}
