import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void isマッチャーを使うと読みやすいのか() {
		final int num = 1;

		assertThat(num, equalTo(num));

		assertThat(num, is(equalTo(num)));
	}

}
