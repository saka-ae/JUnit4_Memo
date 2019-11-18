package chap04.リスト4_09;

public class Hero implements Cloneable {

	private String name;
	private Sword sword;

	public Hero(String name, Sword sword) {
		this.name = name;
		this.sword = sword;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sword getSword() {
		return sword;
	}

	@Override
	public String toString() {
		return name + " / " + sword.getName();
	}

	@Override
	public Hero clone() {
		return new Hero(name, sword);
	}

}
