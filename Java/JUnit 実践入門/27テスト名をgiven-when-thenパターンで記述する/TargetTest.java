import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void givenANumber_WhenExecuteTheConstructor_ThenTheNumberIsSet() {
		final int num = 1;
		Target target = new Target(num);

		int actual = target.getNumber();

		int expected = num;
		assertThat(actual, equalTo(expected));
	}

}
