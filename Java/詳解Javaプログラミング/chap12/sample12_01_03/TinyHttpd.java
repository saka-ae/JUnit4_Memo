package chap12.sample12_01_03;

import java.io.IOException;
import java.net.ServerSocket;

public class TinyHttpd {

	public static void main(String[] args) throws IOException {
		int port = 1234;
		ServerSocket ss = new ServerSocket(port);

		while (true) {
			Runnable runnable = new TinyHttpdConnection(ss.accept());

			new Thread(runnable).start();
		}
	}

}
