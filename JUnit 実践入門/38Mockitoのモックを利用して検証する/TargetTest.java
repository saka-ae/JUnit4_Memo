import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TargetTest {
	private static final int NUMBER = 99;

	@Test
	public void モックはNUMBERを返す() {
		Target mock = mock(Target.class);
		when(mock.getNumber()).thenReturn(NUMBER);

		int actual = mock.getNumber();

		assertThat(actual, equalTo(NUMBER));
	}

}
