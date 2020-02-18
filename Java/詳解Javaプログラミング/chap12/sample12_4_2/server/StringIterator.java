package chap12.sample12_4_2.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringIterator extends Remote {

	boolean hasNext() throws RemoteException;

	String next() throws RemoteException;

}
