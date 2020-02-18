package chap2.sample2_01;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloJava3 {

	public static void main(String[] args) {
		JFrame	frame = new JFrame("Hello, Java!");
		
		JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
		frame.getContentPane().add(label);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
