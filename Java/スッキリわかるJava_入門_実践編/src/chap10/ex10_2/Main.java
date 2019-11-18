package chap10.ex10_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("田中太郎", 41);
		Department leader = new Department("総務部", employee);

		String fileName = "company.dat";

		try (
				FileOutputStream fos	= new FileOutputStream(fileName);
				ObjectOutputStream oos	= new ObjectOutputStream(fos)
		) {
			oos.writeObject(leader);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
