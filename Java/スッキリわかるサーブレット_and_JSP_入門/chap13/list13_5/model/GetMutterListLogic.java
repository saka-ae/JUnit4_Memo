package chap13.list13_5.model;

import java.util.List;

import chap13.list13_5.dao.MutterDAO;

public class GetMutterListLogic {

	public List<Mutter> execute() {
		MutterDAO dao = new MutterDAO();
		List<Mutter> mutterList = dao.findAll();

		return mutterList;
	}

}
