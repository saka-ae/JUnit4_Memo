package chap8.リスト8_07_眠る操作に含まれる要素を記述;

public class Hero {

	private String	_name;
	private int	_hp;


	public void sleep() {
		_hp = 100;
		System.out.println(_name + "は、眠って回復した！");
	}

}
