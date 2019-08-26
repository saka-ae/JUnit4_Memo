package chap8.トランプゲームのフレームワーク;

public abstract class Player {
	private String	_name;
	private Master	_master;
	private Table	_table;
	private Rule	_rule;
	private Hand	_hand = new Hand();


	public Player(String name, Master master, Table table, Rule rule) {
		_name	= name;
		_master	= master;
		_table	= table;
		_rule	= rule;
	}


	public String getName() {
		return _name;
	}

	public Hand getHand() {
		return _hand;
	}

	public Master getMaster() {
		return _master;
	}

	public Table getTable() {
		return _table;
	}

	public Rule getRule() {
		return _rule;
	}


	@Override
	public String toString() {
		return _name;
	}


	public Hand showHand() {
		return getHand();
	}


	public void receiveCard(Card card) {
		_hand.add(card);
	}


	public abstract void play(Player nextPlayer);

}