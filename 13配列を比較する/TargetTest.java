import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void 配列を比較する() {
		int[] wrongArray    = { 1, 2, 3 };
		int[] expectedArray = { 7, 7, 7 };
		
		assertThat(wrongArray, equalTo(expectedArray));
	}

}
