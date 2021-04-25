package kodlamaioExample;

public class User {
	int id;
	String firstname;
	String lastName;
	String email;
	String password;
	
	public User() {}
	public User(int id, String firstname, String lastName, String email, String password) {
		this();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
}
