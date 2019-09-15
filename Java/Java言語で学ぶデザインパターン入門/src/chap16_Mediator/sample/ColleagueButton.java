package chap16_Mediator.sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColleagueButton extends JButton implements ActionListener, Colleague {
	private Mediator _mediator;


	public ColleagueButton(String text) {
		super(text);

		super.addActionListener(this);
	}


	@Override
	public String toString() {
		return super.getText();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		_mediator.changedOfColleague(this);
	}


	@Override
	public void setMediator(Mediator mediator) {
		_mediator = mediator;
	}

}
