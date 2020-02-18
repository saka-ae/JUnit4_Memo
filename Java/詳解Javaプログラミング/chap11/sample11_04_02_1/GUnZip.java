package chap11.sample11_04_02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GUnZip {

	private static final int BUFFER_SIZE = 8192;

	public void unzip(String fileName) {
		String unzipName = fileName.replace(".gz", "");

		byte[] buffer = new byte[BUFFER_SIZE];

		try (
				FileInputStream fis = new FileInputStream(fileName);
				GZIPInputStream gzis = new GZIPInputStream(fis);

				FileOutputStream fos	= new FileOutputStream(unzipName);
		) {
			for (int length = gzis.read(buffer, 0, BUFFER_SIZE); length != -1; length = gzis.read(buffer, 0, BUFFER_SIZE))
				fos.write(buffer, 0, length);
		} catch (IOException e) {
			e.printStackTrace();

			System.err.println("Couldn't create " + unzipName);
		}

	}

}
