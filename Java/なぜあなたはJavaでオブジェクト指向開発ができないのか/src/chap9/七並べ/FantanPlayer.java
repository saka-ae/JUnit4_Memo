package chap9.七並べ;

import chap8.トランプゲームのフレームワーク.Card;
import chap8.トランプゲームのフレームワーク.Hand;
import chap8.トランプゲームのフレームワーク.Master;
import chap8.トランプゲームのフレームワーク.Player;
import chap8.トランプゲームのフレームワーク.Rule;
import chap8.トランプゲームのフレームワーク.Table;

public class FantanPlayer extends Player {
	private int _passConunt = 0;


	public FantanPlayer(String name, Master master, Table table, Rule rule) {
		super(name, master, table, rule);
	}


	public int getPassCount() {
		return _passConunt;
	}


	public void receiveCard(Card card) {
		if (FantanRule.isSpecialNumberCard(card)) {
			System.out.format("%s: %sを置きました。\n", this, card);

			Table table = super.getTable();
			table.putCard(card);
		} else
			super.receiveCard(card);
	}


	public void play(Player nextPlayer) {
		Hand hand = super.getHand();
		System.out.println(hand);

		Rule rule	= super.getRule();
		Table table	= super.getTable();
		Card foundCard = rule.findCard(hand, table);

		if (foundCard.isEmptyCard()) {
			_passConunt++;

			FantanMaster fantanMaster = (FantanMaster) (super.getMaster());
			fantanMaster.pass(this);

			if (FantanRule.overPassLimit(_passConunt))
				putAllCards(hand, table);
		} else {
			System.out.println(foundCard + "を置きました。");
			table.putCard(foundCard);

			System.out.println(table);

			Master master = super.getMaster();
			if (isWin(hand))
				master.declareWin(this);
		}
	}

	private void putAllCards(Hand hand, Table table) {
		for (int i=0; i < hand.getNumberOfCards(); i++) {
			Card pickedCard = hand.pick(0);
			table.putCard(pickedCard);
		}
	}

	private boolean isWin(Hand hand) {
		return hand.getNumberOfCards() == 0;
	}

}