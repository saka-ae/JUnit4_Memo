package chap8.sample8_02_1;

import static chap8.sample8_02_1.State.*;

import java.applet.Applet;

public class UpdateApplet extends Applet implements Runnable {

	private static int UPDATE_INTERVAL_MS = 1000;

	private Thread thread;
	private State state = STOP;

	// Thread
	@Override
	public void run() {
		while (state == START) {
			try {
				Thread.sleep(UPDATE_INTERVAL_MS);
			} catch (InterruptedException e) {
				// sleepから目覚める
				continue;
			}

			repaint();
		}
	}

	// Applet
	@Override
	public void start() {
		if (state == STOP) {
			state = START;

			thread = new Thread(this);
			thread.start();
		}
	}

	@Override
	public void stop() {
		if (state == START) {
			state = STOP;
			thread.interrupt();

			thread = null;
		}
	}

}
