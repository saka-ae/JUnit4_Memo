import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void closeToマッチャーで浮動小数点数の比較をする() {
		final double 許容誤差 = 0.0005;

		final double num       = 0.1 * 3;
		final double expected = 0.3;

		assertThat(num, closeTo(expected, 許容誤差));
	}

}
