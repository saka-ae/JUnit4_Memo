import static myCustomMatcher.Within.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void テスト１() {
		int num = 777;

		assertThat(num, within(100));
	}

}
