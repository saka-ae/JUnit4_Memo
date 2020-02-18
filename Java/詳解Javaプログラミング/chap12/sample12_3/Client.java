package chap12.sample12_3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import chap12.sample12_3.protocol.DateRequest;
import chap12.sample12_3.protocol.MyCalculation;

public class Client {

	public static void main(String[] args) {
		String host = "localhost";
		int port = 1234;

		try (Socket server = new Socket(host, port)) {
			ObjectOutputStream oos	= new ObjectOutputStream(server.getOutputStream());
			ObjectInputStream ois	= new ObjectInputStream(server.getInputStream());

			oos.writeObject(new DateRequest());
			oos.flush();
			System.out.println(ois.readObject());

			oos.writeObject(new MyCalculation(2));
			oos.flush();
			System.out.println(ois.readObject());
		} catch (IOException e) {
			System.err.println("I/O error " + e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}

}
