package myCustomMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class Within extends TypeSafeMatcher<Integer> {
	private final int _max;

	private Within(int max) {
		_max = max;
	}

	// assertThat()の第二引数として呼ばれる
	@Factory
	public static Matcher<Integer> within(int max) {
		return new Within(max);
	}

	// assertThat()内の処理で内部的に呼ばれる
	// assertThat()の第一引数を受け取って検証する
	@Override
	protected boolean matchesSafely(Integer num) {
		return num <= _max;
	}

	// 失敗時に表示されるテキストを定義
	public void describeTo(Description description) {
		description.appendText(_max + "以内");
	}

}
