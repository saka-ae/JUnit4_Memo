package chap12.リスト12_15;

import chap12.リスト12_14.CleaningService;
import chap12.リスト12_14.Coat;
import chap12.リスト12_14.Shirt;
import chap12.リスト12_14.Towl;

public class KyotoCleaningShop implements CleaningService {
	private String _ownerName;
	private String _address;
	private String _phone;


	@Override
	public Shirt washShirt(Shirt s) {
		return s;
	}

	@Override
	public Towl washTowl(Towl t) {
		return t;
	}

	@Override
	public Coat washCoat(Coat c) {
		return c;
	}

}
