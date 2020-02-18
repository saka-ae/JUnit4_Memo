package chap11.sample11_04_01_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZip {

	private static final int BUFFER_SIZE = 8192;

	public void compress(String fileName) {
		String zipName = fileName + ".gz";
		byte[] buffer = new byte[BUFFER_SIZE];

		try (
				FileInputStream fis = new FileInputStream(fileName);

				FileOutputStream fos	= new FileOutputStream(zipName);
				GZIPOutputStream gzos	= new GZIPOutputStream(fos);
		) {
			for (int length = fis.read(buffer, 0, BUFFER_SIZE); length != -1; length = fis.read(buffer, 0, BUFFER_SIZE))
				gzos.write(buffer, 0, length);
		} catch (IOException e) {
			e.printStackTrace();

			System.err.println("Couldn't create " + zipName);
		}

	}

}
