package chap23_Interpreter.ex23_1.interpreter;

// <command> ::= <repeat command> | <primitive command>
public class CommandNode implements Node {
	private Node _node;


	@Override
	public void parse(Context context) throws ParseException {
		if (context.currentToken().equals("repeat"))
			_node = new RepeatCommandNode();
		else
			_node = new PrimitiveCommandNode();

		_node.parse(context);
	}


	@Override
	public void execute() {
		_node.execute();
	}


	@Override
	public String toString() {
		return _node.toString();
	}

}
