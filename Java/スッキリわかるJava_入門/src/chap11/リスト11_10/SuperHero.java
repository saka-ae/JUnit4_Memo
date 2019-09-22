package chap11.リスト11_10;


public class SuperHero extends Hero {
	private boolean _flying;


	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタ");
	}


	public void fly() {
		_flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		_flying = false;
		System.out.println("着地した！");
	}

	@Override
	public void run() {
		System.out.println("撤退した");
	}


	@Override
	public void attack(Matango m) {
		super.attack(m);

		if (_flying)
			super.attack(m);
	}

}
