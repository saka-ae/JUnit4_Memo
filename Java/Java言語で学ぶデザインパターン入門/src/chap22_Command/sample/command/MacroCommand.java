package chap22_Command.sample.command;

import java.util.ArrayDeque;

public class MacroCommand implements Command {
	ArrayDeque<Command> _commands = new ArrayDeque<>();

	@Override
	public void execute() {
		for (Command command : _commands)
			command.execute();
	}


	public void append(Command command) {
		_commands.push(command);
	}

	public void undo() {
		if (!_commands.isEmpty())
			_commands.pop();
	}

}
