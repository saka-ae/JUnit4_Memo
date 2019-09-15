package chap1_Iterator.sample;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.addBook(new Book("book1"));
		bookShelf.addBook(new Book("book2"));

		for (Iterator<Book> it = bookShelf.iterator(); it.hasNext(); it.next()) {
			Book book = it.getElement();
			System.out.println(book.getName());
		}
	}

}
