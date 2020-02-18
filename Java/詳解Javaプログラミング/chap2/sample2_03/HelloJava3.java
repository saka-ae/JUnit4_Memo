package chap2.sample2_03;

import javax.swing.JFrame;

public class HelloJava3 {

	public static void main(String[] args) {
		JFrame	frame = new JFrame("HelloJava3");

		HelloComponent3 hello = new HelloComponent3("Hello Java!");
		frame.getContentPane().add(hello);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
