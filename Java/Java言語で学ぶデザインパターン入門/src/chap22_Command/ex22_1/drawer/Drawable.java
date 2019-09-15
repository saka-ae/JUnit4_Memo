package chap22_Command.ex22_1.drawer;

import java.awt.Color;

public interface Drawable {

	void draw(int x, int y);

	void setColor(Color color);

	void init();

}
