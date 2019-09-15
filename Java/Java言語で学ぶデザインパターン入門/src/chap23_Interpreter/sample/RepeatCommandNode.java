package chap23_Interpreter.sample;

// <repeat command> ::= repeat <number> <comman list>
public class RepeatCommandNode implements Node {
	private int	_number;
	private Node	_commandListNode;


	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("repeat");
		_number = context.currentNumber();

		context.nextToken();

		_commandListNode = new CommandListNode();
		_commandListNode.parse(context);
	}


	@Override
	public String toString() {
		String str = String.format("[repeat %d %s", _number, _commandListNode);

		return str;
	}

}
