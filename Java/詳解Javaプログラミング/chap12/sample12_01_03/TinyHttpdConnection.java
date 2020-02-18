package chap12.sample12_01_03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TinyHttpdConnection implements Runnable {

	private Socket client;


	public TinyHttpdConnection(Socket client) throws SocketException {
		this.client = client;
	}


	@Override
	public void run() {
		try (
				InputStream is			= client.getInputStream();
				InputStreamReader isr	= new InputStreamReader(is, "utf-8");
				BufferedReader br		= new BufferedReader(isr);

				OutputStream os			= client.getOutputStream();
				OutputStreamWriter osw	= new OutputStreamWriter(os, "utf-8");
				PrintWriter pw			= new PrintWriter(osw, true);
		) {
			String request  = br.readLine();
			System.out.println("Request: " + request);

			if (!isCorrectRequest(request))
				pw.println("400 Bad Request");
			else {
				String fileName = extractFileName(request);
				System.out.println("fileName: " + fileName);

				try {
					writeResponse(fileName, os);
				} catch (FileNotFoundException e) {
					pw.println("404 Object Not Found");
				} catch (SecurityException e) {
					pw.println("403 Forbidden");
				}
			}

			client.close();
		} catch (IOException e) {
			System.out.println("I/O error " + e);
		}
	}


	private boolean isCorrectRequest(String request) {
		return request.matches("GET .*");
	}

	private String extractFileName(String request) {
		Matcher matcher = Pattern.compile("GET /?(\\S*).*").matcher(request);
		matcher.find();
		String fileName = matcher.group(1);

		return (fileName.endsWith("/") || fileName.equals("")) ? fileName + "index.html" : fileName;
	}

	private void writeResponse(String fileName, OutputStream os) throws IOException {
		try(FileInputStream fis = new FileInputStream(fileName)) {
			byte[] data = new byte[64 * 1024];

			for (int read; (read = fis.read(data)) > -1; )
				os.write(data, 0, read);

			os.flush();
		}
	}

}
