package chap12.sample12_4_2.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;

import chap12.sample12_3.protocol.WorkRequest;

public interface ServerRemote extends Remote {

	LocalDate getDate() throws RemoteException;

	Object execute(WorkRequest work) throws RemoteException;

	StringIterator getList() throws RemoteException;

	void asyncExecute(WorkRequest work, WorkListener listener) throws RemoteException;

}
