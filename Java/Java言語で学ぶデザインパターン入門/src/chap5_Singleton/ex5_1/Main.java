package chap5_Singleton.ex5_1;

public class Main {

	public static void main(String[] args) {
		TicketMaker ticket1 = TicketMaker.getInstance();

		for (int i=0; i < 3; i++)
			System.out.println(ticket1.getNextTicketNumber());


		TicketMaker ticket2 = TicketMaker.getInstance();

		System.out.println(ticket2.getNextTicketNumber());
	}
}
