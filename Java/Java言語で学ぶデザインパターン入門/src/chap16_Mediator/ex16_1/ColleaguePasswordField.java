package chap16_Mediator.ex16_1;

import java.awt.Color;

import javax.swing.JPasswordField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ColleaguePasswordField extends JPasswordField implements DocumentListener, Colleague {
	private Mediator _mediator;


	public ColleaguePasswordField(int columns) {
		super(columns);
	}


	@Override
	public void insertUpdate(DocumentEvent e) {
		_mediator.changedOfColleague(this);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		_mediator.changedOfColleague(this);
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		_mediator.changedOfColleague(this);
	}


	@Override
	public void setMediator(Mediator mediator) {
		_mediator = mediator;
	}

	@Override
	public void setColleagueState(boolean enabled) {
		super.setEnabled(enabled);

		Color color = (enabled) ? Color.white : Color.lightGray;
		setBackground(color);
	}

}
