package chap2.sample2_02;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class HelloComponent2 extends JComponent implements MouseMotionListener {

	private String	_message;
	private int	_messageX = 125;
	private int	_messageY = 95;


	public HelloComponent2(String message) {
		_message = message;

		addMouseMotionListener(this);
	}

	// JComponent
	@Override
	public void paintComponent(Graphics g) {
		g.drawString(_message, _messageX, _messageY);
	}

	// MouseMotionListener
	@Override
	public void mouseDragged(MouseEvent e) {
		_messageX = e.getX();
		_messageY = e.getY();

		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) { }

}
