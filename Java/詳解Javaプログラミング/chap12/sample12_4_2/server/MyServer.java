package chap12.sample12_4_2.server;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
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


	@Override
	public StringIterator getList() throws RemoteException {
		String[] list = { "Foo", "Bar", "Gee" };

		return new MyStringIterator(list);
	}

	@Override
	public void asyncExecute(WorkRequest request, WorkListener listener) throws RemoteException {
		Object result = request.execute();

		listener.workCompleted(request, result);
	}


	public static void main(String[] args) {
		System.setSecurityManager(new RMISecurityManager());

		try {
			ServerRemote server = new MyServer();

			Naming.rebind("NiftyServer", server);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
