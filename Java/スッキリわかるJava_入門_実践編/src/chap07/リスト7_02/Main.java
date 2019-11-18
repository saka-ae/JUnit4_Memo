package chap07.リスト7_02;

public class Main {

	public static void main(String[] args) throws Exception {
		String program		= "C:/Windows/System32/notepad.exe";
		String fileName	= "text.txt";

		ProcessBuilder pb = new ProcessBuilder(program, fileName);
		pb.start();
	}

}
