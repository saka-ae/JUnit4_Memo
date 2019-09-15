package chap13_Visitor.sample;

import java.util.Iterator;

public class ListVisitor implements Visitor {

	@Override
	public void visit(StringList acceptor) {

		for (Iterator<String> it = acceptor.iterator(); it.hasNext(); ) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}

}
