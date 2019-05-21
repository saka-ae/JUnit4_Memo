import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void 配列を比較する() {
<<<<<<< HEAD
		int[] wrongArray    = { 1, 2, 3 };
		int[] expectedArray = { 7, 7, 7 };
		
		assertThat(wrongArray, equalTo(expectedArray));
=======
		int[] array = { 1, 2, 3 };
		
		assertThat(array, equalTo(array));
>>>>>>> d56ea7417b1d02fabf15e515320bfae54c5adf4b
	}

}
