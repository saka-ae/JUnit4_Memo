import org.junit.BeforeClass;
import org.junit.Test;

public class TargetTest {

	@BeforeClass
	public static void BeforeClassアノテーションでテスト全体の初期化処理を1度だけ実行する() {
		System.out.println("初期化");
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
