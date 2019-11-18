package chap05.ex5_2;

public enum KeyType {

	PADLOCK(1_024), BUTTON(10_000), DIAL(30_000), FINGER(1_000_000);

	private int 必要施行回数;

	KeyType(int 必要施行回数) {
		this.必要施行回数 = 必要施行回数;
	}

	public int get必要施行回数() {
		return 必要施行回数;
	}

}
