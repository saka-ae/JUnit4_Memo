package chap16_Mediator.ex16_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.Document;

public class LoginFrame extends JFrame implements ActionListener, Mediator {
	private static final int COLUMNS = 8;


	private ColleagueRadioButton		_radioButtonGuest;
	private ColleagueRadioButton		_radioButtonLogin;

	private ColleagueTextField			_textUserName;
	private ColleaguePasswordField		_textPassword;

	private ColleagueButton			_buttonOk;


	public LoginFrame(String title) throws HeadlessException {
		super(title);

		Container container = super.getContentPane();

		container.setLayout(new FlowLayout());

		createColleagues();

		container.add(_radioButtonGuest);
		container.add(_radioButtonLogin);

		JLabel labelUserName = new JLabel("User Name");
		container.add(labelUserName);
		container.add(_textUserName);

		JLabel labelPassword = new JLabel("Password");
		container.add(labelPassword);
		container.add(_textPassword);

		container.add(_buttonOk);

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
	public void actionPerformed(ActionEvent e) {
		Object eventSource = e.getSource();
		if (eventSource != _buttonOk)
			return;

		printLoginInformation();
	}

	private void printLoginInformation() {
		String	userName	= _textUserName.getText();
		char[]	pass		= _textPassword.getPassword();
		String	password	= String.valueOf(pass);

		System.out.format("%s: %s\n", userName, password);
	}


	@Override
	public void createColleagues() {
		_radioButtonGuest	= new ColleagueRadioButton("Guest");
		_radioButtonLogin	= new ColleagueRadioButton("Login");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(_radioButtonGuest);
		buttonGroup.add(_radioButtonLogin);


		_textUserName	= new ColleagueTextField(COLUMNS);
		_textPassword	= new ColleaguePasswordField(COLUMNS);
		_textPassword.setEchoChar('*');


		_buttonOk		= new ColleagueButton("OK");
	}


	@Override
	public void initColleagues() {
		_radioButtonGuest.addChangeListener(_radioButtonGuest);
		_radioButtonLogin.addChangeListener(_radioButtonLogin);

		Document userNameDocument = _textUserName.getDocument();
		userNameDocument.addDocumentListener(_textUserName);

		Document passwordDocument = _textPassword.getDocument();
		passwordDocument.addDocumentListener(_textPassword);

		_buttonOk.addActionListener(this);


		_radioButtonGuest.setMediator(this);
		_radioButtonLogin.setMediator(this);

		_textUserName.setMediator(this);
		_textPassword.setMediator(this);

		_buttonOk.setMediator(this);


		_radioButtonGuest.doClick();
	}


	@Override
	public void changedOfColleague(Colleague colleague) {
		if (isRadioButton(colleague))
			radioButtonChanged();
		else if (isText(colleague))
			textChanged();
	}

	private boolean isRadioButton(Colleague colleague) {
		return (colleague == _radioButtonGuest) || (colleague == _radioButtonLogin);
	}

	private boolean isText(Colleague colleague) {
		return (colleague == _textUserName) || (colleague == _textPassword);
	}

	private void radioButtonChanged() {
		if (_radioButtonGuest.isSelected())
			setGuestMode();
		else
			setLoginMode();
	}

	private void setGuestMode() {
		_textUserName.setColleagueState(false);
		_textPassword.setColleagueState(false);

		_buttonOk.setColleagueState(true);
	}

	private void setLoginMode() {
		_textUserName.setColleagueState(true);

		textChanged();
	}

	private void textChanged() {
		String userName = _textUserName.getText();

		if (userName.length() > 0)
			setPasswordMode();
		else
			setNoUserNameMode();
	}

	private void setPasswordMode() {
		_textPassword.setColleagueState(true);

		final int MIN = 4;
		if (isValidLoginInformation())
			_buttonOk.setColleagueState(true);
		else
			_buttonOk.setColleagueState(false);
	}

	private boolean isValidLoginInformation() {
		final int MIN = 4;

		String userName = _textUserName.getText();
		char[] password = _textPassword.getPassword();

		return (userName.length() >= MIN) && (password.length >= MIN);
	}

	private void setNoUserNameMode() {
		_textPassword.setColleagueState(false);

		_buttonOk.setColleagueState(false);
	}

}
