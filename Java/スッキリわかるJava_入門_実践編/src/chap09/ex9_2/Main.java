package chap09.ex9_2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {

	public static void main(String[] args) {
		if (args.length != 2)
			throw new IllegalArgumentException("Usage: Main srcFileName dstFileName");

		String inFileName		= args[0];
		String outFileName		= args[1];

		try (
				FileInputStream fis			= new FileInputStream(inFileName);
				FileOutputStream fos		= new FileOutputStream(outFileName);
				BufferedOutputStream bos	= new BufferedOutputStream(fos);
				GZIPOutputStream gzos		= new GZIPOutputStream(bos);
		) {
			for (int i = fis.read(); i != -1; i = fis.read())
				gzos.write(i);

			gzos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
