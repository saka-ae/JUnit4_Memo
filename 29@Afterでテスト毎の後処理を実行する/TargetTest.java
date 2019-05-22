import org.junit.After;
import org.junit.Test;

public class TargetTest {

	@After
	public void Afterアノテーションでテスト毎の後処理を実行する() {
		System.out.println("後処理");
	}

	@Test
	public void テスト１() {
		System.out.println("テスト１");
	}

	@Test
	public void テスト２() {
		System.out.println("テスト２");
	}

}
