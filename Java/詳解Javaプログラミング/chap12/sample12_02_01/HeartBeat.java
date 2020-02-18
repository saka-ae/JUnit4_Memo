package chap12.sample12_02_01;

import java.applet.Applet;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class HeartBeat extends Applet {

	private String myHost;
	private int myPort;


	@Override
	public void init() {
		myHost	= getCodeBase().getHost();
		myPort	= Integer.parseInt(getParameter("myPort"));
	}

	@Override
	public void start() {
		sendMessage("Arrived");
	}

	@Override
	public void stop() {
		sendMessage("Departed");
	}


	private void sendMessage(String message) {
		byte[] data = message.getBytes();

		try (DatagramSocket ds = new DatagramSocket()) {
			InetAddress address = InetAddress.getByName(myHost);
			DatagramPacket packet = new DatagramPacket(data, data.length, address, myPort);

			ds.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
