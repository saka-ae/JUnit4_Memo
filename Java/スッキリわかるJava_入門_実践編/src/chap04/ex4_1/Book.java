package chap04.ex4_1;

import java.time.LocalDate;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {

	private String title;
	private LocalDate publishDate;
	private String comment;

	public Book(String title, LocalDate publishDate, String comment) {
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (Objects.isNull(obj))
			return false;

		if (!(obj instanceof Book))
			return false;

		Book book = (Book) obj;
		String title = book.title;
		LocalDate publishDate = book.publishDate;

		if (!title.equals(this.title))
			return false;

		if (!publishDate.isEqual(this.publishDate))
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int num1 = 37;
		int num2 = 31;

		return num1 + title.hashCode() + publishDate.hashCode();
	}

	@Override
	public int compareTo(Book book) {
		return this.publishDate.compareTo(book.publishDate);
	}

	@Override
	public Book clone() {
		return new Book(title, publishDate, comment);
	}

}
