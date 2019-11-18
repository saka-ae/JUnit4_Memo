package chap14.ex14_1;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BankTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	// 正常系
	@Test
	public void instantiate() {
		Bank instance = new Bank();

		assertNotNull(instance);

		String actual = instance.getName();
		assertNull(actual);
	}

	@Test
	public void setName() {
		Bank sut = new Bank();
		String name = "ABC";

		sut.setName(name);

		String expected	= name;
		String actual		= sut.getName();

		assertEquals(expected, actual);
	}

	// 異常系
	@Test(expected = NullPointerException.class)
	public void setNameWithNullThrowsNullPointerException() {
		Bank sut = new Bank();

		sut.setName(null);
	}

	@Test
	public void setNameWith2CharactersThrowsIllegalArgumentException() throws Exception {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("名前が不正");

		Bank sut = new Bank();
		String badName = "AB";

		sut.setName(badName);
	}

}
