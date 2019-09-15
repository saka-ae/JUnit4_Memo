package chap14_Chain_Of_Responsibility.ex14_4;

import static chap14_Chain_Of_Responsibility.sample.TroubleLevel.*;

import chap14_Chain_Of_Responsibility.sample.Trouble;
import chap14_Chain_Of_Responsibility.sample.TroubleLevel;

public class NormalSupport extends Support {

	public NormalSupport(String name) {
		super(name);
	}


	@Override
	protected boolean resolve(Trouble trouble) {
		TroubleLevel level = trouble.getLevel();

		return (level == Easy) || (level == Normal);
	}

}
