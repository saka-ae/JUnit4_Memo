package chap14.model;

public class Account {

	private String userId;
	private String password;
	private String mail;
	private String name;
	private int age;


	public Account(String userId, String password, String mail, String name, int age) {
		this.userId		= userId;
		this.password	= password;
		this.mail		= mail;
		this.name		= name;
		this.age		= age;
	}


	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public String getMail() {
		return mail;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
