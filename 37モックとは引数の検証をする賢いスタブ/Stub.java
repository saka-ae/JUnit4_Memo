import static org.junit.Assert.*;

public class Stub extends Target {

	public Stub(int number) {
		super(number);

		// コンストラクタに渡されたパラメータを検証するガード節を追加
		if (super.getNumber() != 99)
			fail("スタブに99がセットされていない");
	}

	@Override
	public int getNumber() {
		return 99;
	}
}
