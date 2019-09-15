package chap22_Command.sample.print;

import chap22_Command.sample.command.Command;

public class PrintCommand implements Command {
	private String _str;


	public PrintCommand(String str) {
		_str = str;
	}


	@Override
	public void execute() {
		System.out.println(_str);
	}

}
