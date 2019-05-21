import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void notマッチャーで否定のアサーションを行う() {
		final int num = 1;

		assertThat(num, not(num));
	}

}
