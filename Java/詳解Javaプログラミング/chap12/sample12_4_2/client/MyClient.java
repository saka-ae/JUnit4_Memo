package chap12.sample12_4_2.client;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import chap12.sample12_3.protocol.MyCalculation;
import chap12.sample12_3.protocol.WorkRequest;
import chap12.sample12_4_2.server.ServerRemote;
import chap12.sample12_4_2.server.StringIterator;
import chap12.sample12_4_2.server.WorkListener;

public class MyClient extends UnicastRemoteObject implements WorkListener {

	public MyClient(String host) throws RemoteException {
		String url = "rmi://" + host + "/NiftyServer";

		try {
			ServerRemote server = (ServerRemote) Naming.lookup(url);

			System.out.println(server.getDate());

			WorkRequest work1 = new MyCalculation(2);
			System.out.println(server.execute(work1));

			StringIterator sit = server.getList();
			while (sit.hasNext())
				System.out.println(sit.next());

			WorkRequest work2 = new MyCalculation(100);
			server.asyncExecute(work2, this);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void workCompleted(WorkRequest request, Object result) throws RemoteException {
		System.out.println("Async work result = " + result);
	}


	public static void main(String[] args) throws RemoteException {
		System.setSecurityManager(new RMISecurityManager());

		String host = "localhost";

		new MyClient(host);
	}

}
