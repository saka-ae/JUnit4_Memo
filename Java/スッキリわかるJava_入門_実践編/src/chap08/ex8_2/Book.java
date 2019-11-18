package chap08.ex8_2;

import java.time.LocalDate;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public int compareTo(Book book) {
		return CompareToBuilder.reflectionCompare(this, book);
	}

	@Override
	public Book clone() {
		return new Book(title, publishDate, comment);
	}

}
