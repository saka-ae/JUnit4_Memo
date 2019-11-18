package chap17.ex17_2;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {

	private String title;
	private LocalDate releaseDate;


	public Movie() { }

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (Objects.isNull(title))
			throw new IllegalArgumentException();

		this.title = title;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		if (Objects.isNull(releaseDate))
			throw new IllegalArgumentException();

		LocalDate now = LocalDate.now();
		if (releaseDate.isAfter(now))
			throw new IllegalArgumentException();

		this.releaseDate = releaseDate;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

}
