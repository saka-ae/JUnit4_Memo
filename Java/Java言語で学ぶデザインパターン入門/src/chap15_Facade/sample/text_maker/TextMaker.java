package chap15_Facade.sample.text_maker;

public class TextMaker {

	public static void makeText(String title, Database database) {
		TextWriter.write(title);

		TextWriter.newLine();

		String author = database.getAuthor(title);
		TextWriter.write(author);
	}

}
