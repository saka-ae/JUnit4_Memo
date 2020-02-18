package chap2.sample2_02;

import javax.swing.JFrame;

public class HelloJava2 {

	public static void main(String[] args) {
		JFrame	frame = new JFrame("HelloJava2");

		HelloComponent2 hello = new HelloComponent2("Hello Java!");
		frame.getContentPane().add(hello);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
