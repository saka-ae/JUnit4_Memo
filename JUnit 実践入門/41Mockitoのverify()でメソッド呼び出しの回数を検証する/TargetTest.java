import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class TargetTest {
	private static final int NUMBER = 2;

	@Test
	public void getNumberメソッドが_NUMBER回_呼び出される() {
		Target mock = Mockito.mock(Target.class);

		mock.getNumber();
		mock.getNumber();

		int expected = NUMBER;
		verify(mock, times(expected)).getNumber();
	}

}
