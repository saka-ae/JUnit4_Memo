package chap12.sample12_5_3;

import java.nio.channels.SelectionKey;
import java.util.ArrayList;

public class ClientQueue extends ArrayList<SelectionKey> {

	public synchronized boolean add(SelectionKey key) {
		boolean result = super.add(key);

		notify();

		return result;
	}

	public SelectionKey next() {
		while(isEmpty())
			try {
				wait();
			} catch (InterruptedException e) { }

		return remove(0);
	}

}
