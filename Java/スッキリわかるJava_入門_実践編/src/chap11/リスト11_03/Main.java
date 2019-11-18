package chap11.リスト11_03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("起動完了");

		int port = 39648;
		ServerSocket serverSocket = new ServerSocket(port);

		Socket socket = serverSocket.accept();

		System.out.println(socket.getInetAddress() + "から接続");

		OutputStream os	= socket.getOutputStream();

		String message	= "Welcome";

		os.write(message.getBytes());
		os.flush();

		socket.close();
		serverSocket.close();
	}

}
