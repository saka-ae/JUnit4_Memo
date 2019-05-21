import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TargetTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void ExpectedExceptionルールで例外の発生を確認する() {
		thrown.expect(ArithmeticException.class);


		int divideByZero = 1 / 0;
	}

}
