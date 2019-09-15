package chap23_Interpreter.ex23_1.interpreter;

import chap23_Interpreter.ex23_1.executor.Executor;

public interface Node extends Executor {

	void parse(Context context) throws ParseException;

}
