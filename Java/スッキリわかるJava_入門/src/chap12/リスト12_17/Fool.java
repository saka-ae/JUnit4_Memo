package chap12.リスト12_17;

import chap12.リスト12_08.Character;
import chap12.リスト12_08.Matango;
import chap12.リスト12_16.Human;

public class Fool extends Character implements Human {

	// Character
	@Override
	public void attack(Matango m) {
		System.out.println(super.getName() + "は、戦わず遊んでいる。");
	}


	// Human
	@Override
	public void run() { }

	@Override
	public void talk() { }

	@Override
	public void watch() { }

	@Override
	public void hear() { }

}
