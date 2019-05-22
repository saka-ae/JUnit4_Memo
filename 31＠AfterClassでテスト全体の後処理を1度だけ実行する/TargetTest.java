import org.junit.AfterClass;
import org.junit.Test;

public class TargetTest {

	@AfterClass
	public static void AfterClassアノテーションでテスト全体の後処理を1度だけ実行する() {
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
