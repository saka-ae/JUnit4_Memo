package chap11.ex11_2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		String server = "smtp.example.com";
		int port = 60025;

		try (Socket socket = new Socket(server, port)) {
			OutputStream os	= socket.getOutputStream();

			String newLine			= "\r\n";
			String serverName		= "example.com";
			String fromAddress		= "asaka@example.com";
			String toAddress		= "minato@example.com";
			String title			= "Please send me your RPG";
			String request			= "GET /index.html HTTP/1.0" + newLine;

			String str1	= "Hello minato. I would like to play your RPG.";
			String str2 = "Could you please send it to me ? ";
			String[] text = { str1, str2 };

			os.write(("HELO "		+ serverName	+ newLine).getBytes());
			os.write(("MAIL FROM: "	+ fromAddress	+ newLine).getBytes());
			os.write(("RCPT TO: "	+ toAddress		+ newLine).getBytes());
			os.write(("DATA"						+ newLine).getBytes());
			os.write(("From: "		+ fromAddress	+ newLine).getBytes());
			os.write(("Subject: "	+ title			+ newLine).getBytes());

			for (String str : text)
				os.write(("str"		+ title			+ newLine).getBytes());

			os.write(("."							+ newLine).getBytes());
			os.write(("QUIT"						+ newLine).getBytes());

			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
