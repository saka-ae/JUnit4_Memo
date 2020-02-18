package chap12.sample12_02_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Pulse {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(12345);

		while (true) {
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

			ds.receive(packet);

			String message = new String(packet.getData());
			System.out.printf("Heartbeat from: %s - %s\n", packet.getAddress().getHostName(), message);
		}
	}

}
