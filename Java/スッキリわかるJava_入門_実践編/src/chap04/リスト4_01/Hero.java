package chap04.リスト4_01;

public class Hero {

	private String name;
	private int hp;
	private int mp;

	@Override
	public String toString() {
		return String.format("名前=%s / HP=%d / MP=%d", name, hp, mp);
	}

}
