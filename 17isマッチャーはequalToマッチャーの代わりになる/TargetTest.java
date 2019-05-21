import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void isマッチャーはequalToマッチャーの代わりになる() {
		final int wrongNumber    = 0;
		final int expectedNumber = 1;

		assertThat(wrongNumber, is(expectedNumber));
	}

}
