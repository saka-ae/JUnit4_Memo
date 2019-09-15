package chap22_Command.ex22_1.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import chap22_Command.ex22_1.command.MacroCommand;


public class DrawCanvas extends Canvas implements Drawable {
	private Color			_color;
	private int			_radius;
	private MacroCommand	_history;


	public DrawCanvas(MacroCommand history, int width, int height) {
		_history = history;

		super.setSize(width, height);
		super.setBackground(Color.white);

		init();
	}


	@Override
	public void paint(Graphics g) {
		_history.execute();
	}


	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();

		g.setColor(_color);

		int left	= x - _radius;
		int upper	= y - _radius;
		int width	= _radius * 2;
		int height	= _radius * 2;
		g.fillOval(left, upper, width, height);
	}


	@Override
	public void setColor(Color color) {
		_color = color;
	}


	@Override
	public void init() {
		_color	= Color.red;
		_radius	= 6;
	}

}
