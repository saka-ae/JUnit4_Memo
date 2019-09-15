package chap22_Command.ex22_1.drawer;

import java.awt.Point;

import chap22_Command.ex22_1.command.Command;

public class DrawCommand implements Command {
	private	Drawable	_drawable;
	private	Point		_position;


	public DrawCommand(Drawable drawable, Point position) {
		_drawable = drawable;
		_position = position;
	}


	@Override
	public void execute() {
		_drawable.draw(_position.x, _position.y);
	}

}
