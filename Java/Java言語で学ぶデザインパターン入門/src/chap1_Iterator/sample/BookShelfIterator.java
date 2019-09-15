package chap1_Iterator.sample;

public class BookShelfIterator implements Iterator<Book> {
	private BookShelf _bookshelf;
	private int _index = 0;


	public BookShelfIterator(BookShelf bookshelf) {
		_bookshelf = bookshelf;
	}


	@Override
	public boolean hasNext() {
		return _index < _bookshelf.getNumberOfBooks();
	}

	@Override
	public Book getElement() {
		return _bookshelf.getBookAt(_index);
	}

	@Override
	public void next() {
		_index++;
	}

}
