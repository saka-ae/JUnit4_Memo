package chap2_Adapter.ex2_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileIOProperties implements FileIO {
	private Properties _properties = new Properties();


	@Override
	public void readFromFile(String fileName) {
		try (FileReader fr = new FileReader(fileName)) {
			_properties.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void writeToFile(String fileName) {
		try (FileWriter fw = new FileWriter(fileName)) {
			_properties.store(fw, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public String getValue(String key) {
		return _properties.getProperty(key);
	}

	@Override
	public void setValue(String key, String value) {
		_properties.setProperty(key, value);
	}

}
