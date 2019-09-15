package chap16_Mediator.ex16_1;

import javax.swing.JButton;

public class ColleagueButton extends JButton implements Colleague {
	private Mediator _mediator;


	public ColleagueButton(String text) {
		super(text);
	}


	@Override
	public void setMediator(Mediator mediator) {
		_mediator = mediator;
	}

	@Override
	public void setColleagueState(boolean enabled) {
		super.setEnabled(enabled);
	}

}
