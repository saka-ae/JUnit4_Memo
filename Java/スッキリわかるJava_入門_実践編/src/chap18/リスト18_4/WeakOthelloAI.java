package chap18.リスト18_4;

public class WeakOthelloAI implements OthelloAI {

	@Override
	public String decide() {
		Class<?> classObj = this.getClass();

		return classObj.getSimpleName();
	}

}
