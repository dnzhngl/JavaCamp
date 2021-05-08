package loginWithGmail;

import java.util.ArrayList;
import java.util.List;

public class LoginWithGmail {
	
	private List<Gmail> gmailAccounts;
	
	public LoginWithGmail() {
		this.gmailAccounts = new ArrayList<Gmail>();
		gmailAccounts.add(new Gmail("ahmet.tas@gmail.com", "12345"));
	}
	
	
	public boolean login(String email, String password) {
		if(checkIfAccountExists(email) == null) {
			System.out.println("Gmail login error..");
			return false;
		}
		System.out.println("You have been logged in with gmail.");
		return true;
	}
	
	private Gmail checkIfAccountExists(String email) {
		return gmailAccounts.stream().filter(account -> account.getEmail().equals(email)).findFirst().orElse(null);
	}
}
