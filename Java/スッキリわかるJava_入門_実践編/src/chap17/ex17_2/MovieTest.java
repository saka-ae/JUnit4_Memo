package chap17.ex17_2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class MovieTest {

	@Test
	public void instantiate() {
		// 引数なし
		Movie instance1 = new Movie();

		// タイトルを指定
		String title = "タイトル";
		Movie instance2 = new Movie(title);
	}

	@Test
	public void test_getTitle_succeeds() {
		String title = "タイトル";
		Movie sut = new Movie(title);

		String expected	= title;
		String actual		= sut.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setTitle_succeeds() {
		String title = "タイトル";
		Movie sut = new Movie(title);

		sut.setTitle(title);

		String expected	= title;
		String actual		= sut.getTitle();
		assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_setTitle_cannotSetNull() {
		Movie sut = new Movie();

		sut.setTitle(null);
	}

	@Test
	public void test_setReleaseDate_succeeds() {
		Movie sut = new Movie();
		LocalDate releaseDate = LocalDate.now();

		sut.setReleaseDate(releaseDate);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_setReleaseDate_cannotSetNull() {
		Movie sut = new Movie();

		sut.setReleaseDate(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_setReleaseDate_cannotSetFutureDate() {
		Movie sut = new Movie();
		LocalDate now			= LocalDate.now();
		LocalDate future = now.plusDays(100);

		sut.setReleaseDate(future);
	}

	@Test
	public void test_getReleaseDate_succeeds() {
		Movie sut = new Movie();
		LocalDate releaseDate = LocalDate.now();
		sut.setReleaseDate(releaseDate);

		LocalDate expected	= releaseDate;
		LocalDate actual	= sut.getReleaseDate();
		assertEquals(expected, actual);
	}

}
