package chap2.sample2_01_06;

import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloComponent extends JComponent {

	@Override
	public void paintComponent(Graphics g) {
		g.drawString("Hello, Java!", 125, 95);
	}

}
