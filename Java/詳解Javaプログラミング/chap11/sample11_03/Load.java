package chap11.sample11_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load<T> {

	public <T> T load(String fileName) {
		T result = null;

		try(
				FileInputStream fis		= new FileInputStream(fileName);
				ObjectInputStream ois	= new ObjectInputStream(fis);
		) {
			result = (T) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return result;
	}

}
