package chap23_Interpreter.sample;

public class Main {

	public static void main(String[] args) {
		Context context = new Context("program   repeat 3   go right left   end   end");

		ProgramNode program = new ProgramNode();

		try {
			program.parse(context);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(program);
	}

}
