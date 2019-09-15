package chap22_Command.ex22_1.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
	private Deque<Command> _commands = new ArrayDeque<>();


	@Override
	public void execute() {
		Iterator<Command> it = _commands.descendingIterator();
		while (it.hasNext()) {
			Command command = (Command) it.next();
			command.execute();
		}
	}


	public void append(Command command) {
		_commands.push(command);
	}

	public void undo() {
		if (!_commands.isEmpty())
			_commands.pop();
	}

	public void clear() {
		_commands.clear();
	}

}
