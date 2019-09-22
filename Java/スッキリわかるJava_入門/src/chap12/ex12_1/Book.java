package chap12.ex12_1;

public class Book extends TangibleAsset {
	private String	_isbn;


	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);

		_isbn	= isbn;
	}


	public String getIsbn() {
		return _isbn;
	}

}
