package chap9.sample9_06_02_2;

public class Main {

	public static void main(String[] args) {
		String input = "<!-- TEMPLATE:name --> lives at "
				+ "<!-- TEMPLATE:address -->";

		Template template = new Template();
		template.set("name", "abc");
		template.set("address",  "1-1-1");

		String output = template.fillIn(input);
		System.out.println(output);
	}

}
