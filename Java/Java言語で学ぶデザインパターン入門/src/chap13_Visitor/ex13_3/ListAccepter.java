package chap13_Visitor.ex13_3;

import java.util.ArrayList;

import chap13_Visitor.ex13_2.Acceptor;
import chap13_Visitor.ex13_2.Entry;
import chap13_Visitor.ex13_2.Visitor;

public class ListAccepter extends ArrayList<Entry> implements Acceptor {

	@Override
	public void accept(Visitor visitor) {
		for (Entry entry : this)
			entry.accept(visitor);
	}

}
