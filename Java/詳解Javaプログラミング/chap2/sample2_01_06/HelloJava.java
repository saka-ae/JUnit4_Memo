package chap2.sample2_01_06;

import javax.swing.JFrame;

public class HelloJava {

	public static void main(String[] args) {
		JFrame	frame = new JFrame("Hello, Java!");

		HelloComponent hello = new HelloComponent();
		frame.getContentPane().add(hello);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
