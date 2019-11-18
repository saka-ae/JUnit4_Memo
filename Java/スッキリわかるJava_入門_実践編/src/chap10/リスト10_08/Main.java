package chap10.リスト10_08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception	{
		Hero hero1 = new Hero("ミナト", 75, 18);
		System.out.println("hero1: " + hero1);

		String fileName = "rpg.dat";
		FileOutputStream fos	= new FileOutputStream(fileName);
		ObjectOutputStream oos	= new ObjectOutputStream(fos);
		oos.writeObject(hero1);
		oos.flush();
		oos.close();

		FileInputStream fis		= new FileInputStream(fileName);
		ObjectInputStream ois	= new ObjectInputStream(fis);
		Hero hero2 = (Hero) ois.readObject();
		System.out.println("hero2: " + hero2);

		ois.close();
	}

}
