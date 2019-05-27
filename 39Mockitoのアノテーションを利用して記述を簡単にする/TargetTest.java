import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TargetTest {
	private static final int NUMBER = 100;

	// モックの型を指定
	@Mock
	private Target _mock;
	// @Mockで指定されたモックの型を探す対象のオブジェクト
	@InjectMocks
	private Target _target;

	@Test
	public void モックは９９を返す() {
		_target = new Target(NUMBER);
		// @InjectMocksで指定されたオブジェクトから@Mockで指定された型を探す
		// コンストラクタの引数 → セッター → フィールドの順に探し、見つけたらモックをセットする
		MockitoAnnotations.initMocks(this);

		when(_mock.getNumber()).thenReturn(99);

		int actual = _target.getNumber();

		assertThat(actual, equalTo(NUMBER));
	}

}
