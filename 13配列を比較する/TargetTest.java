import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void 配列を比較する() {
		int[] array = { 1, 2, 3 };
		
		assertThat(array, equalTo(array));
	}

}
