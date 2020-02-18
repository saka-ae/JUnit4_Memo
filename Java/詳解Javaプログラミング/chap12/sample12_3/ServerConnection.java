package chap12.sample12_3;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.time.LocalDate;

import chap12.sample12_3.protocol.DateRequest;
import chap12.sample12_3.protocol.WorkRequest;

public class ServerConnection implements Runnable {

	private Socket client;


	public ServerConnection(Socket client) throws SocketException {
		this.client = client;
	}


	@Override
	public void run() {
		try {
			ObjectInputStream ois	= new ObjectInputStream(client.getInputStream());
			ObjectOutputStream oos	= new ObjectOutputStream(client.getOutputStream());

			while (true) {
				oos.writeObject(processRequest(ois.readObject()));
				oos.flush();
			}
		} catch (EOFException e) {
			try {
				client.close();
			} catch (IOException ex) { }
		} catch (IOException e) {
			System.err.println("I/O error " + e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}


	private Object processRequest(Object request) {
		if (request instanceof DateRequest)
			return LocalDate.now();
		else if (request instanceof WorkRequest) {
			WorkRequest workRequest = (WorkRequest) request;

			return workRequest.execute();
		} else
			return null;
	}

}
