import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TargetTest {

	@BeforeClass
	public static void BeforeClassアノテーションでテスト全体の初期化処理を1度だけ実行する() {
		System.out.println("BeforeClass");
	}
	@Before
	public void Beforeアノテーションでテスト毎の初期化処理を実行する() {
		System.out.println("Before");
	}
	@After
	public void Afterアノテーションでテスト毎の後処理を実行する() {
		System.out.println("After");
	}
	@AfterClass
	public static void AfterClassアノテーションでテスト全体の後処理を1度だけ実行する() {
		System.out.println("AfterClass");
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
