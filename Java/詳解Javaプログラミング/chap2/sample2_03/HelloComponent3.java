package chap2.sample2_03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener {

	private static Color[] SOME_COLORS = {
			Color.black, Color.red, Color.blue
	};

	private String		_message;
	private int		_messageX = 125;
	private int		_messageY = 95;

	private JButton	_button;
	private int		_colorIndex;


	public HelloComponent3(String message) {
		_message	= message;

		_button		= new JButton("Change Color");

		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		add(_button);

		// Listener
		addMouseMotionListener(this);

		_button.addActionListener(this);
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

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == _button)
			changeColor();
	}

	// helper
	synchronized private void changeColor() {
		++_colorIndex;

		if (_colorIndex == SOME_COLORS.length)
			_colorIndex = 0;

		setForeground(currentColor());
		repaint();
	}

	synchronized private Color currentColor() {
		return SOME_COLORS[_colorIndex];
	}

}
