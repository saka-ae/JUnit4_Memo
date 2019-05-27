import static org.junit.Assert.*;

public class SmartStub extends Target {

	public SmartStub(int number) {
		super(number);

		// コンストラクタに渡されたパラメータを検証するガード節を追加
		if (super.getNumber() != 99)
			fail("モックに99がセットされていない");
	}

	@Override
	public int getNumber() {
		return 99;
	}
}
