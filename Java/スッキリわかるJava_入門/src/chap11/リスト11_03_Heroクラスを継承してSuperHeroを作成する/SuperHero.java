package chap11.リスト11_03_Heroクラスを継承してSuperHeroを作成する;

import chap11.リスト11_01_戦うと逃げるしかできないHeroクラス.Hero;

public class SuperHero extends Hero {
	private boolean _flying;


	public void fly() {
		_flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		_flying = false;
		System.out.println("着地した！");
	}

}
