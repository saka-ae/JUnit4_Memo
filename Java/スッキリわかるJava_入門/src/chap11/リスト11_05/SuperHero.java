package chap11.リスト11_05;

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


	@Override
	public void run() {
		System.out.println("撤退した");
	}

}
