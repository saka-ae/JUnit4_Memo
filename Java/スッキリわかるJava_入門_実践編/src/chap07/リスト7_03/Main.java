package chap07.リスト7_03;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		String version = System.getProperty("java.version");
		System.out.println("Javaのバージョン: " + version);

		Properties properties = System.getProperties();
		Set<String> propertyNames = properties.stringPropertyNames();

		Iterator<String> it = propertyNames.iterator();
		System.out.println("【システムプロパティ一覧】");
		while (it.hasNext()) {
			String propertyName	= it.next();
			String property		= System.getProperty(propertyName);
			
			System.out.printf("%s = %s\n", propertyName, property);
		}
	}

}
