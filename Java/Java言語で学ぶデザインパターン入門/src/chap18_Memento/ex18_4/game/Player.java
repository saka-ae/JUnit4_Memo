package chap18_Memento.ex18_4.game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Player {
	private int _money;
	private Random _random = new Random();


	public Player(int money) {
		_money = money;
	}


	public int getMoney() {
		return _money;
	}


	@Override
	public String toString() {
		return "所持金: " + _money;
	}


	public Memento createMemento() {
		return new Memento(_money);
	}

	public void restoreMemento(Memento memento) {
		_money = memento._money;
	}


	public void doubleUp() {
		boolean success = _random.nextBoolean();

		if (success) {
			_money *= 2;
			System.out.println("ダブルアップ成功");
		} else {
			_money /= 2;
			System.out.println("ダブルアップ失敗");
		}
	}


	public Memento load(String fileName) {
		try (	FileInputStream		fis = new FileInputStream(fileName);
				ObjectInputStream	ois = new ObjectInputStream(fis)		) {

			Memento memento = (Memento) ois.readObject();

			return memento;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	public void save(String fileName, Memento memento) {
		try (	FileOutputStream	fos = new FileOutputStream(fileName);
				ObjectOutputStream	oos = new ObjectOutputStream(fos)		) {

			oos.writeObject(memento);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean existMemento(String fileName) {
		try (FileInputStream		fis = new FileInputStream(fileName)) {
			return true;
		} catch (IOException e) {
			;
		}

		return false;
	}

}
