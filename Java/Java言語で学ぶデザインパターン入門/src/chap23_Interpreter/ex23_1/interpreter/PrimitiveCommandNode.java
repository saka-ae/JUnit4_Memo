package chap23_Interpreter.ex23_1.interpreter;

import java.util.Arrays;
import java.util.List;

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode implements Node {
	private String _name;


	@Override
	public void parse(Context context) throws ParseException {
		_name = context.currentToken();
		context.skipToken(_name);

		List<String> commands = Arrays.asList("go", "right", "left");
		if (!commands.contains(_name))
			throw new ParseException(_name + " is undefined");
	}


	@Override
	public void execute() {
		System.out.println(_name);
	}


	@Override
	public String toString() {
		return _name;
	}

}
