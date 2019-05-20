import org.junit.Before;
import org.junit.Test;

public class TargetTest {

	@Before
	public void Beforeアノテーションはテスト毎に初期化処理を実行する() {
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
