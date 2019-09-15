package chap16_Mediator.ex16_1;

import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColleagueRadioButton extends JRadioButton implements ChangeListener, Colleague {
	private Mediator _mediator;


	public ColleagueRadioButton(String text) {
		super(text);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		_mediator.changedOfColleague(this);
	}


	@Override
	public void setMediator(Mediator mediator) {
		_mediator = mediator;
	}

	@Override
	public void setColleagueState(boolean enabled) { }

}
