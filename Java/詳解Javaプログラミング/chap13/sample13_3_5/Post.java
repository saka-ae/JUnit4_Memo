package chap13.sample13_3_5;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Post extends JPanel implements ActionListener {

	private JTextField nameField;
	private JTextField passwordField;
	private String postURL;
	private GridBagConstraints constraints = new GridBagConstraints();


	public Post(String postURL) {
		this.postURL = postURL;
		nameField		= new JTextField(20);
		passwordField	= new JPasswordField(20);

		JButton postButton = new JButton("Post");
		postButton.addActionListener(this);
		setLayout(new GridBagLayout());

		addGB(new JLabel("Name:"), 0, 0);
		addGB(nameField, 1, 0);

		addGB(new JLabel("Password:"), 0, 1);
		addGB(passwordField, 1, 1);

		constraints.gridwidth = 2;
		addGB(postButton, 0, 2);
	}

	private void addGB(Component component, int x, int y) {
		constraints.gridx = x;
		constraints.gridy = y;

		add(component, constraints);
	}


	public static void main(String[] args) {
		Post post = new Post(args[0]);

		JFrame frame = new JFrame("SimplePost");
		frame.getContentPane().add(post, "Center");
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		postData();
	}

	protected void postData() {
		StringBuffer sb = new StringBuffer();
		sb.append(URLEncoder.encode("Name") + "=");
		sb.append(URLEncoder.encode(nameField.getText()));

		sb.append("&" + URLEncoder.encode("Password") + "=");
		sb.append(URLEncoder.encode(passwordField.getText()));

		String formData = sb.toString();

		try {
			URL url = new URL(postURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-type",  "application/x-www-form-urlencoded");

			conn.setDoOutput(true);
			conn.setDoInput(true);

			OutputStream os = conn.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "8859_1");
			PrintWriter pw = new PrintWriter(osw, true);

			pw.print(formData);
			pw.flush();

			if (conn.getResponseCode() == HttpURLConnection.HTTP_OK)
				System.out.println("Posted ok!");
			else {
				System.out.println("Bad post...");
				return;
			}

			// レスポンスを入力ストリームで処理する
		} catch (MalformedURLException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
