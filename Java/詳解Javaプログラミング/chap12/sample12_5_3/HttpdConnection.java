package chap12.sample12_5_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpdConnection {

	private static Charset charset = Charset.forName("8859_1");
	private static Pattern httpGetPattern = Pattern.compile("(?s)GET /?(\\S*).*");

	private SocketChannel clientSocket;
	private ByteBuffer buff = ByteBuffer.allocateDirect(64 * 1024);
	private String request;
	private String response;
	private FileChannel fc;
	private long filePosition;


	public HttpdConnection(SocketChannel clientSocket) {
		this.clientSocket = clientSocket;
	}


	public void read(SelectionKey key) throws IOException {
		if (request == null && (clientSocket.read(buff) == -1 || buff.get(buff.position() - 1) == '\n'))
			processRequest(key);
		else
			key.interestOps(SelectionKey.OP_READ);
	}


	private void processRequest(SelectionKey key) {
		buff.flip();

		request = charset.decode(buff).toString();

		Matcher get = httpGetPattern.matcher(request);
		if (get.matches()) {
			String fileName = get.group(1);

			if (fileName.endsWith("/") || fileName.equals(""))
				fileName += "index.html";

			try (FileInputStream fis = new FileInputStream(request)){
				fc = fis.getChannel();
			} catch (FileNotFoundException e) {
				response = "404 Object Not Found";
			} catch (IOException e) { }
		} else
			response = "400 Bad Request";

		if (response != null) {
			buff.clear();

			charset.newEncoder().encode(CharBuffer.wrap(response), buff, true);

			buff.flip();
		}

		key.interestOps(SelectionKey.OP_WRITE);
	}


	public void write(SelectionKey key) throws IOException {
		if (response != null) {
			clientSocket.write(buff);

			if (buff.remaining() == 0)
				response = null;
		} else if (fc != null) {
			long remaining = fc.size() - filePosition;
			long got = fc.transferTo(filePosition, remaining, clientSocket);

			if (got == -1 || remaining <= 0) {
				fc.close();
				fc = null;
			} else
				filePosition += got;
		}

		if (response == null && fc == null) {
			clientSocket.close();

			key.cancel();
		} else
			key.interestOps(SelectionKey.OP_WRITE);
	}

}
