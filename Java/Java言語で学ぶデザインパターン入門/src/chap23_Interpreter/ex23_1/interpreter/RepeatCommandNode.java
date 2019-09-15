package chap23_Interpreter.ex23_1.interpreter;

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
	public void execute() {
		System.out.println("repeat " + _number);
		System.out.println();

		for (int i=0; i < _number; i++) {
			_commandListNode.execute();

			System.out.println();
		}
	}


	@Override
	public String toString() {
		String str = String.format("[repeat %d %s", _number, _commandListNode);

		return str;
	}

}
