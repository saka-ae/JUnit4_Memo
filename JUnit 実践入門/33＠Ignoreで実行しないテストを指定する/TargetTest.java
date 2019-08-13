import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TargetTest {

	@Ignore
	@Test
	public void Ignoreアノテーションで実行しないテストを指定する() {
		fail("このテストは実行されない");
	}

}
