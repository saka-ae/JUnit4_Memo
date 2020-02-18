package chap11.sample11_01_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Objects;

public class LoggerDaemon extends Thread {

	private PipedReader pr = new PipedReader();

	public LoggerDaemon() {
		start();
	}

	@Override
	public void run() {
		BufferedReader br = new BufferedReader(pr);

		try {
			for (String str = br.readLine(); Objects.nonNull(str); str = br.readLine())
				System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	PrintWriter getWriter() {
		PipedWriter pw = null;

		try {
			pw = new PipedWriter(pr);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new PrintWriter(pw);
	}

}
