package chap23_Interpreter.ex23_1.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// <command list> ::= <command>* end
public class CommandListNode implements Node {
	private List<Node> _commandList = new ArrayList<>();


	@Override
	public void parse(Context context) throws ParseException {
		while (true) {
			String currentToken = context.currentToken();

			if (Objects.isNull(currentToken))
				throw new ParseException("Missing 'end'");
			else if (currentToken.equals("end")) {
				context.skipToken("end");
				break;
			} else {
				Node commandNode = new CommandNode();
				commandNode.parse(context);
				_commandList.add(commandNode);
			}
		}
	}


	@Override
	public void execute() {
		for (Node command : _commandList)
			command.execute();
	}


	@Override
	public String toString() {
		return _commandList.toString();
	}

}
