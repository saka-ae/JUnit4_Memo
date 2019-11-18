package chap07.リスト7_04;

public class Main {

	public static void main(String[] args) throws Exception {
		String version	= System.getProperty("rpg.version");
		String author	= System.getProperty("rpg.author");

		System.out.println("version: "	+ version);
		System.out.println("author: "	+ author);
	}

}
