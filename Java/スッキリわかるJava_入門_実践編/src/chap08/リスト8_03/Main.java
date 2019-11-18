package chap08.リスト8_03;

public class Main {

	public static void main(String[] args) {
		Bank bank1 = new Bank("001", 100);
		Bank bank2 = new Bank("001", 100);
		System.out.printf("%s equals %s is %b\n", bank1, bank2, bank1.equals(bank2));
		
		Bank bank3 = new Bank("001", 103);
		System.out.printf("%s equals %s is %b\n", bank1, bank3, bank1.equals(bank3));
	}

}
