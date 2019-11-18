package chap11.リスト11_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		String str = "google.com";
		int port = 80;

		Socket socket = new Socket(str, port);
		OutputStream os	= socket.getOutputStream();

		String newLine	= "\r\n";
		String request	= "GET /index.html HTTP/1.0" + newLine;

		os.write(request.getBytes());
		os.write(newLine.getBytes());
		os.flush();

		InputStream is	= socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);

		for (int i = isr.read(); i != -1; i = isr.read()) {
			char ch = (char) i;
			System.out.print(ch);
		}

		socket.close();
	}

}
