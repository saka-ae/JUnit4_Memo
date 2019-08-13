import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void assertThatで値を比較する() {
		final int num = 1;
		
		assertThat(num, equalTo(num));
	}

}
