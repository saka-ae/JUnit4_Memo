package chap22_Command.ex22_1.drawer;

import java.awt.Color;

import chap22_Command.ex22_1.command.Command;

public class ColorCommand implements Command {
	private	Drawable	_drawable;
	private	Color		_color;


	public ColorCommand(Drawable drawable, Color color) {
		_drawable	= drawable;
		_color 		= color;
	}


	@Override
	public void execute() {
		_drawable.setColor(_color);
	}

}
