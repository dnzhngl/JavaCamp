package kodlamaio2;

public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " has been registered.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " has been deleted");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + "'s profile has been updated.");
	}
}
