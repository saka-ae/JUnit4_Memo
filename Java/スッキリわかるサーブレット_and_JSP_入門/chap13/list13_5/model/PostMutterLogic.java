package chap13.list13_5.model;

import chap13.list13_5.dao.MutterDAO;

public class PostMutterLogic {

	public void execute(Mutter mutter) {
		MutterDAO dao = new MutterDAO();
		dao.create(mutter);
	}

}
