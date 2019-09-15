package chap23_Interpreter.sample;

import java.util.Scanner;

public class Context {
	private Scanner	_sc;
	private String		_currentToken;


	public Context(String text) {
		_sc = new Scanner(text);

		nextToken();
	}


	public void nextToken() {
		if (_sc.hasNext())
			_currentToken = _sc.next();
		else
			_currentToken = null;
	}


	public String currentToken() {
		return _currentToken;
	}

	public int currentNumber() throws ParseException {
		int number = 0;

		try {
			number = Integer.parseInt(_currentToken);
		} catch (NumberFormatException e) {
			throw new ParseException("Warning: " + e);
		}

		return number;
	}


	public void skipToken(String token) throws ParseException {
		if (!token.equals(_currentToken)) {
			String message = String.format("Warning: %s is expected, but %s is found.", token, _currentToken);

			throw new ParseException(message);
		}

		nextToken();
	}

}
