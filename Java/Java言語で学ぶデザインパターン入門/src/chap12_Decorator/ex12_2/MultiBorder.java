package chap12_Decorator.ex12_2;

public abstract class MultiBorder extends MultiDisplay {
	protected MultiDisplay _display;


	public MultiBorder(MultiDisplay display) {
		_display = display;
	}


	protected MultiDisplay getDisplay() {
		return _display;
	}

}
