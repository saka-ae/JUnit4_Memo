package chap3.sample3_03_01;

import java.net.Socket;

public class EvilEmpire {

	public static void main(String[] args) throws Exception {
		try {
			Socket s = new Socket("207.46.131.13", 80);
			System.out.println("Connected!");
		} catch (SecurityException e) {
			System.out.println("SecurityException: could not connect");
		}
	}

}
