import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TargetTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void ExpectedExceptionルールで例外の状態を確認する() {
		String wrongMessage    = "間違ったメッセージ";
		String expectedMessage = "期待されるメッセージ";

		thrown.expect(RuntimeException.class);
		thrown.expectMessage(expectedMessage);

		throw new RuntimeException(wrongMessage);
	}

}
