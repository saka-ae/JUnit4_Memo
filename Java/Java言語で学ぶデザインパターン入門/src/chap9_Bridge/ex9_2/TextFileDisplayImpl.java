package chap9_Bridge.ex9_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import chap9_Bridge.sample.DisplayImpl;

public class TextFileDisplayImpl implements DisplayImpl {
	private Path _path;


	public TextFileDisplayImpl(String filePath) {
		_path = Paths.get(filePath);
	}


	@Override
	public void setUp() {
		Path fileName = _path.getFileName();
		System.out.println(fileName);
		System.out.println();
	}

	@Override
	public void tearDown() {
		System.out.println();
		System.out.println("出力終了");
	}

	@Override
	public void print() {
		List<String> allLines;

		try {
			allLines = Files.readAllLines(_path);
		} catch (IOException e) {
			e.printStackTrace();

			return;
		}

		for (String line : allLines)
			System.out.println(line);
	}

}
