package chap20_Flyweight.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JapaneseNumberFactory {
	private static JapaneseNumberFactory _singleton = new JapaneseNumberFactory();
	private Map<Character, JapaneseNumber> _pool = new HashMap<>();


	private JapaneseNumberFactory() { }


	public static JapaneseNumberFactory getInstance() {
		return _singleton;
	}


	public JapaneseNumber getJapaneseNumber(char numCharacter) {
		JapaneseNumber jNum = _pool.get(numCharacter);

		if (Objects.nonNull(jNum))
			return jNum;

		JapaneseNumber newJNum = new JapaneseNumber(numCharacter);
		_pool.put(numCharacter, newJNum);

		return newJNum;
	}

}
