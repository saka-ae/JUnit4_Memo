import org.junit.Test;

public class TargetTest {

	@Test
	public void テスト内のエラーは失敗ではなくエラーとして報告される() {
		throw new RuntimeException();
	}

}
