package myCustomMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class Within extends TypeSafeMatcher<Integer> {
	private final int _max;

	public Within(int max) {
		_max = max;
	}

	@Factory
	public static Matcher<Integer> within(int max) {
		return new Within(max);
	}

	public void describeTo(Description description) {
		description.appendText(_max + "以内");
	}

	@Override
	protected boolean matchesSafely(Integer num) {
		return num <= _max;
	}

}
