package chap10_Strategy.sample;

public class Main {

	public static void main(String[] args) {
		Strategy randomStrategy = new RandomStrategy();
		Player player = new Player("A", randomStrategy);

		Strategy inOrderStrategy = new InOrderStrategy();
		Player enemy = new Player("B", inOrderStrategy);

		for (int i=0; i < 5; i++) {
			Hand playerHand	= player.showHand();
			Hand enemyHand		= enemy.showHand();

			Result result = playerHand.fight(enemyHand);

			switch (result) {
				case DRAW:
					System.out.println("Draw");
					break;
				case WIN:
					System.out.println("Winner: " + player);
					player.addWinCount();
					break;
				case LOSE:
					System.out.println("Winner: " + enemy);
					enemy.addWinCount();
					break;
			}
		}

		System.out.format("%s: %d win\n", player,	player.getWinCount());
		System.out.format("%s: %d win\n", enemy,	enemy.getWinCount());
	}

}
