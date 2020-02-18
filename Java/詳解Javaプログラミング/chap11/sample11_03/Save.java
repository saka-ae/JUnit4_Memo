package chap11.sample11_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save {

	public <T> void save(T obj, String fileName) {
		try (
				FileOutputStream fos	= new FileOutputStream(fileName);
				ObjectOutputStream oos	= new ObjectOutputStream(fos);
		) {
			oos.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
