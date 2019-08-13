import org.junit.Test;

public class TargetTest {

	@Test(expected = ArithmeticException.class)
	public void Testアノテーションで例外の発生を確認する() {
		int divideByZero = 1 / 0;
	}

}
