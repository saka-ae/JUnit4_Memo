import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void テストの構成はAAA() {
		// Arrange: 準備
		final int num = 1;
		Target target = new Target(num);

		// Act:     実行
		int actual = target.getNumber();

		// Assert:  検証
		int expected = num;
		assertThat(actual, equalTo(expected));
	}

}
