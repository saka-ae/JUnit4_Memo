package chap12.リスト12_08;

public abstract class Character {
	private String	_name;
	private int	_hp;


	public String getName() {
		return _name;
	}


	public void run() {
		System.out.println(_name + "は逃げ出した。");
	}


	public abstract void attack(Matango m);

}
