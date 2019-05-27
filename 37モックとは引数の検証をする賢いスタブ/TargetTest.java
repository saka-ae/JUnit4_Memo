import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {
	private static final int NUMBER = 100;

	@Test
	public void スタブは常に９９を返す() {
		Target stub = new SmartStub(NUMBER);

		int actual = stub.getNumber();

		assertThat(actual, equalTo(NUMBER));
	}

}
