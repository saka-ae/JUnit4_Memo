package chap07.リスト7_05;

public class Main {

	public static void main(String[] args) throws Exception {
		// String
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());

		Package pack = info1.getPackage();
		System.out.printf("Package of %s : %s\n", info1.getName(), pack.getName());

		System.out.printf("%s is Array? : %b\n", info1.getName(), info1.isArray());

		Class<?> info2 = info1.getSuperclass();
		System.out.printf("Super Class of %s : %s\n", info1.getName(), info2.getName());

		// String[]
		Class<?> info3 = args.getClass();
		System.out.printf("%s is Array? : %b\n", info3.getName(), info3.isArray());
	}

}
