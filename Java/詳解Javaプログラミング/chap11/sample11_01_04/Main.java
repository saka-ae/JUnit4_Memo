package chap11.sample11_01_04;

import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		LoggerDaemon logger = new LoggerDaemon();
		PrintWriter pw = logger.getWriter();

		pw.println("Start");

		pw.println("End");

		pw.close();
	}

}
