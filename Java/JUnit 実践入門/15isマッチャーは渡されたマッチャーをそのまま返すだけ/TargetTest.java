import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class TargetTest {

	@Test
	public void isマッチャーは渡されたマッチャーをそのまま返すだけ() {
		final int num = 1;

		Matcher<Integer> matcher = equalTo(num);

		assertThat(num, is(matcher));
	}

}
