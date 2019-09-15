package chap23_Interpreter.ex23_1;

import chap23_Interpreter.ex23_1.interpreter.Context;
import chap23_Interpreter.ex23_1.interpreter.ProgramNode;

public class Main {

	public static void main(String[] args) {
		Context context = new Context("program   repeat 3   go right left   end   end");

		ProgramNode program = new ProgramNode();

		try {
			program.parse(context);
		} catch (Exception e) {
			e.printStackTrace();
		}

		program.execute();
	}

}
