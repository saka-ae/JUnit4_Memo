import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;

public class TargetTest {

	@Test
	public void assertThatで利用するMatcherオブジェクトの実体はstaticメソッド() {
		final int num = 1;

		Matcher<Integer> matcher = CoreMatchers.equalTo(num);
		assertThat(num, matcher);
	}

}
