package chap5_Singleton.ex5_1;

public class TicketMaker {
	private static TicketMaker _singleton = new TicketMaker();
	private int _ticketNumber = 0;


	private TicketMaker() {}


	public static TicketMaker getInstance() {
		return _singleton;
	}


	public int getNextTicketNumber() {
		int ticketNumber = _ticketNumber;
		_ticketNumber++;

		return ticketNumber;
	}

}
