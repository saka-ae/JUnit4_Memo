package chap7.sample7_03_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		String dateStr = "jan 1, 2000";
		Class<?>[] classTypes = new Class[] { String.class };
		Object[] arguments = new Object[] { dateStr };

		try {
			Constructor<Date> constructor = Date.class.getConstructor(classTypes);
			Date date = constructor.newInstance(arguments);

			System.out.println(date);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
