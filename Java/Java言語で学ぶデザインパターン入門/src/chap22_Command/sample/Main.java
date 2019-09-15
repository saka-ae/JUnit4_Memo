package chap22_Command.sample;

import chap22_Command.sample.command.Command;
import chap22_Command.sample.command.MacroCommand;
import chap22_Command.sample.print.PrintCommand;

public class Main {

	public static void main(String[] args) {
		MacroCommand commands = new MacroCommand();

		Command command1 = new PrintCommand("1");
		commands.append(command1);

		Command command2 = new PrintCommand("2");
		commands.append(command2);

		commands.execute();

		commands.undo();
		commands.execute();
	}

}

