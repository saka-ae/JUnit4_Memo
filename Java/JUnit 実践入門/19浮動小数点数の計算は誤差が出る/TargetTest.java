import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void 浮動小数点数の計算は誤差が出る() {
		final double wrong    = 0.1 * 3;
		final double expected = 0.3;

		assertThat(wrong, equalTo(expected));
	}

}
