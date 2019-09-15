package chap23_Interpreter.sample;

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
	public String toString() {
		return _node.toString();
	}

}
