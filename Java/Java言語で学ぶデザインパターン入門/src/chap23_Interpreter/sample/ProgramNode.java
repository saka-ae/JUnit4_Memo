package chap23_Interpreter.sample;

// <program> ::= program <command list>
public class ProgramNode implements Node {
	private Node _commandListNode;


	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("program");

		_commandListNode = new CommandListNode();
		_commandListNode.parse(context);
	}


	@Override
	public String toString() {
		String str = String.format("[program %s]", _commandListNode);

		return str;
	}

}
