package chap11.sample11_02_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class ListIt {

	public static void main(String[] args) {
		String filePath = args[0];
		File file = new File(filePath);

		if (!file.exists() || !file.canRead()) {
			System.err.println("Can't read " + file);

			return;
		}

		if (file.isDirectory()) {
			String[] fileNames = file.list();

			for (String fileName : fileNames)
				System.out.println(fileName);
		} else if (file.isFile()) {
			try (
					FileReader fr		= new FileReader(file);
					BufferedReader br	= new BufferedReader(fr)
			){
				for (String line = br.readLine(); Objects.nonNull(line); line = br.readLine())
					System.out.println(line);
			} catch (FileNotFoundException e) {
				e.printStackTrace();

				System.err.println("File Disappeared");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
