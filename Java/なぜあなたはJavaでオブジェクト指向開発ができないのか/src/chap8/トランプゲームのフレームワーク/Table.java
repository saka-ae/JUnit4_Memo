package chap8.トランプゲームのフレームワーク;

public interface Table {

	default public boolean existCard(Card card) {
		throw new NotImplementedException();
	}


	public abstract void putCard(Card card);

}