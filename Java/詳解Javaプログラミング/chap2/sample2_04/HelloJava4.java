package chap2.sample2_04;

import javax.swing.JFrame;

public class HelloJava4 {

	public static void main(String[] args) {
		JFrame	frame = new JFrame("HelloJava4");

		HelloComponent4 hello = new HelloComponent4("Hello Java!");
		frame.getContentPane().add(hello);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
