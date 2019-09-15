package chap16_Mediator.sample;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GuiFrame extends JFrame implements Mediator {
	private ColleagueButton _button1;
	private ColleagueButton _button2;


	public GuiFrame(String title) {
		super(title);

		Container container = super.getContentPane();

		container.setLayout(new FlowLayout());

		createColleagues();

		container.add(_button1);
		container.add(_button2);

		initColleagues();

		setDisplay();
	}

	private void setDisplay() {
		int length = 300;
		super.setSize(length, length);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}


	@Override
	public void createColleagues() {
		_button1 = new ColleagueButton("button1");
		_button2 = new ColleagueButton("button2");

		_button1.setMediator(this);
		_button2.setMediator(this);
	}

	@Override
	public void initColleagues() {
		_button1.setEnabled(true);
		_button2.setEnabled(false);
	}

	@Override
	public void changedOfColleague(Colleague colleague) {
		System.out.println(colleague);

		if (colleague instanceof ColleagueButton) {
			toggleButton(_button1);
			toggleButton(_button2);
		}
	}

	private void toggleButton(ColleagueButton button) {
		if (button.isEnabled())
			button.setEnabled(false);
		else
			button.setEnabled(true);

	}

}
