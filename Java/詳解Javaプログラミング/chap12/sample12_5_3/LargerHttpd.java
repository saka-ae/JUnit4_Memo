package chap12.sample12_5_3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class LargerHttpd {

	private Selector clientSelector;
	ClientQueue readyClients = new ClientQueue();


	public static void main(String[] args) throws IOException {
		int port		= 1234;
		int threads	= 3;

		LargerHttpd httpd = new LargerHttpd();
		httpd.run(port, threads);
	}


	public void run(int port, int threads) throws IOException {
		clientSelector = Selector.open();

		ServerSocketChannel ssc = ServerSocketChannel.open();
		ssc.configureBlocking(false);

		InetSocketAddress sa = new InetSocketAddress(InetAddress.getLocalHost(), port);
		ssc.socket().bind(sa);

		ssc.register(clientSelector, SelectionKey.OP_ACCEPT);

		for (int i=0; i < threads; i++)
			new Thread() {
				public void run() {
					while (true)
						try {
							handleClient();
						} catch (IOException e) { }
				}
			}.start();

		while (true)
			try {
				while (clientSelector.select(50) == 0)
					;

				Set<SelectionKey> readySet = clientSelector.selectedKeys();

				for (Iterator<SelectionKey> it = readySet.iterator(); it.hasNext(); ) {
					SelectionKey key = it.next();

					it.remove();

					if (key.isAcceptable())
						acceptClient(ssc);
					else {
						key.interestOps(0);
						readyClients.add(key);
					}
				}
			} catch (IOException e) {
				System.out.println(e);
			}
	}


	private void handleClient() throws IOException {
		SelectionKey key = readyClients.next();

		HttpdConnection client = (HttpdConnection) key.attachment();

		if (key.isReadable())
			client.read(key);
		else if (key.isWritable())
			client.write(key);
	}


	private void acceptClient(ServerSocketChannel ssc) throws IOException {
		SocketChannel clientSocket = ssc.accept();
		clientSocket.configureBlocking(false);

		HttpdConnection client = new HttpdConnection(clientSocket);

		SelectionKey key = clientSocket.register(clientSelector, SelectionKey.OP_READ);
		key.attach(client);
	}

}
