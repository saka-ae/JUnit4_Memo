package chap12.sample12_3;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) throws IOException {
		int port = 1234;
		ServerSocket ss = new ServerSocket(port);

		Runnable conn = new ServerConnection(ss.accept());
		new Thread(conn).start();
	}

}
