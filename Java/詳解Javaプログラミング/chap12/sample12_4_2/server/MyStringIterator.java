package chap12.sample12_4_2.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyStringIterator extends UnicastRemoteObject implements StringIterator {

	private String[] list;
	private int index;


	public MyStringIterator(String[] list) throws RemoteException {
		this.list = list;
	}


	@Override
	public boolean hasNext() throws RemoteException {
		return index < list.length;
	}

	@Override
	public String next() throws RemoteException {
		return list[index++];
	}

}
