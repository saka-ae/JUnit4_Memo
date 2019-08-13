import static org.junit.Assert.*;

import org.junit.Test;

public class TargetTest {

	@Test
	public void アサーションが失敗すると以降の処理は実行されない() {
		System.out.println("ここは実行される");

		fail("必ず失敗するアサーション");

		System.out.println("ここは実行されない");
	}

}
