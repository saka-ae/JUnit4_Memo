import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class TargetTest {
	private static final int NUMBER = 1;

	@Test
	public void setNumberメソッドが引数NUMBERで呼び出される() {
		Target mock = Mockito.mock(Target.class);

		mock.setNumber(NUMBER);

		int expected = NUMBER;
		verify(mock).setNumber(expected);
	}

}
