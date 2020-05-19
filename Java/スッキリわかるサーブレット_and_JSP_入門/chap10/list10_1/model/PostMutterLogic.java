package chap10.list10_1.model;

import java.util.List;

public class PostMutterLogic {

	public void execute(Mutter mutter, List<Mutter> mutterList) {
		mutterList.add(0, mutter);
	}

}
