import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void assertThatの失敗メッセージは分かりやすい() {
		final int num            = 1;
		final int expectedNumer = 0;

		assertThat(num, equalTo(expectedNumer));
	}

}
