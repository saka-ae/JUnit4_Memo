package chap10.リスト10_08;

import java.io.Serializable;

public class Hero implements Serializable {

	private String name;
	private int hp;
	private int mp;

	public Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	@Override
	public String toString() {
		return String.format("%s %d %d", name, hp, mp);
	}

}
