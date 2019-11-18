package chap18.ex18_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyLogger {

	private static final String FILE_NAME = "dummylog.txt";

	private static final MyLogger instance = new MyLogger();
	private PrintWriter pw;

	private MyLogger() {
		try {
			FileWriter fw		= new FileWriter(FILE_NAME);
			BufferedWriter bw	= new BufferedWriter(fw);
			pw					= new PrintWriter(bw, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static MyLogger getInstance() {
		return instance;
	}


	public void log(String str) {
		pw.println(str);
	}

}
