package chap9.sample9_06_02_2;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Template {

	/* オプション
	 * 		改行も1文字として一致する
	 * 		大文字小文字を区別しない
	 *
	 * <!-- -->で囲まれた
	 * TEMPLATE:の後に続く1文字以上の単語
	 */
	private static final String REGEX = "(?si)<!--\\s*TEMPLATE:(\\w+).*?-->";

	private Properties values = new Properties();
	private Pattern templateComment = Pattern.compile(REGEX);

	public void set(String name, String value) {
		values.setProperty(name, value);
	}

	public String fillIn(String text) {
		Matcher matcher = templateComment.matcher(text);

		StringBuilder sb = new StringBuilder();

		while (matcher.find()) {
			String name		= matcher.group(1);

			String value	= values.getProperty(name);

			matcher.appendReplacement(sb, value);
		}

		matcher.appendTail(sb);

		return sb.toString();
	}

}
