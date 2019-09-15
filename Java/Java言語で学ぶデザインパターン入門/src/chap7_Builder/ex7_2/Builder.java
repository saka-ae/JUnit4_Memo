package chap7_Builder.ex7_2;

public abstract class Builder {
	private static final String ERROR_MESSAGE = "makeTitle()を先に呼び出す必要がある";

	private boolean _calledMakeTitle = false;


	public void makeTitle() {
		buildTitle();

		_calledMakeTitle = true;
	}

	public void makeString() {
		if (!_calledMakeTitle) {
			System.out.println(ERROR_MESSAGE);

			return;
		}

		buildString();
	}

	public void makeItems() {
		if (!_calledMakeTitle) {
			System.out.println(ERROR_MESSAGE);

			return;
		}

		buildItems();
	}

	public void complete() {
		if (!_calledMakeTitle) {
			System.out.println(ERROR_MESSAGE);

			return;
		}

		buildComplete();
	}


	public abstract void buildTitle();
	public abstract void buildString();
	public abstract void buildItems();
	public abstract void buildComplete();

}
