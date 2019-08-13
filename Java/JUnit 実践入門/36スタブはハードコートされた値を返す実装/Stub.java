
public class Stub extends Target {

	public Stub(int number) {
		super(number);
	}

	// 常に９９を返す実装でTargetのメソッドを置き換える
	@Override
	public int getNumber() {
		return 99;
	}
}
