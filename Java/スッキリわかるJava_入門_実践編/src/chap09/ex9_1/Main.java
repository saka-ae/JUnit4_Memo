package chap09.ex9_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String inFileName		= args[0];
		String outFileName		= args[1];

		FileInputStream fis		= new FileInputStream(inFileName);
		FileOutputStream fos	= new FileOutputStream(outFileName);

		for (int i = fis.read(); i != -1; i = fis.read())
			fos.write(i);

		fos.flush();

		fis.close();
		fos.close();
	}

}
