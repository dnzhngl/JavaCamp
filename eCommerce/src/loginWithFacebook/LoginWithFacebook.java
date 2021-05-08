package loginWithFacebook;

import java.util.ArrayList;
import java.util.List;


public class LoginWithFacebook {
	private List<Facebook> facebookAccounts;
	public LoginWithFacebook() {
		this.facebookAccounts = new ArrayList<Facebook>();
		facebookAccounts.add(new Facebook("ahmet.tas@hotmail.com","12345"));
	}
	
	
	public boolean login(String email, String password) {
		if(checkIfAccountExists(email) == null) {
			System.out.println("Facebook login error..");
			return false;
		}
		System.out.println("You have been logged in with facebook.");
		return true;
	}
	
	private Facebook checkIfAccountExists(String email) {
		return facebookAccounts.stream().filter(account -> account.getEmail().equals(email)).findFirst().orElse(null);
	}
}

