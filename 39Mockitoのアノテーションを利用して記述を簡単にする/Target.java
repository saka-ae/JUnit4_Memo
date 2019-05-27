
public class Target {
	// テストの MockitoAnnotations.initMocks(this) によりモックがセットされる
	private Target _mock = this;

	private int _number;

	public Target(int number) {
		_number = number;
	}

	public int getNumber() {
		return (_mock == this) ? _number : _mock.getNumber();
	}

}
