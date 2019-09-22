package chap16.リスト16_05;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame frame	= new JFrame("sample GUI");
		JLabel label	= new JLabel("Hello World!");
		JButton button = new JButton("push");

		Container container = frame.getContentPane();
		container.setLayout(new FlowLayout());
		container.add(label);
		container.add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//frame.setSize(300, 100);
		frame.pack();

		frame.setVisible(true);
	}

}
