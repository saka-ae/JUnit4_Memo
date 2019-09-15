package chap5_Singleton.ex5_2;

public class Triple {
	private static Triple[] _triple = new Triple[3];
	private int _id;


	static {
		for (int i=0; i < 3; i++)
			_triple[i] = new Triple(i);

	}

	private Triple(int id) {
		_id = id;
	}


	public int getId() {
		return _id;
	}


	public static Triple getInstance(int id) {
		return _triple[id];
	}

}
