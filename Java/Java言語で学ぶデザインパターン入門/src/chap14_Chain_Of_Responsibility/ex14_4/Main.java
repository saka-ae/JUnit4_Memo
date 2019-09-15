package chap14_Chain_Of_Responsibility.ex14_4;

import static chap14_Chain_Of_Responsibility.sample.TroubleLevel.*;

import chap14_Chain_Of_Responsibility.sample.Trouble;

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
