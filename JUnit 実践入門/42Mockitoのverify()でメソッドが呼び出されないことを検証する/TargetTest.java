import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class TargetTest {

	@Test
	public void getNumberメソッドは呼び出されない() {
		Target mock = Mockito.mock(Target.class);

		verify(mock, never()).getNumber();
	}

}
