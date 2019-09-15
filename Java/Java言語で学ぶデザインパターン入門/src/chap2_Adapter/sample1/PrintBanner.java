package chap2_Adapter.sample1;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String str) {
		super(str);
	}


	@Override
	public void printWeak() {
		super.showWithParen();
	}

	@Override
	public void printStrong() {
		super.showWithAster();
	}

}
