package chap11.sample11_05_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFile {

	public static void main(String[] args) {
		String inFileName	= "in.txt";
		String outFileName	= "out.txt";

		try (
				FileChannel ifc = new FileInputStream(inFileName).getChannel();
				FileChannel ofc = new FileOutputStream(outFileName).getChannel();
		) {
			ifc.transferTo(0, ifc.size(), ofc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
