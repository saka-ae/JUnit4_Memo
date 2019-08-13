import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {
	private static final int NUMBER = 100;

	@Test
	public void モックは常に９９を返す() {
		Target mock = new SmartStub(NUMBER);

		int actual = mock.getNumber();

		assertThat(actual, equalTo(NUMBER));
	}

}
