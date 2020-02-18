package chap11.sample11_04_01_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {

	private static final int BUFFER_SIZE = 8192;

	public void compress(String fileName) {
		String zipName = fileName + ".zip";
		byte[] buffer = new byte[BUFFER_SIZE];

		try (
				FileInputStream fis = new FileInputStream(fileName);

				FileOutputStream fos	= new FileOutputStream(zipName);
				ZipOutputStream zos	= new ZipOutputStream(fos);
		) {
			ZipEntry entry = new ZipEntry("first");
			zos.putNextEntry(entry);

			for (int length = fis.read(buffer, 0, BUFFER_SIZE); length != -1; length = fis.read(buffer, 0, BUFFER_SIZE))
				zos.write(buffer, 0, length);
		} catch (IOException e) {
			e.printStackTrace();

			System.err.println("Couldn't create " + zipName);
		}

	}

}
