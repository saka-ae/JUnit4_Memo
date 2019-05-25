import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.After;
import org.junit.Test;

public class TargetTest {
	private int num = 0;

	@After
	public void numは常にゼロ() {
		assertThat(num, equalTo(0));
	}

	@Test
	public void テスト１() {
		;
	}

	@Test
	public void テスト２() {
		;
	}
	
}
