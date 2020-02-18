package chap8.sample8_02_2;

import java.awt.Graphics;
import java.time.LocalDate;

import chap8.sample8_02_1.UpdateApplet;

public class Clock extends UpdateApplet {

	public void paint(Graphics g) {
		LocalDate now = LocalDate.now();

		g.drawString(now.toString(), 10, 25);
	}
}
