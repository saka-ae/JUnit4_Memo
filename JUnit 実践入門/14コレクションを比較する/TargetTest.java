import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TargetTest {

	@Test
	public void コレクションを比較する() {
		List<Integer> wrongList    = Arrays.asList(1, 2, 3);
		List<Integer> expectedList = Arrays.asList(7, 7, 7);
		
		assertThat(wrongList, equalTo(expectedList));
	}

}
