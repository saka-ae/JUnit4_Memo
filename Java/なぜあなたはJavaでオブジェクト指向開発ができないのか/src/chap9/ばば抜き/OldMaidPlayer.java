package chap9.ばば抜き;

import chap8.トランプゲームのフレームワーク.Card;
import chap8.トランプゲームのフレームワーク.Hand;
import chap8.トランプゲームのフレームワーク.Master;
import chap8.トランプゲームのフレームワーク.Player;
import chap8.トランプゲームのフレームワーク.Rule;
import chap8.トランプゲームのフレームワーク.Table;

public class OldMaidPlayer extends Player {

	public OldMaidPlayer(String name, Master master, Table table, Rule rule) {
		super(name, master, table, rule);
	}


	@Override
	public void play(Player nextPlayer) {
		Hand nextPlayerHand	= nextPlayer.showHand();
		Card card			= nextPlayerHand.pickRandom();

		System.out.format("%s: %sさんから%s を引きました\n", this, nextPlayer, card);

		if (isWin(nextPlayer))
			declareWin(nextPlayer);

		receiveCard(card);

		if (isWin(this))
			declareWin(this);
		else {
			Hand hand = super.getHand();

			System.out.format("%s: 残りの手札は %sです\n", this, hand);
		}
	}

	private boolean isWin(Player player) {
		Hand hand = player.getHand();

		return hand.getNumberOfCards() == 0;
	}

	private void declareWin(Player player) {
		Master master = player.getMaster();
		master.declareWin(player);
	}


	@Override
	public void receiveCard(Card card) {
		Rule rule		= super.getRule();
		Hand hand		= super.getHand();
		Card foundCard	= rule.findCard(hand, card);

		if (foundCard.isEmptyCard())
			super.receiveCard(card);
		else {
			System.out.print(this + ": ");

			Table table = super.getTable();
			table.putCard(card);
			table.putCard(foundCard);

			System.out.println("を捨てました");
		}
	}

}
