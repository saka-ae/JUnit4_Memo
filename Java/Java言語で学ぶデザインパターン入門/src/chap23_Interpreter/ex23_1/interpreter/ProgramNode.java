package chap23_Interpreter.ex23_1.interpreter;

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
	public void execute() {
		_commandListNode.execute();
	}


	@Override
	public String toString() {
		String str = String.format("[program %s]", _commandListNode);

		return str;
	}

}
