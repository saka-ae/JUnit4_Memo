package chap1_Iterator.sample;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
	private List<Book> _books = new ArrayList<>();


	public Book getBookAt(int index) {
		return _books.get(index);
	}

	public void addBook(Book book) {
		_books.add(book);
	}

	public int getNumberOfBooks() {
		return _books.size();
	}


	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}

}
