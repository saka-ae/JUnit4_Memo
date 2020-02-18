package chap11.sample11_04_02_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZip {

	private static final int BUFFER_SIZE = 8192;

	public void unzip(String fileName) {
		String unzipName = fileName.replace(".zip", "");

		byte[] buffer = new byte[BUFFER_SIZE];

		try (
				FileInputStream fis = new FileInputStream(fileName);
				ZipInputStream zis = new ZipInputStream(fis);

				FileOutputStream fos	= new FileOutputStream(unzipName);
		) {
			for (ZipEntry entry = zis.getNextEntry(); entry != null; entry = zis.getNextEntry())
				for (int length = zis.read(buffer, 0, BUFFER_SIZE); length != -1; length = zis.read(buffer, 0, BUFFER_SIZE)) {
					fos.write(buffer, 0, length);
					fos.flush();
				}
		} catch (IOException e) {
			e.printStackTrace();

			System.err.println("Couldn't create " + unzipName);
		}

	}

}
