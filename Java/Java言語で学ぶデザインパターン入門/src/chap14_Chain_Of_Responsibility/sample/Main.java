package chap14_Chain_Of_Responsibility.sample;

import static chap14_Chain_Of_Responsibility.sample.TroubleLevel.*;

public class Main {

	public static void main(String[] args) {
		Support normalSupport	= new NormalSupport("Normal support");

		Support chain			= new EasySupport("Easy support");
		chain.setNext(normalSupport);

		Trouble easy	= new Trouble(Easy);
		chain.support(easy);
		System.out.println();

		Trouble normal	= new Trouble(Normal);
		chain.support(normal);
		System.out.println();

		Trouble hard	= new Trouble(Hard);
		chain.support(hard);
	}

}
