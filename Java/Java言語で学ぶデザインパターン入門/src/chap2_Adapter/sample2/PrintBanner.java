package chap2_Adapter.sample2;

import chap2_Adapter.sample1.Banner;
import chap2_Adapter.sample1.Print;

public class PrintBanner implements Print {
	private Banner _banner;


	public PrintBanner(String str) {
		_banner = new Banner(str);
	}


	@Override
	public void printWeak() {
		_banner.showWithParen();
	}

	@Override
	public void printStrong() {
		_banner.showWithAster();
	}

}
