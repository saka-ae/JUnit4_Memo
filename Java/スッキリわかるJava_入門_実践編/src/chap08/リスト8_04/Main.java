package chap08.リスト8_04;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("001", 100);
		System.out.printf("%s hashCode: %d\n", bank, bank.hashCode());
	}

}
