package chap12.sample12_4;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;

import chap12.sample12_3.protocol.WorkRequest;

public class MyServer extends UnicastRemoteObject implements ServerRemote {

	public MyServer() throws RemoteException { }


	@Override
	public LocalDate getDate() throws RemoteException {
		return LocalDate.now();
	}

	@Override
	public Object execute(WorkRequest work) throws RemoteException {
		return work.execute();
	}


	public static void main(String[] args) {
		try {
			ServerRemote server = new MyServer();

			Naming.rebind("NiftyServer", server);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
