package chap12.ex12_1;

import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Item {

	private static final int NAME	= 1;
	private static final int PRICE	= 2;
	private static final int WEIGHT	= 3;
	private String name;
	private int price;
	private int weight;

	public Item(ResultSet rs) throws SQLException {
		name	= rs.getString(NAME);
		price	= rs.getInt(PRICE);
		weight	= rs.getInt(WEIGHT);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		String name = format全角文字(this.name, 20);

		return String.format(name + " %4d %4d", price, weight);
	}

	private String format全角文字(String target, int length){
		Charset charset = Charset.forName("UTF-8");
		int byteLength = target.getBytes(charset).length;

		if (byteLength == target.length()) {
			String サイズ修正なし = String.format("%-" + length + "s", target);

			return サイズ修正なし;
		}

		// 日本語は半角2文字分のサイズ
		int displaySize = byteLength * 2 / 3;

		int diff空白文字 = (displaySize - target.length());

		int modifiedSize = length - diff空白文字;

		return String.format("%-" + modifiedSize + "s", target);
	}

}
