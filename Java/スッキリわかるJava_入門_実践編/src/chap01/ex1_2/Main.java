package chap01.ex1_2;

public class Main {

	public static void main(String[] args) {
		String folder	= "フォルダ名";
		String file		= "ファイル名.txt";

		String fullPath = concatPath(folder, file);
		System.out.println(fullPath);
	}


	private static String concatPath(String folder, String file) {
		if (folder.endsWith("\\"))
			return folder + file;
		else
			return folder + "\\" + file;
	}

}
