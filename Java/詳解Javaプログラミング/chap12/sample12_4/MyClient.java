package chap12.sample12_4;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import chap12.sample12_3.protocol.MyCalculation;
import chap12.sample12_3.protocol.WorkRequest;

public class MyClient {

	public MyClient(String host) {
		String url = "rmi://" + host + "/NiftyServer";

		try {
			ServerRemote server = (ServerRemote) Naming.lookup(url);

			System.out.println(server.getDate());

			WorkRequest work = new MyCalculation(2);
			System.out.println(server.execute(work));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) throws RemoteException {
		String host = "localhost";

		new MyClient(host);
	}

}
